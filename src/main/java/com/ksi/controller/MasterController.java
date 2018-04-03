package com.ksi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ksi.model.Book;
import com.ksi.service.MasterService;

/**
 * [主檔型]作業的controller範例
 * 
 * @author choYM
 * @since 2018-03-22
 */
@RestController
@RequestMapping("/example/master")
public class MasterController implements IMasterController<Book> {
	@Autowired
	private MasterService service;

	@Override
	public List<Book> select(@RequestParam Map<String, Object> params) {
		List<Book> list = new ArrayList<>(this.service.select(params));

		// trigger lazy load
		for (Book book : list) {
			book.getAuthors();
		}

		return list;
	}

	@Override
	public int insert(@RequestBody Book master) {
		return this.service.insert(master);
	}

	@Override
	public int update(@RequestBody Book master) {
		return this.service.update(master);
	}

	@Override
	public int delete(@RequestBody Book master) {
		return this.service.delete(master);
	}
}
