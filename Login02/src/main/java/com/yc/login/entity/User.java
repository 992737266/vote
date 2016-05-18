package com.yc.login.entity;

public class User {
	private int id;
	private String uname;
	private String upass;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upass=" + upass + "]";
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	public User(int id, String uname, String upass) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
	}


	public User() {
		super();
	}
	
	
	
	
}
