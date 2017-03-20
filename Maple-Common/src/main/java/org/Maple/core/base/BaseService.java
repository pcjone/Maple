package org.Maple.core.base;

import com.github.pagehelper.PageInfo;

public interface BaseService<T extends BaseEntity> {
	public T selectByPrimaryKey(Object key) throws Exception;
	public Integer updateByPrimaryKey(T record) throws Exception;
	public Integer deleteByPrimaryKey(Object key) throws Exception;
	public Integer deleteByList(Object list) throws Exception;
	public Integer insert(T record) throws Exception;
	public PageInfo<T> queryForListByPage(Object key) throws Exception;
	public PageInfo<T> queryAll(Object key) throws Exception;
}
