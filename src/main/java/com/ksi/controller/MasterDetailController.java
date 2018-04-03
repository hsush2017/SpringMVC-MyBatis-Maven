package com.ksi.controller;

import java.util.List;
import java.util.Map;

import com.ksi.model.Book;

public class MasterDetailController implements IMasterDetailController<Book> {

	@Override
	public List<Book> selectMaster(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMaster(Book master) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMaster(Book master) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMaster(Book master) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object> selectDetail(Map<String, Object> params, Class<?> detailClass) {
		// TODO Auto-generated method stub
		return null;
	}


}
