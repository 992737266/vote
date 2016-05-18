package com.yc.vote.entity;

import java.util.List;

public class AddOptionBean {
	private int vsId;
	
	private List<String> options;
	private List<String> optionss;
	
	private int voorder;

	public int getVsId() {
		return vsId;
	}

	public void setVsId(int vsId) {
		this.vsId = vsId;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public int getVoorder() {
		return voorder;
	}

	public void setVoorder(int voorder) {
		this.voorder = voorder;
	}

	
	public List<String> getOptionss() {
		return optionss;
	}

	public void setOptionss(List<String> optionss) {
		this.optionss = optionss;
	}

	@Override
	public String toString() {
		return "AddOptionBean [vsId=" + vsId + ", options=" + options
				+ ", optionss=" + optionss + ", voorder=" + voorder + "]";
	}

	
}
