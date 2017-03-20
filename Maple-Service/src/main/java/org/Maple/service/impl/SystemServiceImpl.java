package org.Maple.service.impl;

import org.Maple.Api.entity.System;
import org.Maple.core.base.BaseServiceImpl;
import org.Maple.dao.SystemMapper;
import org.Maple.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl extends BaseServiceImpl<System> implements SystemService {
	@Autowired
	private SystemMapper systemMapper;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(systemMapper);
	}
}
