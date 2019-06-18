package com.vo;

import java.util.Date;

public class Shangpu {
    private Integer shangjiabianhao;

    private Integer shangpuyongyouzhebianhao;

    private String shangpuyongyouzheid;

    private String shangpumingzi;

    private Date shangpushenqingshijian;

    private Date chulishenqingshijian;

    private String shangpuzhuangtai;

    private Integer shangpuzongxiaoliang;

    private Double shangpuzongshouru;
   private String time2;
   private String time3;
    public String getTime2() {
	return time2;
}

public void setTime2(String time2) {
	this.time2 = time2;
}

public String getTime3() {
	return time3;
}

public void setTime3(String time3) {
	this.time3 = time3;
}

	public Integer getShangjiabianhao() {
        return shangjiabianhao;
    }

    public void setShangjiabianhao(Integer shangjiabianhao) {
        this.shangjiabianhao = shangjiabianhao;
    }

    public Integer getShangpuyongyouzhebianhao() {
        return shangpuyongyouzhebianhao;
    }

    public void setShangpuyongyouzhebianhao(Integer shangpuyongyouzhebianhao) {
        this.shangpuyongyouzhebianhao = shangpuyongyouzhebianhao;
    }

    public String getShangpuyongyouzheid() {
        return shangpuyongyouzheid;
    }

    public void setShangpuyongyouzheid(String shangpuyongyouzheid) {
        this.shangpuyongyouzheid = shangpuyongyouzheid == null ? null : shangpuyongyouzheid.trim();
    }

    public String getShangpumingzi() {
        return shangpumingzi;
    }

    public void setShangpumingzi(String shangpumingzi) {
        this.shangpumingzi = shangpumingzi == null ? null : shangpumingzi.trim();
    }

    public Date getShangpushenqingshijian() {
        return shangpushenqingshijian;
    }

    public void setShangpushenqingshijian(Date shangpushenqingshijian) {
        this.shangpushenqingshijian = shangpushenqingshijian;
    }

    public Date getChulishenqingshijian() {
        return chulishenqingshijian;
    }

    public void setChulishenqingshijian(Date chulishenqingshijian) {
        this.chulishenqingshijian = chulishenqingshijian;
    }

    public String getShangpuzhuangtai() {
        return shangpuzhuangtai;
    }

    public void setShangpuzhuangtai(String shangpuzhuangtai) {
        this.shangpuzhuangtai = shangpuzhuangtai == null ? null : shangpuzhuangtai.trim();
    }

    public Integer getShangpuzongxiaoliang() {
        return shangpuzongxiaoliang;
    }

    public void setShangpuzongxiaoliang(Integer shangpuzongxiaoliang) {
        this.shangpuzongxiaoliang = shangpuzongxiaoliang;
    }

    public Double getShangpuzongshouru() {
        return shangpuzongshouru;
    }

    public void setShangpuzongshouru(Double shangpuzongshouru) {
        this.shangpuzongshouru = shangpuzongshouru;
    }
}