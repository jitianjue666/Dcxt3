package com.vo;

public class Dishcategory {
    private Integer shopshopno;

    private String dcategory;

    public Integer getShopshopno() {
        return shopshopno;
    }

    public void setShopshopno(Integer shopshopno) {
        this.shopshopno = shopshopno;
    }

    public String getDcategory() {
        return dcategory;
    }

    public void setDcategory(String dcategory) {
        this.dcategory = dcategory == null ? null : dcategory.trim();
    }
}