package org.Maple.Api.entity;

import org.Maple.core.base.BaseEntity;

/**
 * 用户角色表
 * SYS_USER_ROLE
 * @author panlei
 * @date 2017年3月13日
 */
public class UserRole extends BaseEntity{
	
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -8254207635643265273L;
	/**
	 * 用户Id
	 */
	private String userId;
	/**
	 * 角色ID
	 */
	private String roleId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
