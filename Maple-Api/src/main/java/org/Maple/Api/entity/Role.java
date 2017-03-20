package org.Maple.Api.entity;

import org.Maple.core.base.BaseEntity;

/**
 * 角色表
 * SYS_ROLE
 * @author panlei
 * @date 2017年3月13日
 */
public class Role extends BaseEntity{

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -1333956627908772705L;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 角色标题
	 */
	private String title;
	/**
	 * 角色描述
	 */
	private String description;
	/**
	 * 排序
	 */
	private Long orders;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getOrders() {
		return orders;
	}
	public void setOrders(Long orders) {
		this.orders = orders;
	}

	
}
