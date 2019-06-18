package com.vo;

import java.util.Date;

public class Shopapply {
    private Integer applyno;

    private Integer shopnumber;

    private Integer adminno;

    private Date aptime;

    private Date dealtime;

    private Integer apstate;

    public Integer getApplyno() {
        return applyno;
    }

    public void setApplyno(Integer applyno) {
        this.applyno = applyno;
    }

    public Integer getShopnumber() {
        return shopnumber;
    }

    public void setShopnumber(Integer shopnumber) {
        this.shopnumber = shopnumber;
    }

    public Integer getAdminno() {
        return adminno;
    }

    public void setAdminno(Integer adminno) {
        this.adminno = adminno;
    }

    public Date getAptime() {
        return aptime;
    }

    public void setAptime(Date aptime) {
        this.aptime = aptime;
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    public Integer getApstate() {
        return apstate;
    }

    public void setApstate(Integer apstate) {
        this.apstate = apstate;
    }
}