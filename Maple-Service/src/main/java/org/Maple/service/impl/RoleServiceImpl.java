package org.Maple.service.impl;

import org.Maple.Api.entity.Role;
import org.Maple.core.base.BaseServiceImpl;
import org.Maple.dao.RoleMapper;
import org.Maple.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(roleMapper);
	}
}
