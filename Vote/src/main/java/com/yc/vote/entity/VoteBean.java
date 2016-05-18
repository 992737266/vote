package com.yc.vote.entity;

import java.io.Serializable;
import java.util.List;

public class VoteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int vsId;
	private String vstitle;
	private int optionCount;
	private List<Option> options;
	private int voteUserCount;
	private int vs_type;
	
	
	
	
	public int getVsId() {
		return vsId;
	}
	public void setVsId(int vsId) {
		this.vsId = vsId;
	}
	public int getVs_type() {
		return vs_type;
	}
	public void setVs_type(int vs_type) {
		this.vs_type = vs_type;
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
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	
	

	
	
	public VoteBean(int vsId, String vstitle, int optionCount,
			List<Option> options, int voteUserCount, int vs_type) {
		super();
		this.vsId = vsId;
		this.vstitle = vstitle;
		this.optionCount = optionCount;
		this.options = options;
		this.voteUserCount = voteUserCount;
		this.vs_type = vs_type;
	}
	public VoteBean() {
		super();
	}
	@Override
	public String toString() {
		return "VoteBean [vsId=" + vsId + ", vstitle=" + vstitle
				+ ", optionCount=" + optionCount + ", options=" + options
				+ ", voteUserCount=" + voteUserCount + ", vs_type=" + vs_type
				+ "]";
	}

	
	
	
}
