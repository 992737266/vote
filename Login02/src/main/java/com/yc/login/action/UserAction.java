package com.yc.login.action;


import com.opensymphony.xwork2.ModelDriven;
import com.yc.login.entity.User;
import com.yc.login.service.UserService;

public class UserAction implements ModelDriven<User> {
	public UserService userService;
	private User user;
	
	
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String login(){
		if(userService.login(user)){
			return "success";
		}else{
			return "fail";
		}
		
	}
	
	
	@Override
	public User getModel() {
		user=new User();
		return user;
	}
	
}
