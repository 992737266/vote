package com.yc.vote.entity;

import java.util.List;

public class AddSubjectBean {
	private int vsId;
	private String vstitle;
	private int vs_type;
	private List<String> options;
	
	
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
	
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "AddSubjectBean [vsId=" + vsId + ", vstitle=" + vstitle
				+ ", vs_type=" + vs_type + ", options=" + options + "]";
	}
	
	
}
