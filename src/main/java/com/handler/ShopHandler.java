package com.handler;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.SellService;
import com.service.ShopService;
import com.service.UserService;
import com.vo.Cptj1;
import com.vo.Dish;
import com.vo.Dishcategory;
import com.vo.Dishphoto;
import com.vo.Shop;
import com.vo.Shopapply;
import com.vo.Shopphoto;
import com.vo.Shtj1;
import com.vo.Sq;
import com.vo.User;

@Controller
public class ShopHandler {
@Autowired
ShopService shopservice;
@Autowired
SellService sellservice;
@Autowired
UserService userservice;
@InitBinder("shop")
public void userBinder(WebDataBinder webDataBinder){
    webDataBinder.setFieldDefaultPrefix("shop.");
}

@InitBinder("shopphoto")
public void userDetailBinder(WebDataBinder webDataBinder){
    webDataBinder.setFieldDefaultPrefix("shopphoto.");
}
@RequestMapping(value="shangpushenqing",method = RequestMethod.POST)
public String addUser2(Shop shop,Shopphoto shopphoto,Model m,HttpSession session) throws Exception{
String userid=(String) session.getAttribute("userid");
int userno=userservice.getuserno(userid);
shop.setOwnerno(userno);
shop.setShopapplytime(new Date());
String shopname=shop.getShopname();
shopservice.spsq(shop);
int shopno=shopservice.getno(shopname);
shopphoto.setSno(shopno);
session.setAttribute("shopphoto2", shopphoto);
//shopservice.spsq4(shopphoto);
Shopapply shopapply=new Shopapply();
shopapply.setShopnumber(shopno);
shopapply.setAptime(new Date());
shopservice.spsq3(shopapply);
System.out.println(shopname);
session.setAttribute("sno", shopno);
	return "shenqingshiphoto";
	}

@RequestMapping(value="/shenqingshiphoto",method = RequestMethod.POST)
public String addNewst(@ModelAttribute  Shopphoto shopphoto, MultipartFile ppicture,  HttpSession session) throws Exception{
  int sno=(Integer) session.getAttribute("sno");
  Shopphoto shopphoto2=(Shopphoto) session.getAttribute("shopphoto2");
        shopservice.spsq2(shopphoto2, ppicture);
        return "login2";
}
@ResponseBody
@RequestMapping(value="/getspzp2",produces="text/html;charset=UTF-8")
public String getqbwsq(HttpSession session){
	Shop s=(Shop) session.getAttribute("s");
	String shopname=s.getShopname();
	return shopname;
	
}
@RequestMapping(value="shopPic")
public void newsPic(HttpServletResponse response,HttpSession session, Model model){ 
   Shop s=(Shop) session.getAttribute("s");
   Shopphoto sph=shopservice.sp2(s.getShopno());
   byte[] newsPic = sph.getSphoto();
   try {  
       OutputStream outputStream=response.getOutputStream();  
       InputStream in=new ByteArrayInputStream(newsPic);
           
       int len = 0;
       byte[] buffer = new byte[1024];
       while((len=in.read(buffer, 0, 1024)) != -1){
           outputStream.write(buffer, 0, len);
       }
       outputStream.close();
   } catch (Exception e) {  
       e.printStackTrace();  
   } 
   }
@RequestMapping(value="/zengjiacaipinfenlei",method = RequestMethod.POST)
public String addcpfl(String dcategory,  HttpSession session) throws Exception{
  int sno=(Integer) session.getAttribute("sno");
Dishcategory d=new Dishcategory();
d.setDcategory(dcategory);
d.setShopshopno(sno);
shopservice.xinzengcaipinfenlei(d);
        return "guanlicaipinfenlei";
}
@ResponseBody
@RequestMapping(value="/getcaipinfenlei",produces="text/html;charset=UTF-8")
public String getcpfl(HttpSession session){
	System.out.println("8888888888888888");
	int shopshopno=(Integer) session.getAttribute("sno");
	List<Dishcategory> qq=shopservice.getallcategory(shopshopno);
	StringBuilder sb=new StringBuilder();
	  sb=sb.append("<br/><form action='shanchufenlei' method='post' ><table class='table'>");
	for(int i=0;i<qq.size();i++){

  sb=sb.append("<tr><td class='center'><input type='checkbox' name='cpfl' value='"+qq.get(i).getDcategory()+"'>"+qq.get(i).getDcategory()+"</input></td></tr>");
	}
	sb=sb.append("<tr><td class='center'><input type='submit' value='确认删除'></td></tr>");
	sb=sb.append("</table></form>");
	System.out.println("99999999999999999");
	
	return sb.toString();}
@RequestMapping(value="/shanchufenlei",method = RequestMethod.POST)
public String scfl(String [] cpfl,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
	Dishcategory dc=new Dishcategory();
	 for(int i=0;i<cpfl.length;i++){
     String a=cpfl[i];
     shopservice.shanchucaipinfenlei(sno, a);
     }
	return "guanlicaipinfenlei";
}
@ResponseBody
@RequestMapping(value="/getdcg",produces="text/html;charset=UTF-8")
public String getcpfl2(HttpSession session){
	System.out.println("8888888888888888");
	int shopshopno=(Integer) session.getAttribute("sno");
	List<Dishcategory> qq=shopservice.getallcategory(shopshopno);
	StringBuilder sb=new StringBuilder();
	sb=sb.append("<span class='item_name' style='width:120px;'>菜品分类：</span>");
	  //sb=sb.append("<br/><form action='shanchufenlei' method='post' >");
	for(int i=0;i<qq.size();i++){
sb=sb.append(" <label class='single_selection'><input type='radio' id='qqq' name='dishcategory' value='"+qq.get(i).getDcategory()+"' />"+qq.get(i).getDcategory()+"</label>");
  //sb=sb.append("<input type='checkbox' name='cpfl' value='"+qq.get(i).getDcategory()+"'>"+qq.get(i).getDcategory()+"</input>");
	}
	//sb=sb.append("<input type='submit' value='鍒犻櫎'>");
	//sb=sb.append("</form>");
	System.out.println("99999999999999999");
	
	return sb.toString();}
@RequestMapping(value="/tianjiacaipin1",method = RequestMethod.POST)
public String tianjiacaipin1(Dish dish,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
dish.setShopid(sno);
shopservice.xinzengcaipin(dish);
int dishid=shopservice.getdishid(sno, dish.getDishname());
session.setAttribute("dishid",dishid );
System.out.println(dish.getDishcategory());
	return "xinzengcaipin2";
}
@RequestMapping(value="/caipintupian",method = RequestMethod.POST)
public String addcptp(@ModelAttribute  Dishphoto dishphoto, MultipartFile ppicture,  HttpSession session) throws Exception{
  int sno=(Integer) session.getAttribute("sno");
  int dishid=(Integer) session.getAttribute("dishid");
dishphoto.setDid(dishid);
shopservice.caiptp(dishphoto, ppicture);
        return "shop1";
}
@RequestMapping("/xiugaicaipinxinxi")
public String getAll(Map<String,Object> map,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
	
	PageHelper.startPage(1, 100);
	PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(shopservice.listdish(sno));
	System.out.println("111111111111111111111111111111111111111111111111");
	System.out.println(pageInfo);
	System.out.println(pageInfo.getList());
	map.put("pageInfo", pageInfo);
System.out.println("777777777777777777777777");
return "xiugaicaipin";
}
@RequestMapping(value="/xgcp",method = RequestMethod.POST)
public String xgcp(Dish dish, HttpSession session) throws Exception{
  int sno=(Integer) session.getAttribute("sno");
  shopservice.xgcp(dish.getDishid(), dish.getDishname(), dish.getDishintroduction(), dish.getDishprice(), dish.getDishstock());
return "forward:xiugaicaipinxinxi.action";
}
@RequestMapping("/xiugaicaipintupian")
public String getAlltp(Map map,HttpSession session){
	int sno=(Integer) session.getAttribute("sno");
List<Dish> ll=shopservice.getalldishphoto(sno);
	map.put("ll", ll);
System.out.println("777777777777777777777777");
return "xiugaicaipintupian";
}
@RequestMapping(value="cptp8")
public void newsPic(int did,HttpServletResponse response, Model model){ 
   //News news = fdyfzxService.findNewsById(Integer.parseInt(id));
   Dishphoto dp=shopservice.getdishtp(did);
   byte[] newsPic = dp.getDphoto();
   try {  
       OutputStream outputStream=response.getOutputStream();  
       InputStream in=new ByteArrayInputStream(newsPic);
           
       int len = 0;
       byte[] buffer = new byte[1024];
       while((len=in.read(buffer, 0, 1024)) != -1){
           outputStream.write(buffer, 0, len);
       }
       outputStream.close();
   } catch (Exception e) {  
       e.printStackTrace();  
   } 
   }
@RequestMapping(value="/xgcptp",method = RequestMethod.POST)
public String xgcptp(@ModelAttribute Dishphoto dishphoto,MultipartFile ppicture,HttpServletRequest request,HttpSession session) throws Exception{
  int sno=(Integer) session.getAttribute("sno");

  String ss =  (String) session.getAttribute("ss");
  System.out.println("!!!!!!!!!!!!!!!!!!!");
  System.out.println(ss);
  int did=Integer.parseInt(ss);
 // String dishid= context.Request.Params["dishid"].toString().Trim();
  shopservice.xgcptp(did, dishphoto.getDphoto(),ppicture);
return "forward:xiugaicaipintupian.action";
}
@RequestMapping(value="/jlsz",method = RequestMethod.POST)
public void jlsz(HttpServletRequest request,HttpSession session) throws Exception{
  int sno=(Integer) session.getAttribute("sno");

  String ss =  request.getParameter("dishid");
  System.out.println("!!!!!!!!!!!!!!!!!!!");
  System.out.println(ss);
session.setAttribute("ss", ss);

}
@ResponseBody
@RequestMapping(value="allshop",produces="text/html;charset=UTF-8")
public String allshop(HttpSession session){
	
	StringBuilder sb=new StringBuilder();
	sb=sb.append("<ul class='cate_list'>");
	List<Shop> ls=shopservice.getallshop();
	for(int i=0;i<ls.size();i++){
		Shop shop=ls.get(i);
//	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//	sb=sb.append(shop.getDcategory()+"<br/>");
//	sb=sb.append("</div>");
	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='208' height='185' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
	}
	sb=sb.append("</ul>");
	return sb.toString();
}
@ResponseBody
@RequestMapping(value="getid",produces="text/html;charset=UTF-8")
public String id(HttpSession session){
	String userid=(String) session.getAttribute("userid");
	StringBuilder sb=new StringBuilder();
sb=sb.append("欢迎:"+userid);
	return sb.toString();
}
@RequestMapping(value="shoppicture")
public void shoppicture(int sno,HttpServletResponse response,HttpSession session, Model model){ 
   System.out.println("666666666666666");
   Shopphoto sph=shopservice.sp2(sno);
   byte[] newsPic = sph.getSphoto();
   try {  
       OutputStream outputStream=response.getOutputStream();  
       InputStream in=new ByteArrayInputStream(newsPic);
           
       int len = 0;
       byte[] buffer = new byte[1024];
       while((len=in.read(buffer, 0, 1024)) != -1){
           outputStream.write(buffer, 0, len);
       }
       outputStream.close();
   } catch (Exception e) {  
       e.printStackTrace();  
   } 
   }
@RequestMapping(value="getshopfood/{shopno}")
public String getshopfood(@PathVariable("shopno")int shopno,Model m,HttpSession session){
	List<Dishcategory> l1=shopservice.getallcategory(shopno);
	m.addAttribute("l1", l1);
	for(int i=0;i<l1.size();i++){
		List<Dish> l2=shopservice.getalldish2(shopno, l1.get(i).getDcategory());
		String yyy=l1.get(i).getDcategory();
		
	m.addAttribute("l2", l2);
	}
	session.setAttribute("fangwendp", shopno);
	return "specificfood";
}
@RequestMapping(value="getshopfood2/{dishcategory}")
public String getshopfood2(String dishcategory,Model m,HttpSession session){
	int shopid=(Integer) session.getAttribute("fangwendp");
	List<Dish> l3=shopservice.getalldish2(shopid, dishcategory);
	m.addAttribute("l3", l3);
	return "specificfood";
}
@ResponseBody
@RequestMapping(value="getshopfood3/{dishcategory}")
public String getshopfood3(String dishcategory,Model m,HttpSession session){
	int shopid=(Integer) session.getAttribute("fangwendp");
	List<Dish> l3=shopservice.getalldish2(shopid, dishcategory);
	m.addAttribute("l3", l3);
	return "specificfood";
}
@RequestMapping(value="getshoptotalfood/{shopno}")
public String getshoptotalfood(@PathVariable("shopno")int shopno,Model m,HttpSession session){
	List<Dish> lll=shopservice.getalldish3(shopno);
	m.addAttribute("totalfood", lll);
	m.addAttribute("shopid", shopno);
	Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
	List<Dishcategory> ld=new LinkedList<Dishcategory>();
	ld=shopservice.getallcategory(shopno);
	m.addAttribute("ld", ld);
    m.addAttribute("lw", sellservice.getshopname(shopno));
    
//	Map<Integer,Integer> shopcar=new HashMap<Integer,Integer>();
//session.setAttribute("shopcar", shopcar);
	return "specificfood";
}
@RequestMapping(value="/cptp9/{did}")
public void newsPic2(@PathVariable("did")int did,HttpServletResponse response, Model model){ 
   //News news = fdyfzxService.findNewsById(Integer.parseInt(id));
   Dishphoto dp=shopservice.getdishtp(did);
   byte[] newsPic = dp.getDphoto();
   try {  
       OutputStream outputStream=response.getOutputStream();  
       InputStream in=new ByteArrayInputStream(newsPic);
           
       int len = 0;
       byte[] buffer = new byte[1024];
       while((len=in.read(buffer, 0, 1024)) != -1){
           outputStream.write(buffer, 0, len);
       }
       outputStream.close();
   } catch (Exception e) {  
       e.printStackTrace();  
   } 
   }
@ResponseBody
@RequestMapping(value="getnow",produces="text/html;charset=UTF-8")
public String getnow(String p,Model m,HttpSession session){
	Map<Integer,Integer> shopcar=(Map<Integer, Integer>) session.getAttribute("shopcar");
	int length = p.length()-1;
	String q=p.substring(0, length);
	int w=Integer.valueOf(q);
	if(shopcar.containsKey(w)){
		int eee=shopcar.get(w);
		String nu=String.valueOf(eee);
		return nu.toString();
	}
	else return "0";
}
@RequestMapping(value="shopPic2")
public void newsPic2(int w,HttpServletResponse response,HttpSession session, Model model){ 

   Shopphoto sph=shopservice.sp2(w);
   byte[] newsPic = sph.getSphoto();
   try {  
       OutputStream outputStream=response.getOutputStream();  
       InputStream in=new ByteArrayInputStream(newsPic);
           
       int len = 0;
       byte[] buffer = new byte[1024];
       while((len=in.read(buffer, 0, 1024)) != -1){
           outputStream.write(buffer, 0, len);
       }
       outputStream.close();
   } catch (Exception e) {  
       e.printStackTrace();  
   }
}
   @ResponseBody
   @RequestMapping(value="allshop1",produces="text/html;charset=UTF-8")
   public String allshop1(HttpSession session){
   	
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<ul class='cate_list'>");
   	List<Shop> ls=shopservice.getallshop1();
   	for(int i=0;i<ls.size();i++){
   		Shop shop=ls.get(i);
//   	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//   	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//   	sb=sb.append(shop.getDcategory()+"<br/>");
//   	sb=sb.append("</div>");
   	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='400' height='280' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	}
   	sb=sb.append("</ul>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="allshop2",produces="text/html;charset=UTF-8")
   public String allshop2(HttpSession session){
   	
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<ul class='cate_list'>");
   	List<Shop> ls=shopservice.getallshop2();
   	for(int i=0;i<ls.size();i++){
   		Shop shop=ls.get(i);
//   	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//   	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//   	sb=sb.append(shop.getDcategory()+"<br/>");
//   	sb=sb.append("</div>");
   	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='400' height='280' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	}
   	sb=sb.append("</ul>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="allshop3",produces="text/html;charset=UTF-8")
   public String allshop3(HttpSession session){
   	
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<ul class='cate_list'>");
   	List<Shop> ls=shopservice.getallshop3();
   	for(int i=0;i<ls.size();i++){
   		Shop shop=ls.get(i);
//   	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//   	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//   	sb=sb.append(shop.getDcategory()+"<br/>");
//   	sb=sb.append("</div>");
   	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='400' height='280' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	}
   	sb=sb.append("</ul>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="allshop4",produces="text/html;charset=UTF-8")
   public String allshop4(HttpSession session){
   	
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<ul class='cate_list'>");
   	List<Shop> ls=shopservice.getallshop4();
   	for(int i=0;i<ls.size();i++){
   		Shop shop=ls.get(i);
//   	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//   	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//   	sb=sb.append(shop.getDcategory()+"<br/>");
//   	sb=sb.append("</div>");
   	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='400' height='280' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	}
   	sb=sb.append("</ul>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="allshop5",produces="text/html;charset=UTF-8")
   public String allshop5(HttpSession session){
   	
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<ul class='cate_list'>");
   	List<Shop> ls=shopservice.getallshop5();
   	for(int i=0;i<ls.size();i++){
   		Shop shop=ls.get(i);
//   	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//   	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//   	sb=sb.append(shop.getDcategory()+"<br/>");
//   	sb=sb.append("</div>");
   	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='400' height='280' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	}
   	sb=sb.append("</ul>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="allshop6",produces="text/html;charset=UTF-8")
   public String allshop6(HttpSession session){
   	
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<ul class='cate_list'>");
   	List<Shop> ls=shopservice.getallshop6();
   	for(int i=0;i<ls.size();i++){
   		Shop shop=ls.get(i);
//   	sb=sb.append("<div style='width:50%;display:inline-block;line-height:250%;'><img src='shoppicture?sno="+shop.getShopno()+"' height='150px' width='150px'/><br/><a style='color:#000000' href='getshoptotalfood/"+shop.getShopno()+"'>"+shop.getShopname()+"</a><br/>");
//   	sb=sb.append("销量"+shop.getShopvolume()+"<br/>");
//   	sb=sb.append(shop.getDcategory()+"<br/>");
//   	sb=sb.append("</div>");
   	sb=sb.append("<li><div class='img'><img src='shoppicture?sno="+shop.getShopno()+"' width='400' height='280' /></a></div><div class='price'>销量:"+shop.getShopvolume()+"</div><div class='name'><a >"+shop.getShopname()+"</a></div><div class='carbg'><a href='#' class='ss'>收藏</a><a href='getshoptotalfood/"+shop.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	}
   	sb=sb.append("</ul>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="pou",produces="text/html;charset=UTF-8")
   public String shangjiatuijian(HttpSession session){
	   String userid=(String) session.getAttribute("userid");
		int userno=userservice.getuserno(userid);
		List<Shtj1> s=shopservice.shangjiatuijian1(userno);
		for(int i=0;i<s.size();i++){
			s.get(i).setXiangsiren(shopservice.shangjiatuijian2(userno, s.get(i).getShangjiaid()));
			s.get(i).setShangjiaid2(shopservice.shangjiatuijian3(s.get(i).getXiangsiren(),s.get(i).getShangjiaid()));
		    s.get(i).setCishu2(shopservice.shangjiatuijian4(s.get(i).getXiangsiren(),s.get(i).getShangjiaid()));
		double q=Math.sqrt(s.get(i).getCishu())*Math.sqrt(s.get(i).getCishu2());
		double w=1/q;
		s.get(i).setQuanzhi(q);
		}
		int yyy=0;
		for(int i=0;i<s.size();i++){
			if(i==0){yyy=0;}
			else{
				if(s.get(i).getQuanzhi()>s.get(yyy).getQuanzhi())
				{
					yyy=i;
				}
			}
		}
		int shopno=s.get(yyy).getShangjiaid2();
		Shop only=shopservice.getonlyshop(shopno);
		Shop only2=shopservice.getonlyshop(11);
   	StringBuilder sb=new StringBuilder();
   	sb=sb.append("<li  style='height:250px;length:209px;'><div class='img'><a href='#'><img src='shoppicture?sno="+shopno+"' width='185' height='162' /></a></div><div class='name'>"+only.getShopname()+"</div><div class='price'>销量:"+only.getShopvolume()+"<a href='getshoptotalfood/"+only.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	sb=sb.append("<li  style='height:250px;length:209px;'><div class='img'><a href='#'><img src='shoppicture?sno="+11+"' width='185' height='162' /></a></div><div class='name'>"+only2.getShopname()+"</div><div class='price'>销量:"+only2.getShopvolume()+"<a href='getshoptotalfood/"+only2.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   	return sb.toString();
   }
   @ResponseBody
   @RequestMapping(value="pou2",produces="text/html;charset=UTF-8")
   public String caipintuijian(HttpSession session){
	   String userid=(String) session.getAttribute("userid");
		int userno=userservice.getuserno(userid);
     List<Cptj1> cp=shopservice.caipintuijian1(userno);
for(int i=0;i<cp.size();i++){
	cp.get(i).setFenlei(shopservice.caipintuijian2(cp.get(i).getCaipinbianhao()));
	//if((shopservice.caipintuijian3(cp.get(i).getCaipinbianhao(), cp.get(i).getFenlei())).exist())
	cp.get(i).setCaipinbianhao2(shopservice.caipintuijian3(cp.get(i).getCaipinbianhao(), cp.get(i).getFenlei()));
	if(cp.get(i).getCaipinbianhao2()!=0){	
		cp.get(i).setCishu2(shopservice.caipintuijian4(cp.get(i).getCaipinbianhao2()));
	cp.get(i).setQuanzhong(Math.sqrt(cp.get(i).getCishu())*Math.sqrt(cp.get(i).getCishu2()));}
	else{cp.get(i).setQuanzhong(0);}

}
int yyy=0;
for(int i=0;i<cp.size();i++){
	if(i==0){yyy=0;}
	else{
		if(cp.get(i).getQuanzhong()>cp.get(yyy).getQuanzhong())
		{
			yyy=i;
		}
	}
}
int ss=cp.get(yyy).getCaipinbianhao2();
Dish dd=shopservice.getonlydish(ss);
Dish dd2=shopservice.getonlydish(11);
   	StringBuilder sb=new StringBuilder();
   sb=sb.append("<li  style='height:270px;length:209px;'><div class='img'><a href='#'><img src='cptp8?did="+ss+"' width='185' height='162' /></a></div><div class='name'>"+dd.getDishname()+"</div><div class='name'>￥"+dd.getDishprice()+"</div><div class='price'>销量:"+dd.getDishsales()+"<a href='getshoptotalfood/"+dd.getShopid()+"' class='j_car'>进入店铺购买</a></div></li>");
   	//sb=sb.append("<li><div class='img'><a href='#'><img src='shoppicture?sno="+11+"' width='185' height='162' /></a></div><div class='name'>"+only2.getShopname()+"</div><div class='price'>销量:"+only2.getShopvolume()+"<a href='getshoptotalfood/"+only2.getShopno()+"' class='j_car'>进入店铺</a></div></li>");
   sb=sb.append("<li  style='height:270px;length:209px;'><div class='img'><a href='#'><img src='cptp8?did="+11+"' width='185' height='162' /></a></div><div class='name'>"+dd2.getDishname()+"</div><div class='name'>￥"+dd2.getDishprice()+"</div><div class='price'>销量:"+dd2.getDishsales()+"<a href='getshoptotalfood/"+dd2.getShopid()+"' class='j_car'>进入店铺购买</a></div></li>");
   return sb.toString();
   }
   @RequestMapping(value="/test1")
   public String eqweqweqw(HttpSession session){
   	List<Shtj1> s=shopservice.shangjiatuijian1(4);
   	System.out.println(s.get(0).getShangjiaid());
   	System.out.println(s.get(0).getCishu());
   	return "ccccc";
   }
}
