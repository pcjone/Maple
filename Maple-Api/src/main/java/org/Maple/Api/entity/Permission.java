package org.Maple.Api.entity;

import org.Maple.core.base.BaseEntity;

/**
 * 权限表
 * SYS_PERMISSION
 * @author panlei
 * @date 2017年3月13日
 */
public class Permission extends BaseEntity{
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -8954076589702349879L;
	
	/**
	 * 系统id
	 */
	private String systemId;
	/**
	 * 上级
	 */
	private String parentId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 类型(1:菜单,2:按钮)
	 */
	private Byte type; 
	/**
	 * 权限值
	 */
	private String permissionValue;
	/**
	 * 路径
	 */
	private String uri;
	/**
	 * 图片
	 */
	private String icon;
	/**
	 * 排序
	 */
	private Long orders;
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	public String getPermissionValue() {
		return permissionValue;
	}
	public void setPermissionValue(String permissionValue) {
		this.permissionValue = permissionValue;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Long getOrders() {
		return orders;
	}
	public void setOrders(Long orders) {
		this.orders = orders;
	}
	
	
}
