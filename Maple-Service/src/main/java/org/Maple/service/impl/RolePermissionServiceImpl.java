package org.Maple.service.impl;

import org.Maple.Api.entity.RolePermission;
import org.Maple.core.base.BaseServiceImpl;
import org.Maple.dao.RolePermissionMapper;
import org.Maple.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermission> implements RolePermissionService {

		@Autowired
		private RolePermissionMapper rolePermissionMapper;
		
		@Autowired
		public void setBaseMapper(){
			super.setBaseMapper(rolePermissionMapper);
		}
}
