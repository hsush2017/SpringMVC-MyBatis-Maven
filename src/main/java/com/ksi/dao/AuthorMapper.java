package com.ksi.dao;

import com.ksi.model.Author;
import com.ksi.model.AuthorExample;
import java.util.List;

public interface AuthorMapper {
    int deleteByPrimaryKey(Integer pkAuthorId);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(Integer pkAuthorId);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}