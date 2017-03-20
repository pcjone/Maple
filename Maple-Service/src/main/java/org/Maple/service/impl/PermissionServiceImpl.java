package org.Maple.service.impl;

import org.Maple.Api.entity.Permission;
import org.Maple.core.base.BaseServiceImpl;
import org.Maple.dao.PermissionMapper;
import org.Maple.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission> implements PermissionService {
	@Autowired
	private PermissionMapper permissionMapper;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(permissionMapper);
	}
}
