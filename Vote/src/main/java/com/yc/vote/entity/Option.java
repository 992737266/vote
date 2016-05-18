package com.yc.vote.entity;

public class Option {
	private int voId;
	
	private String vooption;
	
	private int vsId;
	
	private int voorder;

	public int getVoId() {
		return voId;
	}

	public void setVoId(int voId) {
		this.voId = voId;
	}

	public String getVooption() {
		return vooption;
	}

	public void setVooption(String vooption) {
		this.vooption = vooption;
	}

	public int getvsId() {
		return vsId;
	}

	public void setvsId(int vsId) {
		this.vsId = vsId;
	}

	public int getVoorder() {
		return voorder;
	}

	public void setVoorder(int voorder) {
		this.voorder = voorder;
	}

	@Override
	public String toString() {
		return "\nOption [voId=" + voId + ", vooption=" + vooption + ", vsId="
				+ vsId + ", voorder=" + voorder + "]";
	}

	public Option(String vooption, int vsId, int voorder) {
		super();
		this.vooption = vooption;
		this.vsId = vsId;
		this.voorder = voorder;
	}

	public Option() {
		super();
	}

}
