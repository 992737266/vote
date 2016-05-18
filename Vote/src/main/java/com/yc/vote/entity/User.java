package com.yc.vote.entity;

public class User {
	private int vuid;
	private String vuusername;
	private String vupassword;
	private int vustatus;
	private int vuversion;
	
	
	public int getVuid() {
		return vuid;
	}
	public void setVuid(int vuid) {
		this.vuid = vuid;
	}
	public String getVuusername() {
		return vuusername;
	}
	public void setVuusername(String vuusername) {
		this.vuusername = vuusername;
	}
	public String getVupassword() {
		return vupassword;
	}
	public void setVupassword(String vupassword) {
		this.vupassword = vupassword;
	}
	public int getVustatus() {
		return vustatus;
	}
	public void setVustatus(int vustatus) {
		this.vustatus = vustatus;
	}
	public int getVuversion() {
		return vuversion;
	}
	public void setVuversion(int vuversion) {
		this.vuversion = vuversion;
	}
	@Override
	public String toString() {
		return "User [vuid=" + vuid + ", vuusername=" + vuusername
				+ ", vupassword=" + vupassword + ", vustatus=" + vustatus
				+ ", vuversion=" + vuversion + "]";
	}
	public User(int vuid, String vuusername, String vupassword, int vustatus,
			int vuversion) {
		super();
		this.vuid = vuid;
		this.vuusername = vuusername;
		this.vupassword = vupassword;
		this.vustatus = vustatus;
		this.vuversion = vuversion;
	}
	public User() {
		super();
	}
	
	
}
