package com.lp.vote.entity;

public class User {
    private Long vuid;

    private String vuusername;

    private String vupassword;

    private Integer vustatus;

    private Long vuversion;

   
    
    

    public User() {
		super();
	}

	public User(Long vuid, String vuusername, String vupassword,
			Integer vustatus, Long vuversion) {
		super();
		this.vuid = vuid;
		this.vuusername = vuusername;
		this.vupassword = vupassword;
		this.vustatus = vustatus;
		this.vuversion = vuversion;
	}

    public Long getVuid() {
        return vuid;
    }

	public void setVuid(Long vuid) {
        this.vuid = vuid;
    }

    public String getVuusername() {
        return vuusername;
    }

    public void setVuusername(String vuusername) {
        this.vuusername = vuusername == null ? null : vuusername.trim();
    }

    public String getVupassword() {
        return vupassword;
    }

    public void setVupassword(String vupassword) {
        this.vupassword = vupassword == null ? null : vupassword.trim();
    }

    public Integer getVustatus() {
        return vustatus;
    }

    public void setVustatus(Integer vustatus) {
        this.vustatus = vustatus;
    }

    public Long getVuversion() {
        return vuversion;
    }

    public void setVuversion(Long vuversion) {
        this.vuversion = vuversion;
    }



	@Override
	public String toString() {
		return "User [vuid=" + vuid + ", vuusername=" + vuusername
				+ ", vupassword=" + vupassword + ", vustatus=" + vustatus
				+ ", vuversion=" + vuversion + "]";
	}
    
}