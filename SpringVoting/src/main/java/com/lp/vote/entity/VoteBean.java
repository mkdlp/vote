package com.lp.vote.entity;

import java.util.List;

public class VoteBean {
	private String vsTitle;
	
	private List<Option> options;
	
	private int optionCount;
	    
	private int voteUserCount;
	
	private int VS_TYPE;
	
	private int vsId;
	
	
	

	public VoteBean() {
		super();
	}


	public VoteBean(String vsTitle, List<Option> options, int optionCount,
			int voteUserCount) {
		super();
		this.vsTitle = vsTitle;
		this.options = options;
		this.optionCount = optionCount;
		this.voteUserCount = voteUserCount;
	}

	
	
	
	public int getVS_TYPE() {
		return VS_TYPE;
	}


	public void setVS_TYPE(int vS_TYPE) {
		VS_TYPE = vS_TYPE;
	}


	public String getVsTitle() {
		return vsTitle;
	}


	public void setVsTitle(String vsTitle) {
		this.vsTitle = vsTitle;
	}


	public List<Option> getOptions() {
		return options;
	}


	public void setOptions(List<Option> options) {
		this.options = options;
	}


	public int getOptionCount() {
		return optionCount;
	}


	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}


	public int getVoteUserCount() {
		return voteUserCount;
	}


	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}

	
	
	public int getVsId() {
		return vsId;
	}


	public void setVsId(int vsId) {
		this.vsId = vsId;
	}


	@Override
	public String toString() {
		return "VoteBean [vsTitle=" + vsTitle + ", options=" + options
				+ ", optionCount=" + optionCount + ", voteUserCount="
				+ voteUserCount + ", VS_TYPE=" + VS_TYPE + ", vsId=" + vsId
				+ "]";
	}


	


	
	
	
}
