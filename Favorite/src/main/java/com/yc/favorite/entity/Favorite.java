package com.yc.favorite.entity;

public class Favorite {
	private int f_id; 		//网址编号
	private String f_label;	//网站名
	private String f_url;	//地址
	private String f_tags;	//分类标签名，以”,”分隔多个标签名
	private String f_desc;	//描述
	public int getf_id() {
		return f_id;
	}
	public void setf_id(int f_id) {
		this.f_id = f_id;
	}
	public String getf_label() {
		return f_label;
	}
	public void setf_label(String f_label) {
		this.f_label = f_label;
	}
	public String getf_url() {
		return f_url;
	}
	public void setf_url(String f_url) {
		this.f_url = f_url;
	}
	public String getf_tags() {
		return f_tags;
	}
	public void setf_tags(String f_tags) {
		this.f_tags = f_tags;
	}
	public String getf_desc() {
		return f_desc;
	}
	public void setf_desc(String f_desc) {
		this.f_desc = f_desc;
	}
	@Override
	public String toString() {
		return "Favorite [f_id=" + f_id + ", f_label=" + f_label + ", f_url=" + f_url
				+ ", f_tags=" + f_tags + ", f_desc=" + f_desc + "]";
	}
	public Favorite(int f_id, String f_label, String f_url, String f_tags,
			String f_desc) {
		super();
		this.f_id = f_id;
		this.f_label = f_label;
		this.f_url = f_url;
		this.f_tags = f_tags;
		this.f_desc = f_desc;
	}
	public Favorite() {
		super();
	}
	
	
}
