package com.vo;

import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class User {
    private Integer userno;

    private Integer usercategory;

    private String userpassword;

    private String userid;

    private String useremail;

    private Long usercellphone;

    private Date userregistertime;
    private Integer userstate;

    public Integer getUserstate() {
		return userstate;
	}

	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}

	public Integer getUserno() {
        return userno;
    }

    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    public Integer getUsercategory() {
        return usercategory;
    }

    public void setUsercategory(Integer usercategory) {
        this.usercategory = usercategory;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public Long getUsercellphone() {
        return usercellphone;
    }

    public void setUsercellphone(Long usercellphone) {
        this.usercellphone = usercellphone;
    }

    public Date getUserregistertime() {
        return userregistertime;
    }

    public void setUserregistertime(Date userregistertime) {
        this.userregistertime = userregistertime;
    }
}