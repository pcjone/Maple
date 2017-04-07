package org.Maple.core.util;

import java.util.UUID;

/**
 * 获取uuid
 *
 * @author panlei
 * @date 2017年4月5日
 */
public class UuidUtil {

	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		// 去掉“-”符号
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
	}
}
