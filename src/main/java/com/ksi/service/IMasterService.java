package com.ksi.service;

import java.util.List;
import java.util.Map;

/**
 * [主檔型]作業的service介面
 * 
 * @author choYM
 *
 * @param <T>
 *            主檔model
 * @since 2018-03-22
 */
public interface IMasterService<T> {
	public List<T> select(Map<String, Object> params);

	public int insert(T master);

	public int update(T master);

	public int delete(T master);
}
