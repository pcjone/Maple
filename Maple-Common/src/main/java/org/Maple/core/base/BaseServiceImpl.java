package org.Maple.core.base;

import java.util.Map;

import org.Maple.core.util.DataUtil;
import org.Maple.core.util.StringUtil;
import org.apache.poi.ss.formula.functions.T;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public abstract class BaseServiceImpl<T extends BaseEntity>  implements BaseService<T> {
	
	private BaseMapper<T> baseMapper;
	
	protected void setBaseMapper(BaseMapper<T> baseMapper){
		this.baseMapper = baseMapper;
	}
	
	/** 启动分页查询 */
	protected void startPage(Object params) {
		Map<String,Object> map = (Map<String,Object>)params;
		if (DataUtil.isEmpty(map.get("pageNum"))) {
			map.put("pageNum", 1);
		}
		if (DataUtil.isEmpty(map.get("pageSize"))) {
			map.put("pageSize", 10);
		}
		if (DataUtil.isNotEmpty(map.get("sort"))) {
			map.put(
					"orderBy",
					StringUtil.getOrderCondition(String.valueOf(map.get("sort")),
							String.valueOf(map.get("order"))));
		}
		PageHelper.startPage(map);
	}

	@Override
	public T selectByPrimaryKey(Object key) throws Exception {
		return (T)baseMapper.selectByPrimaryKey(key);
	}

	@Override
	public Integer updateByPrimaryKey(T record) throws Exception {
		return baseMapper.updateByPrimaryKey(record);
	}

	@Override
	public Integer deleteByPrimaryKey(Object key) throws Exception {
		return baseMapper.deleteByPrimaryKey(key);
	}

	@Override
	public Integer deleteByList(Object list) throws Exception {
		return baseMapper.deleteByList(list);
	}

	@Override
	public Integer insert(T record) throws Exception {
		return baseMapper.insert(record);
	}

	@Override
	public PageInfo<T> queryForListByPage(Object key) throws Exception {
		startPage(key);
		Page<T> list = baseMapper.queryForListByPage(key);
		PageInfo<T> pageInfo = new PageInfo<T>(list);
		return pageInfo;
	}

	@Override
	public PageInfo<T> queryAll(Object key) throws Exception {
		Page<T> list = baseMapper.queryForListByPage(key);
		PageInfo<T> pageInfo = new PageInfo<T>(list);
		return pageInfo;
	}

}
