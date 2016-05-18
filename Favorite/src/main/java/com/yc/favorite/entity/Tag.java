package com.yc.favorite.entity;

public class Tag {
	private int t_id;		//编号
	private String t_name;	//标签名
	private int t_count;		//标签下所对应的网址数量
	public int gett_id() {
		return t_id;
	}
	public void sett_id(int t_id) {
		this.t_id = t_id;
	}
	public String gett_name() {
		return t_name;
	}
	public void sett_name(String t_name) {
		this.t_name = t_name;
	}
	public int gett_count() {
		return t_count;
	}
	public void sett_count(int t_count) {
		this.t_count = t_count;
	}
	@Override
	public String toString() {
		return "Tag [t_id=" + t_id + ", t_name=" + t_name + ", t_count=" + t_count
				+ "]";
	}
	public Tag(int t_id, String t_name, int t_count) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_count = t_count;
	}
	public Tag() {
		super();
	}
	
	
}
