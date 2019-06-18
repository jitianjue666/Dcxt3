package com.handler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.UserMapper;
import com.service.ShopService;
import com.service.UserService;
import com.vo.Shop;
import com.vo.User;

@Controller
public class UserHandler {
@Autowired
UserMapper usermapper;
@Autowired
ShopService shopService;
@Autowired
UserService userService;
@RequestMapping("/login1")
public String login(String userid,String userpassword,Model m,HttpSession session){
	

session.setAttribute("userid",userid);
session.setAttribute("userpassword", userpassword);
	m.addAttribute("userid", userid);
	m.addAttribute("userpassword", userpassword);
	User user=userService.login(userid, userpassword);
	if(user==null){
		session.setAttribute("message", "qingqvzhuce");
	return "qingqvzhuce";}
	if(user.getUserno()==0){
		session.setAttribute("message", "mimacuowu");
	return "mimacuowu";
	}
	
	else{
		Map<Integer,Integer> shopcar=new HashMap<Integer,Integer>();
		session.setAttribute("shopcar", shopcar);
		return "shoplist";}
	}
@RequestMapping("/login2")
public String login2(String userid,String userpassword,Model m,HttpSession session){
	

session.setAttribute("userid",userid);
session.setAttribute("userpassword", userpassword);

	User user=userService.login2(userid,userpassword);
	if(user==null){
		session.setAttribute("message", "qingqvzhuce");
	return "qingqvzhuce";}
	if(user.getUserno()==0){
		session.setAttribute("message", "mimacuowu");
	return "mimacuowu";
	}
	int ownerno=user.getUserno();
	Shop s=shopService.panduanzhuangtai(ownerno);
	System.out.println("**************");
	//System.out.println(s.getShopstate()==null);
	//System.out.println(s.getShopstate());
	if(s==null)
     {return "shangpushenqing";}
	else if(s.getShopstate()==0)
	{int shopno=s.getShopno();
	 session.setAttribute("s", s);
	 session.setAttribute("sno", s.getShopno());
		return "shenqingshibai";}
	else if(s.getShopstate()==1)
	{ session.setAttribute("s", s);
	session.setAttribute("sno", s.getShopno());
		return "dengdaishenhe";}
	else 
	{   session.setAttribute("s", s);
	session.setAttribute("sno", s.getShopno());
		return "shop1";}
	}
@RequestMapping("/login3")
public String login3(String userid,String userpassword,Model m,HttpSession session){
	

session.setAttribute("userid",userid);
session.setAttribute("userpassword", userpassword);
	m.addAttribute("userid", userid);
	//m.addAttribute("userno", userno);
	m.addAttribute("userpassword", userpassword);
	User user=userService.login3(userid, userpassword);
	if(user==null){
		session.setAttribute("message", "qingqvzhuce");
	return "qingqvzhuce";}
	if(user.getUserno()==0){
		session.setAttribute("message", "mimacuowu");
	return "mimacuowu";
	}
	
	else{return "quanbushenqing";}
	}
@RequestMapping("register1")
public String addUser(User user,Model m){
	user.setUserregistertime(new Date());
	userService.register1(user);
	m.addAttribute("user", user);
	return "addsuccess";
	}
@RequestMapping(value="register2")
public String addUser2(User user){
	user.setUserregistertime(new Date());
	userService.register2(user);
	//m.addAttribute("user", user);
	//Shop s=userService.panduanshaoexist(user.getUserno());

	return "login2";
	}
@RequestMapping("shopshenqing")
public String shopsq(Shop shop,Model m){
	return "waitshenhe";
}
@RequestMapping("gerenxinxi")
public String chakangerenxinxi(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int buyerno=userService.getuserno(userid);
	User user1=userService.huoqvgerenxinxi(buyerno);
	m.addAttribute("user1", user1);
	return "xiugaigerenxinxi";
}
@RequestMapping("xiugaigerenxinxi")
public String xiugaigerenxinxi(int userno,String userpassword,String useremail,String usercellphone,Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int buyerno=userService.getuserno(userid);
	//User user1=userService.huoqvgerenxinxi(buyerno);
	//m.addAttribute("user1", user1);
	userService.xiugaigerenxinxi(userno, userpassword, useremail, usercellphone);
	return "shoplist";
}
}
