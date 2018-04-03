package com.ksi.dao;

import com.ksi.model.Book;
import com.ksi.model.BookExample;
import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer pkBookId);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(Integer pkBookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}