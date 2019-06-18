package com.vo;

import java.util.Date;

public class Sq {
    private String shopname;

    private Date shopapplytime;

    private String dcategory;

    private Long sozjno;

    private String soname;

    private byte[] sphoto;

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Date getShopapplytime() {
        return shopapplytime;
    }

    public void setShopapplytime(Date shopapplytime) {
        this.shopapplytime = shopapplytime;
    }

    public String getDcategory() {
        return dcategory;
    }

    public void setDcategory(String dcategory) {
        this.dcategory = dcategory == null ? null : dcategory.trim();
    }

    public Long getSozjno() {
        return sozjno;
    }

    public void setSozjno(Long sozjno) {
        this.sozjno = sozjno;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname == null ? null : soname.trim();
    }

    public byte[] getSphoto() {
        return sphoto;
    }

    public void setSphoto(byte[] sphoto) {
        this.sphoto = sphoto;
    }
}