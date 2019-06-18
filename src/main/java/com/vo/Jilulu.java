package com.vo;

import java.util.Date;

public class Jilulu {
    private Integer bid;

    private String sn;

    private Double zonghuafei;

    private String zt;

    private Integer ono;

    private Integer sid;
    
    private Double shijihuafei;
    private String starttime;
    private String overtime;
   

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public Double getShijihuafei() {
		return shijihuafei;
	}

	public void setShijihuafei(Double shijihuafei) {
		this.shijihuafei = shijihuafei;
	}

	private Shouru shouru;
    public Shouru getShouru() {
		return shouru;
	}

	public void setShouru(Shouru shouru) {
		this.shouru = shouru;
	}

	public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Double getZonghuafei() {
        return zonghuafei;
    }

    public void setZonghuafei(Double zonghuafei) {
        this.zonghuafei = zonghuafei;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public Integer getOno() {
        return ono;
    }

    public void setOno(Integer ono) {
        this.ono = ono;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}