package org.Maple.Api.entity;

import org.Maple.core.base.BaseEntity;

/**
 * 角色权限表
 * SYS_ROLE_PERMISSION
 * @author panlei
 * @date 2017年3月13日
 */
public class RolePermission extends BaseEntity{

	/**
	 * @Fields serialVersionUID : 角色权限序列化
	 */
	private static final long serialVersionUID = 1661671754276975271L;
	/**
	 * 角色ID
	 */
	private String role_id;
	/**
	 * 权限ID
	 */
	private String permission_id;
	
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(String permission_id) {
		this.permission_id = permission_id;
	}

	
}
