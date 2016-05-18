package com.yc.login.service.impl;

import com.yc.login.entity.User;
import com.yc.login.mapper.UserMapper;
import com.yc.login.service.UserService;

public class UserServiceImpl implements UserService {
	private UserMapper userMapper;
	
	

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}



	@Override
	public boolean login(User user) {
		return userMapper.getUser(user)!=null;
	}
	
}
