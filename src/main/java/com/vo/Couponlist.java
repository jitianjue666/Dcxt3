package com.vo;

public class Couponlist {
    private Integer cid;

    private Integer uuie;

    private Double fm;

    private Double mm;

    private String sna;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUuie() {
        return uuie;
    }

    public void setUuie(Integer uuie) {
        this.uuie = uuie;
    }

    public Double getFm() {
        return fm;
    }

    public void setFm(Double fm) {
        this.fm = fm;
    }

    public Double getMm() {
        return mm;
    }

    public void setMm(Double mm) {
        this.mm = mm;
    }

    public String getSna() {
        return sna;
    }

    public void setSna(String sna) {
        this.sna = sna == null ? null : sna.trim();
    }
}