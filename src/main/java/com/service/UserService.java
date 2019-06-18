package com.service;

import org.apache.ibatis.annotations.Param;

import com.vo.Shop;
import com.vo.User;

public interface UserService {
	public User login(String userid,String password);
	public User login2(String userid,String password);
	public User login3(String userid,String password);
	public int register1(User user);
	public int register2(User user);
   public int getuserno(String userid);
   public String getuserid(int userno);
   public Shop panduanshaoexist(int ownerid);
   public User huoqvgerenxinxi(int userno);
   public int xiugaigerenxinxi(int userno,String userpassword,String useremail,String usercellphone);
   public int shanchuyonghu(int userno);
}
