package org.Maple.service.impl;

import org.Maple.Api.entity.UserRole;
import org.Maple.core.base.BaseServiceImpl;
import org.Maple.dao.UserRoleMapper;
import org.Maple.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole> implements UserRoleService {
	
	@Autowired
	private UserRoleMapper userRoleMappr;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(userRoleMappr);
	}
}
