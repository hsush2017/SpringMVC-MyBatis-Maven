package com.ksi.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ksi.dao.BookMapper;
import com.ksi.model.Book;
import com.ksi.model.BookExample;

/**
 * [主檔型]作業的service範例
 * 
 * @author choYM
 * @since 2018-03-22
 */
@Service
public class MasterService implements IMasterService<Book> {
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<Book> select(Map<String, Object> params) {
		// 取得where條件
		int bookId = Integer.parseInt((String) params.get("bookId"));

		// 透過criteria產生sql
		BookExample example = new BookExample();
		example.createCriteria().andPkBookIdEqualTo(bookId);

		// 回傳查詢結果
		return this.bookMapper.selectByExample(example);
	}

	@Override
	@Transactional
	public int insert(Book t) {
		return this.bookMapper.insert(t);
	}

	@Override
	@Transactional
	public int update(Book t) {
		return this.bookMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	@Transactional
	public int delete(Book t) {
		return this.bookMapper.deleteByPrimaryKey(t.getPkBookId());
	}

}
