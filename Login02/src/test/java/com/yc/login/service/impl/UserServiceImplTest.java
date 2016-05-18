package com.yc.login.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.login.entity.User;
import com.yc.login.service.UserService;

public class UserServiceImplTest {

	@Test
	public void testLogin() {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("spring.xml");
		UserService us=(UserService) cxt.getBean("userService");
		User user =new User(1,"admin","a");
		boolean result=us.login(user);
		
		assertEquals(true,result);
	}

}
