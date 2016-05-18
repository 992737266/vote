package com.yc.vote.entity;

import java.io.Serializable;
import java.util.List;

public class OptionBean implements Serializable{

	private static final long serialVersionUID = 4919688700643555101L;
	
	private String vstitle;
	private int optionCount;
	private List<Integer> voteOptionCount;
	private int voteUserCount;
	
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
	public List<Integer> getVoteOptionCount() {
		return voteOptionCount;
	}
	public void setVoteOptionCount(List<Integer> voteOptionCount) {
		this.voteOptionCount = voteOptionCount;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "\nOptionBean [vstitle=" + vstitle + ", optionCount="
				+ optionCount + ", voteOptionCount=" + voteOptionCount
				+ ", voteUserCount=" + voteUserCount + "]";
	}
	
	

}
