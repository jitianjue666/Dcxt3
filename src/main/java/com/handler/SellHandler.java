package com.handler;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.restDemo.RestTest;
import net.sf.json.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.GlyService;
import com.service.SellService;
import com.service.ShopService;
import com.service.UserService;
import com.vo.Coupon;
import com.vo.Couponlist;
import com.vo.Dish;
import com.vo.Jilulu;
import com.vo.Order;
import com.vo.Paihaolist;
import com.vo.Shouru;
import com.vo.User;
import com.restDemo.RestTest;
@Controller
public class SellHandler {
@Autowired
GlyService glyservice;
@Autowired
ShopService shopservice;
@Autowired
UserService userservice;
@Autowired
SellService sellservice;
@RequestMapping(value="/foodplus",method = RequestMethod.POST)
public void jairugouwuche(HttpServletRequest request,HttpServletResponse response,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int dishid=Integer.valueOf(request.getParameter("dishid"));
//	Map<Integer,Integer> shopcar=new HashMap<Integer,Integer>() ;
	Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
	//for (Map.Entry<Integer, Integer> entry : shopcar.entrySet()) { 
		  //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		if(shopcar.containsKey(dishid)){
			shopcar.put(dishid, shopcar.get(dishid)+1);
			}
		else{
			shopcar.put(dishid, 1);
			}
		//}
		session.setAttribute("shopcar", shopcar);
}
@RequestMapping(value="/foodminus",method = RequestMethod.POST)
public void yichugouwuche(HttpServletRequest request,HttpServletResponse response,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	
	int dishid=Integer.valueOf(request.getParameter("dishid"));
//	Map<Integer,Integer> shopcar=new HashMap<Integer,Integer>() ;
	Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
	//for (Map.Entry<Integer, Integer> entry : shopcar.entrySet()) { 
		  //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		if(shopcar.containsKey(dishid)){
			shopcar.put(dishid, shopcar.get(dishid)-1);
			if(shopcar.get(dishid)==0){
				shopcar.remove(dishid);
				
			}
			}

		//}
		session.setAttribute("shopcar", shopcar);
}
@RequestMapping(value="/getsession")
public void shuchu(HttpSession session){
	Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
	for (Map.Entry<Integer, Integer> entry : shopcar.entrySet()) { 
	  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
	  System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
}
	
}
@RequestMapping(value="/jiesuan/{shopid}")
public String qianqvjiesuan(@PathVariable("shopid")int shopid,Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int buyerno=userservice.getuserno(userid);
	List<Order> orderlist=new LinkedList<Order>();
	double totalprice=0;
	long ordernumber=sellservice.getorderno(shopid);
	long orderno=ordernumber+1;
	Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
	for (Map.Entry<Integer, Integer> entry : shopcar.entrySet()) { 
		int s=shopservice.getdishguishu(entry.getKey());

	if(s==shopid){
		Order order=new Order();
		order.setDishmingzi(shopservice.idgetname(entry.getKey()));
		order.setOrderno(orderno);
		order.setBuyerno(buyerno);
		order.setSellerno(shopid);
		order.setDishmount(entry.getValue());
		order.setDishno(entry.getKey());
		Double q=(double) 0;
		q=q+shopservice.getdishprice(entry.getKey())*entry.getValue();
		order.setTotalmount(q);
		order.setOrdertime(new Date());
		orderlist.add(order);
		totalprice=totalprice+shopservice.getdishprice(entry.getKey())*entry.getValue();
				
	}
	}
m.addAttribute("orderlist", orderlist);
m.addAttribute("totalprice", totalprice);
m.addAttribute("orderno", orderno);
session.setAttribute("sqqq", shopid);
session.setAttribute("orderlist", orderlist);
session.setAttribute("totalprice", totalprice);
	return "orderlistshow";
	}
@ResponseBody
@RequestMapping(value="gethbs",produces="text/html;charset=UTF-8")
public String hbs(HttpSession session){
	String userid=(String) session.getAttribute("userid");
    int buyerno=userservice.getuserno(userid);
    int shopid=(Integer) session.getAttribute("sqqq");
    System.out.println("aaaaaaaaaaaaaaaaaaaaa"+shopid);
    String shopname=sellservice.getshopname(shopid);
    System.out.println("aaaaaaaaaaaaaaaaaaaaa"+shopname);
    double totalprice=(Double) session.getAttribute("totalprice");
    List<Couponlist> lcou=sellservice.getzijibendiankeyonghongbao(buyerno, shopname, totalprice);
    if(lcou!=null){ int shuliang=lcou.size();
    String a="您有"+shuliang+"个红包可用";return a;}
    else {String a="您有0个红包可用";return a;}
	
}
@RequestMapping(value="/hongbaozhifu/{orderno}")
public String xiadan0(@PathVariable("orderno")int orderno,Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
    int uuie=userservice.getuserno(userid);
    int shopid=(Integer) session.getAttribute("sqqq");
    String shopname=sellservice.getshopname(shopid);
    double totalprice=(Double) session.getAttribute("totalprice");
    List<Couponlist> lcoup=sellservice.getzijibendiankeyonghongbao(uuie, shopname, totalprice);
    m.addAttribute("lcoup",lcoup);
    session.setAttribute("orderno", orderno);
    
	return "bendianhongbao";
	}
@RequestMapping(value="/xiadan")
public String xiadan1(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int buyerno=userservice.getuserno(userid);
	List<Order> orderlist=(List<Order>) session.getAttribute("orderlist");
	int ordernumber=0;
	ordernumber=(int) (ordernumber+orderlist.get(0).getOrderno());
for(int i=0;i<orderlist.size();i++){
	JSONObject jsonObject = JSONObject.fromObject(orderlist.get(i));
    sellservice.kucunjianyi(orderlist.get(i).getDishno(), orderlist.get(i).getDishmount());
	System.out.println(jsonObject);
	sellservice.xiadan(orderlist.get(i));
}
int shopid=orderlist.get(0).getSellerno();
int paihao=sellservice.huoqvxzdhao(shopid);
sellservice.kaishipaihao(shopid, buyerno, paihao+1,ordernumber);
int paihao2=sellservice.huoqvxzdhao(shopid);
int paihao3=sellservice.qmhydsr(shopid)-1;
m.addAttribute("hao",paihao2);
m.addAttribute("hao2",paihao3);
session.setAttribute("hao", paihao2);
session.setAttribute("hao2", paihao3);

Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
Iterator<Integer> iter = shopcar.keySet().iterator();
while(iter.hasNext()){
    int key = iter.next();
    if(shopid==shopservice.getdishguishu(key)){
        iter.remove();
    }
}
Shouru shouru=new Shouru();
shouru.setDianjiaid(shopid);
shouru.setRenno(buyerno);
shouru.setDingdanhao(ordernumber);
double totalprice=(Double) session.getAttribute("totalprice");
shouru.setYuanjia(totalprice);
shouru.setXianjia(totalprice);
session.setAttribute("shouru", shouru);
session.setAttribute("qian", totalprice);
session.setAttribute("ddh", ordernumber);
session.setAttribute("dianming", sellservice.getshopname(shopid));
sellservice.tianjiajilu(shouru);
return "redirect:/goAlipay.action";
	}
@RequestMapping("xiadan2/{cid}")
public String xiadan2(@PathVariable("cid")int cid,Model m,HttpSession session){
List<Order> orderlist=(List<Order>) session.getAttribute("orderlist");
double totalprice= (Double) session.getAttribute("totalprice");
String userid=(String) session.getAttribute("userid");
int userno=userservice.getuserno(userid);
Coupon c=sellservice.getgaicoupon(cid);
double totalprice2=totalprice-c.getMinusmoney();
m.addAttribute("orderlist", orderlist);
m.addAttribute("totalprice", totalprice);
m.addAttribute("totalprice2", totalprice2);
m.addAttribute("cid", cid);
session.setAttribute("totalprice2", totalprice2);
int orderno=(Integer) session.getAttribute("orderno");
m.addAttribute("orderno", orderno);
	return "orderlist2";
}
@RequestMapping(value="/xiadan3/{cid}")
public String xiadan3(@PathVariable("cid")int cid,Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int buyerno=userservice.getuserno(userid);
	List<Order> orderlist=(List<Order>) session.getAttribute("orderlist");
	int ordernumber=0;
	ordernumber=(int) (ordernumber+orderlist.get(0).getOrderno());
for(int i=0;i<orderlist.size();i++){
	JSONObject jsonObject = JSONObject.fromObject(orderlist.get(i));
    sellservice.kucunjianyi(orderlist.get(i).getDishno(), orderlist.get(i).getDishmount());
	System.out.println(jsonObject);
	sellservice.xiadan(orderlist.get(i));
}
int shopid=orderlist.get(0).getSellerno();
int paihao=sellservice.huoqvxzdhao(shopid);
sellservice.kaishipaihao(shopid, buyerno, paihao+1,ordernumber);
int paihao2=sellservice.huoqvxzdhao(shopid);
int paihao3=sellservice.qmhydsr(shopid)-1;
m.addAttribute("hao",paihao2);
m.addAttribute("hao2",paihao3);
session.setAttribute("hao", paihao2);
session.setAttribute("hao2", paihao3);
Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
Iterator<Integer> iter = shopcar.keySet().iterator();
while(iter.hasNext()){
    int key = iter.next();
    if(shopid==shopservice.getdishguishu(key)){
        iter.remove();
    }
}
sellservice.shanchu1(buyerno, cid);
Shouru shouru=new Shouru();
shouru.setDianjiaid(shopid);
shouru.setRenno(buyerno);
shouru.setDingdanhao(ordernumber);
double totalprice=(Double) session.getAttribute("totalprice");
double totalprice2=(Double) session.getAttribute("totalprice2");
shouru.setYuanjia(totalprice);
shouru.setXianjia(totalprice2);
sellservice.tianjiajilu(shouru);
session.setAttribute("qian", totalprice2);
session.setAttribute("shouru", shouru);
session.setAttribute("ddh", ordernumber);
	return "redirect:/goAlipay.action";
	}
@ResponseBody
@RequestMapping("weiwanchengdingdanshu")
public String weiwancheng1(HttpSession session){
//	String userid=(String) session.getAttribute("userid");
//	int userno=userservice.getuserno(userid);
	int sno=(Integer) session.getAttribute("sno");
	int wwcdds=sellservice.wwcdds(sno);
	return String.valueOf(wwcdds);
}
@RequestMapping("gaishangpusuoyouweiwanchengdingdan")
public String sywwc(Model m,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
	int wwcdds=sellservice.wwcdds(sno);
	List<Integer> rrr=sellservice.getwwcordernumber(sno);
	
	m.addAttribute("rrr", rrr);
	List<List<Order>> specificorder=new LinkedList<List<Order>>();
	for(int i=0;i<rrr.size();i++){
		List<Order> aaa=sellservice.getwwcdd(rrr.get(i), sno);
		specificorder.add(aaa);
		
	}
	m.addAttribute("specificorder", specificorder);
	return "allweiwancheng";
}
@ResponseBody
@RequestMapping(value="anordernoqvzhi",produces="text/html;charset=UTF-8")
public String sywwc2(int q,Model m,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
	int wwcdds=sellservice.wwcdds(sno);

		List<Order> yyyyy=sellservice.getwwcdd(q, sno);
StringBuilder sb=new StringBuilder();
sb=sb.append("<div><table class='table'><tr><td>下单用户id:"+yyyyy.get(0).getBuyerno()+"</td><td>下单时间"+yyyyy.get(0).getOrdertime()+"</td><td></td></tr><tr><td class='center'>缩略图</td><td class='center'>菜品名称</td><td class='center'>数量</td></tr>");
for(int i=0;i<yyyyy.size();i++){
	sb=sb.append("");
sb=sb.append("<tr><td><img src='cptp8?did="+yyyyy.get(i).getDishno()+"' height='50px' width='50px'/></td>"+"<td>"+yyyyy.get(i).getDishmingzi()+"</td><td>"+"X"+yyyyy.get(i).getDishmount()+"</td></tr>");
}
double total=0;
for(int i=0;i<yyyyy.size();i++){
	total=total+yyyyy.get(i).getTotalmount();
}
Shouru sh=sellservice.getone(q,sno);

sb=sb.append("</table>本单原价"+total+"元<br/>");
if(sh!=null){sb=sb.append("本单红包后收入"+sh.getXianjia()+"元&nbsp&nbsp&nbsp&nbsp");}
else{sb=sb.append("本单红包后收入"+total+"元<br/>");}

sb=sb.append("<aside class='mtb' style='text-align:right;'><label>操作：</label><a class='group_btn' href='tongzhikehu/"+yyyyy.get(0).getOrderno()+"'>通知顾客餐好了</a></aside></div>");
	return sb.toString();
}
@RequestMapping(value="tongzhikehu/{ttt}")
public String hujiaokehu(@PathVariable("ttt")int ttt,Model m,HttpSession session){
//	int a=0;
//	a=(int) (a+orderno);
	int sno=(Integer) session.getAttribute("sno");
	sellservice.over2(ttt, new Date(),sno);
	sellservice.over3(sno);
	sellservice.over4(ttt,sno);
	System.out.println("qwertyuiosdfghj"+ttt+"zxcvbnm");
	List<Order> asdf=sellservice.qwerty(ttt,sno);
	for(int i=0;i<asdf.size();i++){
		sellservice.over1(asdf.get(i).getDishno(), asdf.get(i).getDishmount());
	JSONObject jsonObject = JSONObject.fromObject(asdf.get(i));
    System.out.println(asdf.get(0));
    session.setAttribute("jsonObject",jsonObject);
	System.out.println(jsonObject);}
	String shopname=sellservice.getshopname(sno);
	String param=shopname+","+ttt;
	
	String sid = "d6f57cfb5dcf2a8b469847445b4b68b4";
	String token = "b395dfd8d7d4b2cb99d644d272da5027";
	String appid = "2b592583120d429c89b56d27798f2cd5";
	String templateid = "460780";
	//String param = "天天,93";
	String mobile = "18846939958";
	String uid = "";
	RestTest.testSendSms(sid, token, appid, templateid, param, mobile, uid);
	return "redirect:/shop1.jsp";
}
@RequestMapping("chakanzijiorder")
public String qbdd(Model m,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
	String userid=(String) session.getAttribute("userid");
	int buyerno=userservice.getuserno(userid);
	List<Integer> uu=sellservice.getzijiorder(buyerno);
	List<Jilulu> jilu=new LinkedList<Jilulu>();
	for(int i=0;i<uu.size();i++){
		Jilulu j=new Jilulu();
		j.setBid(buyerno);
		double total=0;
		int zhuangtai=0;
		List<Order> q=sellservice.getzijiallorder(uu.get(i), buyerno);
		int p=0;
		p=(int) (p+q.get(0).getOrderno());
		for(int k=0;k<q.size();k++){
			int y=0;
			y=(int) (y+q.get(k).getOrderno());
			j.setOno(y);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			   String dateString = formatter.format(q.get(k).getOrdertime());
			   
			  if(q.get(k).getOvertime()!=null) {String dateString2 = formatter.format(q.get(k).getOvertime());
			  j.setOvertime(dateString2);
			  }
			j.setStarttime(dateString);
			
			j.setSid(q.get(k).getSellerno());
			j.setSn(sellservice.getshopname(q.get(k).getSellerno()));
			total=total+q.get(k).getTotalmount();
			zhuangtai=q.get(k).getOrdercategory();
		}
		j.setZonghuafei(total);
		Shouru sh=sellservice.getone(p,sno);
		if(sh!=null){j.setShijihuafei(sh.getXianjia());}
		else{j.setShijihuafei(total);}
		if(zhuangtai==2) j.setZt("未完成");
		else  j.setZt("已完成");
		jilu.add(j);
	}
	m.addAttribute("jilu", jilu);
	return "consumelist";
}
@RequestMapping(value="/getjutidingdan2/{ono}")
public String wer2(@PathVariable("ono")int ono,Model m,HttpSession session){
int sno=(Integer) session.getAttribute("sno");
	
List<Order> spe=sellservice.getzijiallorder2(ono, sno);
int si=spe.get(0).getSellerno();
String shopname=sellservice.getshopname(spe.get(0).getBuyerno());
double totalprice=0;


Date ordertime = null;
Date overtime = null;
for(int i=0;i<spe.size();i++){
	totalprice=totalprice+spe.get(i).getTotalmount();
	 ordertime=spe.get(i).getOrdertime();
	 overtime=spe.get(i).getOvertime();
}
Shouru sh=sellservice.getone(ono,sno);
double totalprice2=0;
if(sh!=null){ totalprice2=sh.getXianjia();}
else{ totalprice2=totalprice;}
m.addAttribute("spe", spe);
m.addAttribute("buyerid",userservice.getuserid(spe.get(0).getBuyerno()));
m.addAttribute("totalprice", totalprice);
m.addAttribute("totalprice2", totalprice2);
m.addAttribute("shopname", shopname);
m.addAttribute("si", si);
m.addAttribute("ordertime", ordertime);
m.addAttribute("overtime", overtime);
return "speorder2";
	}
@RequestMapping(value="/getjutidingdan/{ono}")
public String wer(@PathVariable("ono")int ono,Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int sno=(Integer) session.getAttribute("sno");
	int userno=userservice.getuserno(userid);
	int buyerno=userservice.getuserno(userid);
	
List<Order> spe=sellservice.getzijiallorder(ono, buyerno);
int si=spe.get(0).getSellerno();
String shopname=sellservice.getshopname(spe.get(0).getSellerno());
double totalprice=0;


Date ordertime = null;
Date overtime = null;
for(int i=0;i<spe.size();i++){
	totalprice=totalprice+spe.get(i).getTotalmount();
	 ordertime=spe.get(i).getOrdertime();
	 overtime=spe.get(i).getOvertime();
}
Shouru sh=sellservice.getone(ono,sno);
double totalprice2=0;
if(sh!=null){ totalprice2=sh.getXianjia();}
else{ totalprice2=totalprice;}
m.addAttribute("spe", spe);
m.addAttribute("totalprice", totalprice);
m.addAttribute("totalprice2", totalprice2);
m.addAttribute("shopname", shopname);
m.addAttribute("si", si);
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String dateString = formatter.format(ordertime);
if(overtime!=null){String dateString2 = formatter.format(overtime);m.addAttribute("overtime", dateString2);}
m.addAttribute("ordertime", dateString);

return "speorder";
	}
@RequestMapping(value="/tianjiahongbao",method = RequestMethod.POST)
public String tianjiahongbao(Coupon coupon,HttpServletRequest request,HttpServletResponse response,HttpSession session){
int sno=(Integer) session.getAttribute("sno");
	coupon.setSpid(sno);
	sellservice.tianjiahongbao(coupon);
	return "redirect:/zijihongbaoguanli.action";
}
@RequestMapping(value="/zijihongbaoguanli")
public String hongbaoguanli(HttpServletRequest request,Model m,HttpServletResponse response,HttpSession session){
int sno=(Integer) session.getAttribute("sno");
List<Coupon> lc=sellservice.getbendiancoupon(sno);
m.addAttribute("lc", lc);
	return "hongbaoguanli";
}
@RequestMapping(value="fafang1/{couponid}")
public String fafanghongbao1(@PathVariable("couponid")int couponid,Model m,HttpSession session){
//	int a=0;
//	a=(int) (a+orderno);
List<User> us=sellservice.getallguke();
Coupon coupon=sellservice.getgaicoupon(couponid);
Couponlist couponlist=new Couponlist();
couponlist.setFm(coupon.getFrommoney());
couponlist.setMm(coupon.getMinusmoney());
couponlist.setSna(sellservice.getshopname(coupon.getSpid()));
couponlist.setCid(coupon.getCouponid());
for(int i=0;i<us.size();i++){
	couponlist.setUuie(us.get(i).getUserno());
	sellservice.fafang1(couponlist);
}
	return "redirect:/zijihongbaoguanli.action";
}
@RequestMapping(value="fafang2/{couponid}")
public String fafanghongbao2(@PathVariable("couponid")int couponid,Model m,HttpSession session){
//	int a=0;
//	a=(int) (a+orderno);
	int sno=(Integer) session.getAttribute("sno");
List<Paihaolist> wer=sellservice.getlaiguodekehu(sno);
int[]a;
Set<Integer> s=new HashSet<Integer>();
Coupon coupon=sellservice.getgaicoupon(couponid);
Couponlist couponlist=new Couponlist();
couponlist.setFm(coupon.getFrommoney());
couponlist.setMm(coupon.getMinusmoney());
couponlist.setSna(sellservice.getshopname(coupon.getSpid()));
couponlist.setCid(coupon.getCouponid());
for(int i=0;i<wer.size();i++){
	s.add(wer.get(i).getBuyerid());
	//couponlist.setUuie(wer.get(i).getBuyerid());
	//sellservice.fafang1(couponlist);
}
Iterator<Integer> it = s.iterator();  
while (it.hasNext()) {  
  int str = it.next();  
	couponlist.setUuie(str);
	sellservice.fafang1(couponlist);
}  
	return "redirect:/zijihongbaoguanli.action";
}
@RequestMapping(value="chakanzijihongbao")
public String zijihongbao(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
List<Couponlist> lcc=sellservice.getzijihongbao(userno);
m.addAttribute("lcc", lcc);
	return "hongbaolist";
}
@RequestMapping(value="hongbaojindian/{cid}")
public String hongbjd(@PathVariable("cid")int cid,Model m,HttpSession session){
Coupon co=sellservice.getgaicoupon(cid);
int shopid=co.getSpid();
String a="redirect:/getshoptotalfood/"+shopid+".action";
	return a;
}
@RequestMapping("getbendiansuoyoudingdan")
public String qbdd2(Model m,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
	String userid=(String) session.getAttribute("userid");
	int sellerno=userservice.getuserno(userid);
	List<Integer> uu=sellservice.getzijiorder2(sno);
	List<Jilulu> jilu=new LinkedList<Jilulu>();
	for(int i=0;i<uu.size();i++){
		Jilulu j=new Jilulu();
		j.setSid(sno);
		double total=0;
		int zhuangtai=0;
		List<Order> q=sellservice.getzijiallorder2(uu.get(i), sno);
		
		int p=0;
		p=(int) (p+q.get(0).getOrderno());
		for(int k=0;k<q.size();k++){
			int y=0;
			y=(int) (y+q.get(k).getOrderno());
			j.setOno(y);
			j.setBid(q.get(k).getBuyerno());
			j.setSn(sellservice.getshopname(q.get(k).getSellerno()));
			total=total+q.get(k).getTotalmount();
			zhuangtai=q.get(k).getOrdercategory();
		}
		j.setZonghuafei(total);
		Shouru sh=sellservice.getone(p,sno);
		if(sh!=null){j.setShijihuafei(sh.getXianjia());}
		else{j.setShijihuafei(total);}
		if(zhuangtai==2) j.setZt("未完成");
		else  j.setZt("已完成");
		jilu.add(j);
	}
	m.addAttribute("jilu", jilu);
	return "shoporder";
}
@RequestMapping(value="tongji1")
public String tongji1(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int sno=(Integer) session.getAttribute("sno");
List<Order> lo1=sellservice.getzijiorder4(sno);
int e=0;
int[] q=new int[25];
for(int i=0;i<q.length;i++){q[i]=0;}
double[] w=new double[25];
for(int i=0;i<q.length;i++){w[i]=0;}
for(int i=0;i<lo1.size();i++){
	e=e+1;
	SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String a = formatter2.format(lo1.get(i).getOrdertime());
   String b=a.substring(11,13);
   int c=Integer.valueOf(b);
   q[c]=q[c]+1;
   w[c]=w[c]+lo1.get(i).getTotalmount();
}
m.addAttribute("e", e);
m.addAttribute("q1", q[1]);m.addAttribute("q2", q[2]);m.addAttribute("q3", q[3]);m.addAttribute("q4", q[4]);m.addAttribute("q5", q[5]);m.addAttribute("q6", q[6]);m.addAttribute("q7", q[7]);m.addAttribute("q8", q[8]);m.addAttribute("q9", q[9]);m.addAttribute("q10", q[10]);m.addAttribute("q11", q[11]);m.addAttribute("q12", q[12]);m.addAttribute("q13", q[13]);m.addAttribute("q14", q[14]);m.addAttribute("q1", q[1]);m.addAttribute("q15", q[15]);m.addAttribute("q16", q[16]);m.addAttribute("q1", q[1]);m.addAttribute("q17", q[17]);m.addAttribute("q18", q[18]);m.addAttribute("q19", q[19]);m.addAttribute("q20", q[20]);m.addAttribute("q21", q[21]);m.addAttribute("q22", q[22]);
m.addAttribute("w1", w[1]);m.addAttribute("w2", w[2]);m.addAttribute("w3", w[3]);m.addAttribute("w4", w[4]);m.addAttribute("w5", w[5]);m.addAttribute("w6", w[6]);m.addAttribute("w7", w[7]);m.addAttribute("w8", w[8]);m.addAttribute("w9", w[9]);m.addAttribute("w10", w[10]);m.addAttribute("w11", w[11]);m.addAttribute("w12", w[12]);m.addAttribute("w13", w[13]);m.addAttribute("w14", w[14]);m.addAttribute("w1", w[1]);m.addAttribute("w15", w[15]);m.addAttribute("w16", w[16]);m.addAttribute("w1", w[1]);m.addAttribute("w17", w[17]);m.addAttribute("w18", w[18]);m.addAttribute("w19", w[19]);m.addAttribute("w20", w[20]);m.addAttribute("w21", w[21]);m.addAttribute("w22", w[22]);
	return "tongji";
}
@RequestMapping(value="tongji2")
public String tongji2(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int sno=(Integer) session.getAttribute("sno");
List<Order> lo1=sellservice.getzijiorder4(sno);
double r=0;
int[] q=new int[25];
for(int i=0;i<q.length;i++){q[i]=0;}
double[] w=new double[25];
for(int i=0;i<q.length;i++){w[i]=0;}
for(int i=0;i<lo1.size();i++){
	SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String a = formatter2.format(lo1.get(i).getOrdertime());
   String b=a.substring(11,13);
   int c=Integer.valueOf(b);
   q[c]=q[c]+1;
   w[c]=w[c]+lo1.get(i).getTotalmount();
   r=r+lo1.get(i).getTotalmount();
}
m.addAttribute("r", r);
m.addAttribute("q1", q[1]);m.addAttribute("q2", q[2]);m.addAttribute("q3", q[3]);m.addAttribute("q4", q[4]);m.addAttribute("q5", q[5]);m.addAttribute("q6", q[6]);m.addAttribute("q7", q[7]);m.addAttribute("q8", q[8]);m.addAttribute("q9", q[9]);m.addAttribute("q10", q[10]);m.addAttribute("q11", q[11]);m.addAttribute("q12", q[12]);m.addAttribute("q13", q[13]);m.addAttribute("q14", q[14]);m.addAttribute("q1", q[1]);m.addAttribute("q15", q[15]);m.addAttribute("q16", q[16]);m.addAttribute("q1", q[1]);m.addAttribute("q17", q[17]);m.addAttribute("q18", q[18]);m.addAttribute("q19", q[19]);m.addAttribute("q20", q[20]);m.addAttribute("q21", q[21]);m.addAttribute("q22", q[22]);
m.addAttribute("w1", w[1]);m.addAttribute("w2", w[2]);m.addAttribute("w3", w[3]);m.addAttribute("w4", w[4]);m.addAttribute("w5", w[5]);m.addAttribute("w6", w[6]);m.addAttribute("w7", w[7]);m.addAttribute("w8", w[8]);m.addAttribute("w9", w[9]);m.addAttribute("w10", w[10]);m.addAttribute("w11", w[11]);m.addAttribute("w12", w[12]);m.addAttribute("w13", w[13]);m.addAttribute("w14", w[14]);m.addAttribute("w1", w[1]);m.addAttribute("w15", w[15]);m.addAttribute("w16", w[16]);m.addAttribute("w1", w[1]);m.addAttribute("w17", w[17]);m.addAttribute("w18", w[18]);m.addAttribute("w19", w[19]);m.addAttribute("w20", w[20]);m.addAttribute("w21", w[21]);m.addAttribute("w22", w[22]);
	return "tongji2";
}
@RequestMapping(value="tongji3")
public String tongji3(Model m,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
List<Dish> y=sellservice.getalldish4(sno);
m.addAttribute("y", y);
	return "tongji3";
}
@RequestMapping(value="tongji4")
public String tongji4(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int sno=(Integer) session.getAttribute("sno");
List<Order> lo1=sellservice.getzijiorder4(sno);
int e=0;
int[] q=new int[13];
for(int i=0;i<q.length;i++){q[i]=0;}
double[] w=new double[25];
for(int i=0;i<q.length;i++){w[i]=0;}
for(int i=0;i<lo1.size();i++){
	e=e+1;
	SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String a = formatter2.format(lo1.get(i).getOrdertime());
   String b=a.substring(5,7);
   int c=Integer.valueOf(b);
   q[c]=q[c]+1;
   w[c]=w[c]+lo1.get(i).getTotalmount();
}
m.addAttribute("e", e);
m.addAttribute("q1", q[1]);m.addAttribute("q2", q[2]);m.addAttribute("q3", q[3]);m.addAttribute("q4", q[4]);m.addAttribute("q5", q[5]);m.addAttribute("q6", q[6]);m.addAttribute("q7", q[7]);m.addAttribute("q8", q[8]);m.addAttribute("q9", q[9]);m.addAttribute("q10", q[10]);m.addAttribute("q11", q[11]);m.addAttribute("q12", q[12]);
m.addAttribute("w1", w[1]);m.addAttribute("w2", w[2]);m.addAttribute("w3", w[3]);m.addAttribute("w4", w[4]);m.addAttribute("w5", w[5]);m.addAttribute("w6", w[6]);m.addAttribute("w7", w[7]);m.addAttribute("w8", w[8]);m.addAttribute("w9", w[9]);m.addAttribute("w10", w[10]);m.addAttribute("w11", w[11]);m.addAttribute("w12", w[12]);
	return "tongji4";
}
@RequestMapping(value="tongji5")
public String tongji5(Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int userno=userservice.getuserno(userid);
	int sno=(Integer) session.getAttribute("sno");
List<Order> lo1=sellservice.getzijiorder4(sno);
int e=0;
int[] q=new int[13];
for(int i=0;i<q.length;i++){q[i]=0;}
double[] w=new double[25];
for(int i=0;i<q.length;i++){w[i]=0;}
for(int i=0;i<lo1.size();i++){
	e=e+1;
	SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String a = formatter2.format(lo1.get(i).getOrdertime());
   String b=a.substring(5,7);
   int c=Integer.valueOf(b);
   q[c]=q[c]+1;
   w[c]=w[c]+lo1.get(i).getTotalmount();
}
 String qingcheng666="das456";
System.out.println(qingcheng666);
m.addAttribute("e", e);
m.addAttribute("q1", q[1]);m.addAttribute("q2", q[2]);m.addAttribute("q3", q[3]);m.addAttribute("q4", q[4]);m.addAttribute("q5", q[5]);m.addAttribute("q6", q[6]);m.addAttribute("q7", q[7]);m.addAttribute("q8", q[8]);m.addAttribute("q9", q[9]);m.addAttribute("q10", q[10]);m.addAttribute("q11", q[11]);m.addAttribute("q12", q[12]);
m.addAttribute("w1", w[1]);m.addAttribute("w2", w[2]);m.addAttribute("w3", w[3]);m.addAttribute("w4", w[4]);m.addAttribute("w5", w[5]);m.addAttribute("w6", w[6]);m.addAttribute("w7", w[7]);m.addAttribute("w8", w[8]);m.addAttribute("w9", w[9]);m.addAttribute("w10", w[10]);m.addAttribute("w11", w[11]);m.addAttribute("w12", w[12]);
	return "tongji5";
}
}


