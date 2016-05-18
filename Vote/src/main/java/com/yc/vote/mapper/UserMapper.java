package com.yc.vote.mapper;

import com.yc.vote.entity.User;

public interface UserMapper {
	//登录
	User getUserByUser(User user);
	//注册
	User insertUser(User user);
	
}
