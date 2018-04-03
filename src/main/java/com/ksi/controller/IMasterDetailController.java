package com.ksi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface IMasterDetailController<M> {
	@RequestMapping(method = RequestMethod.GET, value = "/GET/m", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<M> selectMaster(@RequestParam Map<String, Object> params);
	
	@RequestMapping(method = RequestMethod.POST, value = "/POST/m", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int insertMaster(@RequestBody M master);

	@RequestMapping(method = RequestMethod.PUT, value = "/PUT/m", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int updateMaster(M master);

	@RequestMapping(method = RequestMethod.DELETE, value = "/DELETE/m", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int deleteMaster(M master);
	
	@RequestMapping(method = RequestMethod.GET, value = "/GET/d", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Object> selectDetail(@RequestParam Map<String, Object> params, Class<?> detailClass);
}
