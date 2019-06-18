package com.vo;

import java.util.Date;

public class Xiaofeizhe {
    private Integer xiaofeizhebianhao;

    private String xiaofeizheid;

    private String xiaofeizhemima;

    private String xiaofeizheyouxiang;

    private Long xiaofeizhedianhua;

    private Date xiaofeizhezhuceshijian;

    private Integer xiaofeizhexiadancishu;

    private Double xiaofeizhegongjixiaofeijine;
 private String time1;
    public String getTime1() {
	return time1;
}

public void setTime1(String time1) {
	this.time1 = time1;
}

	public Integer getXiaofeizhebianhao() {
        return xiaofeizhebianhao;
    }

    public void setXiaofeizhebianhao(Integer xiaofeizhebianhao) {
        this.xiaofeizhebianhao = xiaofeizhebianhao;
    }

    public String getXiaofeizheid() {
        return xiaofeizheid;
    }

    public void setXiaofeizheid(String xiaofeizheid) {
        this.xiaofeizheid = xiaofeizheid == null ? null : xiaofeizheid.trim();
    }

    public String getXiaofeizhemima() {
        return xiaofeizhemima;
    }

    public void setXiaofeizhemima(String xiaofeizhemima) {
        this.xiaofeizhemima = xiaofeizhemima == null ? null : xiaofeizhemima.trim();
    }

    public String getXiaofeizheyouxiang() {
        return xiaofeizheyouxiang;
    }

    public void setXiaofeizheyouxiang(String xiaofeizheyouxiang) {
        this.xiaofeizheyouxiang = xiaofeizheyouxiang == null ? null : xiaofeizheyouxiang.trim();
    }

    public Long getXiaofeizhedianhua() {
        return xiaofeizhedianhua;
    }

    public void setXiaofeizhedianhua(Long xiaofeizhedianhua) {
        this.xiaofeizhedianhua = xiaofeizhedianhua;
    }

    public Date getXiaofeizhezhuceshijian() {
        return xiaofeizhezhuceshijian;
    }

    public void setXiaofeizhezhuceshijian(Date xiaofeizhezhuceshijian) {
        this.xiaofeizhezhuceshijian = xiaofeizhezhuceshijian;
    }

    public Integer getXiaofeizhexiadancishu() {
        return xiaofeizhexiadancishu;
    }

    public void setXiaofeizhexiadancishu(Integer xiaofeizhexiadancishu) {
        this.xiaofeizhexiadancishu = xiaofeizhexiadancishu;
    }

    public Double getXiaofeizhegongjixiaofeijine() {
        return xiaofeizhegongjixiaofeijine;
    }

    public void setXiaofeizhegongjixiaofeijine(Double xiaofeizhegongjixiaofeijine) {
        this.xiaofeizhegongjixiaofeijine = xiaofeizhegongjixiaofeijine;
    }
}