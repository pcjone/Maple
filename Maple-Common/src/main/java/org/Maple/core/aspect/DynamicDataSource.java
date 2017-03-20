package org.Maple.core.aspect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * ClassName: DynamicDataSource <br/>
 * Function: 动态获取数据源 <br/>
 * date: 2017年2月28日 上午9:29:21 <br/>
 * 
 * @author panlei
 * @version
 * @since JDK 1.7
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	public static Map<String, List<String>> METHODTYPE = new HashMap<String, List<String>>();

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDataSourceType();
	}

	// 设置方法名前缀对应的数据源
	public void setMethodType(Map<String, String> map) {
		for (String key : map.keySet()) {
			List<String> v = new ArrayList<String>();
			String[] types = map.get(key).split(",");
			for (String type : types) {
				if (StringUtils.isNotBlank(type)) {
					v.add(type);
				}
			}
			METHODTYPE.put(key, v);
		}
	}

}
