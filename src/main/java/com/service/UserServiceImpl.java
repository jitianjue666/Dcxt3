package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ShopMapper;
import com.dao.UserMapper;
import com.vo.Shop;
import com.vo.User;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserMapper usermapper;
@Autowired
ShopMapper shopmapper;
	@Override
	public User login(String userid, String password) {
	System.out.println("传入的参数userid"+userid);
	System.out.println("传入的参数password"+password);
	User user=new User();
	user=usermapper.selectByLogin(userid);
	if(user!=null){
	String pass=user.getUserpassword();
	System.out.println(user.getUserid());
	System.out.println(user.getUserpassword());
	System.out.println(user.getUserno());
	System.out.println(password.equals(pass));
	if(password.equals(pass)){return user;}
	else{ User q=new User();
	q.setUserno(0);
	return q;}}
	else{return null;}
	}
	public User login2(String userid, String password) {
		System.out.println("传入的参数userid"+userid);
		System.out.println("传入的参数password"+password);
		
		if(usermapper.selectByLogin2(userid)!=null){
			User user=new User();
			user=usermapper.selectByLogin2(userid);
		String pass=user.getUserpassword();
		System.out.println(user.getUserid());
		System.out.println(user.getUserpassword());
		System.out.println(user.getUserno());
		System.out.println(password.equals(pass));
		if(password.equals(pass)){return user;}
		else{ User q=new User();
		q.setUserno(0);
		return q;}}
		else{return null;}
		}
	public User login3(String userid, String password) {
		System.out.println("传入的参数userid"+userid);
		System.out.println("传入的参数password"+password);
		User user=new User();
		user=usermapper.selectByLogin3(userid);
		if(user!=null){
		String pass=user.getUserpassword();
		System.out.println(user.getUserid());
		System.out.println(user.getUserpassword());
		System.out.println(user.getUserno());
		System.out.println(password.equals(pass));
		if(password.equals(pass)){return user;}
		else{ User q=new User();
		q.setUserno(0);
		return q;}}
		else{return null;}
		}
	@Override
	public int register1(User user) {
		usermapper.register1(user);
		return 0;
	}
	public int register2(User user) {
		usermapper.register2(user);
		return 0;
	}
	@Override
	public int getuserno(String userid) {
		// TODO Auto-generated method stub
		return usermapper.getuserno(userid);
	}
	@Override
	public String getuserid(int userno) {
		// TODO Auto-generated method stub
		return usermapper.getuserid(userno);
	}
	@Override
	public Shop panduanshaoexist(int ownerid) {
		// TODO Auto-generated method stub
		return shopmapper.panduanzhuangtai(ownerid);
	}
	@Override
	public User huoqvgerenxinxi(int userno) {
		// TODO Auto-generated method stub
		return usermapper.nogetuser(userno);
	}
	@Override
	public int xiugaigerenxinxi(int userno, String userpassword, String useremail, String usercellphone) {
		// TODO Auto-generated method stub
		return usermapper.xiugaigerenxinxi(userno, userpassword, useremail, usercellphone);
	}
	@Override
	public int shanchuyonghu(int userno) {
		usermapper.shanchuyonghu(userno);
		return 0;
	}
}
