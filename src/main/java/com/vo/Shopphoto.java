package com.vo;

public class Shopphoto {
    private Integer sno;

    private Long sozjno;

    private String soname;

    private byte[] sphoto;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
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