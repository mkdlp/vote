package com.lp.vote.entity;

public class Item {
    private int viid;

    private int voId;

    private int vsId;

    private int vuId;

    public Item() {
		super();
	}


	public Item(int viid, int voId, int vsId, int vuId) {
		super();
		this.viid = viid;
		this.voId = voId;
		this.vsId = vsId;
		this.vuId = vuId;
	}
   
    
    public int getViid() {
        return viid;
    }


	public void setViid(int viid) {
        this.viid = viid;
    }

    

    public int getVoId() {
		return voId;
	}


	public void setVoId(int voId) {
		this.voId = voId;
	}




    public int getVsId() {
		return vsId;
	}


	public void setVsId(int vsId) {
		this.vsId = vsId;
	}




	public int getVuId() {
		return vuId;
	}


	public void setVuId(int vuId) {
		this.vuId = vuId;
	}


	@Override
	public String toString() {
		return "Item [viid=" + viid + ", voId=" + voId + ", vsId=" + vsId
				+ ", vuid=" + vuId + "]";
	}
    
}