package com.yc.vote.entity;

public class Subject {
	private int vsId;
	private String vstitle;
	private int vs_type;
	
	
	
	


	public int getVsId() {
		return vsId;
	}



	public void setVsId(int vsId) {
		this.vsId = vsId;
	}



	public String getVstitle() {
		return vstitle;
	}



	public void setVstitle(String vstitle) {
		this.vstitle = vstitle;
	}



	public int getVs_type() {
		return vs_type;
	}



	public void setVs_type(int vs_type) {
		this.vs_type = vs_type;
	}



	@Override
	public String toString() {
		return "Subject [vsId=" + vsId + ", vstitle=" + vstitle + ", vs_type="
				+ vs_type + "]";
	}



	public Subject(int vsId, String vstitle, int vs_type) {
		super();
		this.vsId = vsId;
		this.vstitle = vstitle;
		this.vs_type = vs_type;
	}



	public Subject() {
		super();
	}
	
	
}
