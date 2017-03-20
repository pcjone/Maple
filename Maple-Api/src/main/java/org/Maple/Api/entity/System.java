package org.Maple.Api.entity;

import org.Maple.core.base.BaseEntity;

/**
 * 系统表
 * SYS_SYSTEM
 * @author panlei
 * @date 2017年3月13日
 */
public class System extends BaseEntity{

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -1884246846455222303L;
	/**
	 * 系统图标
	 */
	private String icon;
	/**
	 * 路径
	 */
	private String basepath;
	/**
	 * 系统名称
	 */
	private String systemName;
	/**
	 * 系统标题
	 */
	private String title;
	/**
	 * 系统描述
	 */
	private String description;
	/**
	 * 排序
	 */
	private Long orders;
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getBasepath() {
		return basepath;
	}
	public void setBasepath(String basepath) {
		this.basepath = basepath;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
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
