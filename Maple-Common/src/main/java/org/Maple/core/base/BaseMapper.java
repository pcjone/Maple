package org.Maple.core.base;

import com.github.pagehelper.Page;

/**
 * 公用mapper基类
 *
 * @author panlei
 * @date 2017年3月14日
 */
public abstract interface BaseMapper<T extends BaseEntity>  {
	/**
	 * 
	 * @Title: selectByPrimaryKey
	 * @Description: 根据主键查询
	 * @param @param key
	 * @param @return
	 * @param @throws Exception
	 * @return T
	 * @throws
	 */
	public T selectByPrimaryKey(Object key) throws Exception;
	/**
	 * 
	 * @Title: updateByPrimaryKey
	 * @Description: 根据主键更新
	 * @param @param record
	 * @param @return
	 * @param @throws Exception
	 * @return Integer
	 * @throws
	 */
	public Integer updateByPrimaryKey(T record) throws Exception;
	/**
	 * 
	 * @Title: deleteByPrimaryKey
	 * @Description: 根据主键删除
	 * @param @param key
	 * @param @return
	 * @param @throws Exception
	 * @return Integer
	 * @throws
	 */
	public Integer deleteByPrimaryKey(Object key) throws Exception;
	/**
	 * 
	 * @Title: deleteByList
	 * @Description: 根据集合注解删除
	 * @param @param list
	 * @param @return
	 * @param @throws Exception
	 * @return Integer
	 * @throws
	 */
	public Integer deleteByList(Object list) throws Exception;
	
	/**
	 * 
	 * @Title: insert
	 * @Description: 插入对象
	 * @param @param record
	 * @param @return
	 * @param @throws Exception
	 * @return Integer
	 * @throws
	 */
	public Integer insert(T record) throws Exception;
	/**
	 * 
	 * @Title: queryForListByPage
	 * @Description: 分页查询
	 * @param @param key
	 * @param @return
	 * @param @throws Exception
	 * @return Page<T>
	 * @throws
	 */
	public Page<T> queryForListByPage(Object key) throws Exception;
	/**
	 * 
	 * @Title: queryAll
	 * @Description: 查询
	 * @param @param key
	 * @param @return
	 * @param @throws Exception
	 * @return Page<T>
	 * @throws
	 */
	public Page<T> queryAll(Object key) throws Exception;
}
