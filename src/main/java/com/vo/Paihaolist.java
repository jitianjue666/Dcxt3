package com.vo;

public class Paihaolist {
    private Integer buyerid;

    private Integer sellerid;

    private Integer paihao;

    private Integer zhuangtai;

    private Integer ordernumber;
    public Integer getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(Integer ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getPaihao() {
        return paihao;
    }

    public void setPaihao(Integer paihao) {
        this.paihao = paihao;
    }

    public Integer getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(Integer zhuangtai) {
        this.zhuangtai = zhuangtai;
    }
}