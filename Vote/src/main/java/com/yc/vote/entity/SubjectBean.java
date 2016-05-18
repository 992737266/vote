package com.yc.vote.entity;

import java.io.Serializable;
import java.util.List;

public class SubjectBean implements Serializable {
	
	private static final long serialVersionUID = 4923324687366705818L;
	private int vsid;
	private String vstitle;
	private int optionCount;
	private int itemCount;
	private List<Option> options;
	
	
	public int getVsid() {
		return vsid;
	}
	public void setVsid(int vsid) {
		this.vsid = vsid;
	}
	public String getVstitle() {
		return vstitle;
	}
	public void setVstitle(String vstitle) {
		this.vstitle = vstitle;
	}
	public int getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
	public List<Option> getOption() {
		return options;
	}
	public void setOption(List<Option> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "SubjectBean [vsid=" + vsid + ", vstitle=" + vstitle
				+ ", optionCount=" + optionCount + ", itemCount=" + itemCount
				+ ", options=" + options + "]";
	}
}
