package org.Maple.service.impl;

import org.Maple.Api.entity.User;
import org.Maple.core.base.BaseServiceImpl;
import org.Maple.dao.UserMapper;
import org.Maple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(userMapper);
	}
	
}
