package org.Maple.Api.enums;
/**
 * 基础数据枚举
 *
 * @author panlei
 * @date 2017年4月5日
 */
public enum BaseEnums {
	//状态
	BaseStatusYes("0","正常"),BaseStatusNo("1","锁定"),
	//是否删除
	BaseDeletedYes("1","删除"),BaseDeletedNo("0","正常"),
	//权限菜单／按钮枚举
	PermissionMenu("1","菜单"),PermissionBtn("2","按钮");
	
	public String key;
	public String value;
	
	BaseEnums(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public static String get(String key) {
		BaseEnums[] values = BaseEnums.values();
        for (BaseEnums object : values) {
            if (object.key.equals(key)) {
                return object.value;
            }
        }
        return null;
    }

    public static String getKey(String value) {
    	BaseEnums[] values = BaseEnums.values();
        for (BaseEnums object : values) {
            if (object.value.equals(value)) {
                return object.key;
            }
        }
        return null;
    }
	
}
