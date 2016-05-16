package com.lp.vote.entity;

public class SubjectBean {
	private Long vsid;

    private String vstitle;

    private Integer vsType;
    
    private int optionCount;
    
    private int voteUserCount;
    
    

	public SubjectBean() {
		super();
	}



	public SubjectBean(Long vsid, String vstitle, Integer vsType,
			int optionCount, int voteUserCount) {
		super();
		this.vsid = vsid;
		this.vstitle = vstitle;
		this.vsType = vsType;
		this.optionCount = optionCount;
		this.voteUserCount = voteUserCount;
	}



	public Long getVsid() {
		return vsid;
	}



	public void setVsid(Long vsid) {
		this.vsid = vsid;
	}



	public String getVstitle() {
		return vstitle;
	}



	public void setVstitle(String vstitle) {
		this.vstitle = vstitle;
	}



	public Integer getVsType() {
		return vsType;
	}



	public void setVsType(Integer vsType) {
		this.vsType = vsType;
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



	@Override
	public String toString() {
		return "SubjectBean [vsid=" + vsid + ", vstitle=" + vstitle
				+ ", vsType=" + vsType + ", optionCount=" + optionCount
				+ ", voteUserCount=" + voteUserCount + "]";
	}
    
    
}
