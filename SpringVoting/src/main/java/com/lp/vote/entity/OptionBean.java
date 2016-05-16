package com.lp.vote.entity;

import java.util.List;

public class OptionBean {
	private String vsTitle;
	private int optionCount;
	private List<Integer> voteOptionCount;
	private int voteUserCount;
	
	public OptionBean() {
		super();
	}

	public OptionBean(String vsTitle, int optionCount,
			List<Integer> voteOptionCount, int voteUserCount) {
		super();
		this.vsTitle = vsTitle;
		this.optionCount = optionCount;
		this.voteOptionCount = voteOptionCount;
		this.voteUserCount = voteUserCount;
	}

	public String getVsTitle() {
		return vsTitle;
	}

	public void setVsTitle(String vsTitle) {
		this.vsTitle = vsTitle;
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

	@Override
	public String toString() {
		return "OptionBean [vsTitle=" + vsTitle + ", optionCount="
				+ optionCount + ", voteOptionCount=" + voteOptionCount
				+ ", voteUserCount=" + voteUserCount + "]";
	}
	
	
	
}
