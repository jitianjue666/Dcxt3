package com.vo;

import java.util.Date;

public class Shop {
    private Integer shopno;

    private Integer ownerno;

    private String shopname;

    private Integer shopstate;

    private Date shopapplytime;

    private Date shopadopttime;

    private Integer shopvolume;

    private String dcategory;
    
    private Shopphoto shopphoto;
    
    private Shopapply shopapply;
    
    private User user;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Shopphoto getShopphoto() {
		return shopphoto;
	}

	public void setShopphoto(Shopphoto shopphoto) {
		this.shopphoto = shopphoto;
	}

	public Shopapply getShopapply() {
		return shopapply;
	}

	public void setShopapply(Shopapply shopapply) {
		this.shopapply = shopapply;
	}

	public Integer getShopno() {
        return shopno;
    }

    public void setShopno(Integer shopno) {
        this.shopno = shopno;
    }

    public Integer getOwnerno() {
        return ownerno;
    }

    public void setOwnerno(Integer ownerno) {
        this.ownerno = ownerno;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Integer getShopstate() {
        return shopstate;
    }

    public void setShopstate(Integer shopstate) {
        this.shopstate = shopstate;
    }

    public Date getShopapplytime() {
        return shopapplytime;
    }

    public void setShopapplytime(Date shopapplytime) {
        this.shopapplytime = shopapplytime;
    }

    public Date getShopadopttime() {
        return shopadopttime;
    }

    public void setShopadopttime(Date shopadopttime) {
        this.shopadopttime = shopadopttime;
    }

    public Integer getShopvolume() {
        return shopvolume;
    }

    public void setShopvolume(Integer shopvolume) {
        this.shopvolume = shopvolume;
    }

    public String getDcategory() {
        return dcategory;
    }

    public void setDcategory(String dcategory) {
        this.dcategory = dcategory == null ? null : dcategory.trim();
    }
}