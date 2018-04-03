package com.ksi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * [主檔型]作業的controller介面
 * 
 * @author choYM
 *
 * @param <T>
 *            主檔model
 * @since 2018-03-22
 */
public interface IMasterController<T> {
	@RequestMapping(method = RequestMethod.GET, value = "/GET", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<T> select(@RequestParam Map<String, Object> params);

	@RequestMapping(method = RequestMethod.POST, value = "/POST", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int insert(@RequestBody T master);

	@RequestMapping(method = RequestMethod.PUT, value = "/PUT", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int update(T master);

	@RequestMapping(method = RequestMethod.DELETE, value = "/DELETE", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int delete(T master);
}
