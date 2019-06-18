package com.handler;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.GlyService;
import com.service.ShopService;
import com.service.UserService;
import com.vo.Order;
import com.vo.Paihaolist;
import com.vo.Shangpu;
import com.vo.Shop;
import com.vo.Shopphoto;
import com.vo.Sq;
import com.vo.User;
import com.vo.Xiaofeizhe;

@Controller
public class GlyHandler {
@Autowired
UserService userservice;
@Autowired
ShopService shopservice;
@Autowired
GlyService glyservice;
@ResponseBody
@RequestMapping(value="/getnumber",produces="text/html;charset=UTF-8")
public String getnumber(){
	System.out.println("8888888888888888");
	int s=glyservice.getwclnumber();
	System.out.println(s);
	System.out.println("99999999999999999");
	String message="还有"+s+"个商铺申请信息等待处理";
	return message;}
@RequestMapping("shenheyutongguo")
public String getxinxi(){
	return "allshenqing";
}

@RequestMapping("/getallweishenqing")
public String getallweishenqing(Model mv){
List<Sq> qqq=glyservice.getallwei();

for( int i=0;i<qqq.size();i++) {//内部不锁定，效率最高，但在多线程要考虑并发操作的问题。
    System.out.println(qqq.get(i).toString());
    System.out.println(qqq.get(i).getDcategory());
    System.out.println(qqq.get(i).getSphoto());
    mv.addAttribute("pp", qqq.get(i));
}
return "quanbushenqing";
}
@ResponseBody
@RequestMapping(value="/getqbwsq",produces="text/html;charset=UTF-8")
public String getqbwsq(){
	System.out.println("8888888888888888");
	List<Sq> qq=glyservice.getallwei();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<qq.size();i++){
		System.out.println(qq.get(i).getDcategory());
		Shopphoto ss=glyservice.sp(qq.get(i).getSoname());
		int shopnumber=ss.getSno();
		sb=sb.append("<div class='row tm-content-row'>");
		sb=sb.append( "<div class='tm-block-col tm-col-avatar'><div class='tm-bg-primary-dark tm-block tm-block-avatar'><h2 class='tm-block-title'>商铺图片</h2><div class='tm-avatar-container'><img src='newsPic?soname="+qq.get(i).getSoname()+"' alt='Avatar' class='tm-avatar img-fluid mb-4'/></div></div></div>");
		sb=sb.append("<div class='tm-block-col tm-col-account-settings'><div class='tm-bg-primary-dark tm-block tm-block-settings'> <h2 class='tm-block-title'>基本信息</h2> <div class='form-group col-lg-6'><label for='name'>商铺名称</label><strong class='form-control validate'>"+qq.get(i).getShopname()+"</strong> </div><div class='form-group col-lg-6'><label for='email'>店主姓名</label><strong class='form-control validate'>"+qq.get(i).getSoname()+"</strong></div><div class='form-group col-lg-6'><label for='password'>证件信息</label><strong class='form-control validate'>"+qq.get(i).getSozjno()+"</strong> </div><div class='form-group col-lg-6'><label for='password2'>餐厅分类</label><strong class='form-control validate'>"+qq.get(i).getDcategory()+"</strong></div> <div class='form-group col-lg-6'><label for='phone'>申请时间</label><strong class='form-control validate'>"+qq.get(i).getShopapplytime()+"</strong> </div><div class='col-12'><form  action='panduankaidianshenqing/"+shopnumber+"/1'><input type='submit' value='通过申请' class='btn btn-primary btn-block text-uppercase'/></form></div><div class='col-12'><form  action='panduankaidianshenqing/"+shopnumber+"/2'><input type='submit' value='拒绝申请' class='btn btn-primary btn-block text-uppercase'/></form></div></div></div> </div></div>");
		
		//sb=sb.append("<table border='4'><tr><td width='100'>商铺名称</td><td width='100'>店主姓名</td><td width='200'>证件信息</td><td width='100'>食品分类</td><td width='100'>申请时间</td></tr>");
		//sb=sb.append("<tr><td width='100'>"+qq.get(i).getShopname()+"</td><td width='100'>"+qq.get(i).getSoname()+"</td><td width='200'>"+qq.get(i).getSozjno()+"</td><td width='100'>"+qq.get(i).getDcategory()+"</td><td width='100'>"+qq.get(i).getShopapplytime()+"</td></tr>");
		//sb=sb.append("<tr><td colspan='5'>店铺照片</td></tr>");
		//sb=sb.append("<tr><td colspan='5' text-align='center' height='400'><img src="+"'newsPic?soname="+qq.get(i).getSoname()+"' height='332' width='500'  "+"/></td></tr>");
		//sb=sb.append("<tr><td colspan='3' align='right'><form  action='panduankaidianshenqing/"+shopnumber+"/1'><input type='submit' value='通过申请'/></form></td>");
		//sb=sb.append("<td colspan='2' align='left'><form action='panduankaidianshenqing/"+shopnumber+"/2'><input type='submit' value='拒绝申请'/></form></td></tr>");
		//sb=sb.append("</table>");
		sb=sb.append("</div>");
	}
	System.out.println("99999999999999999");
	
	return sb.toString();}
@RequestMapping(value="newsPic")
public void newsPic(String soname, HttpServletResponse response, Model model){ 
   //News news = fdyfzxService.findNewsById(Integer.parseInt(id));
   Shopphoto ss=glyservice.sp(soname);
   byte[] newsPic = ss.getSphoto();
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
@RequestMapping("/panduankaidianshenqing/{shopnumber}/{choose}")
public String getAll(@PathVariable("shopnumber")int shopnumber,@PathVariable("choose")int choose,HttpSession session){
	String glyid=(String) session.getAttribute("userid");
	User gly=glyservice.getglymessage(glyid);
	int adminno=gly.getUserno();
	Date nowtime=new Date();
    if(choose==1){glyservice.tongguoshenqing(shopnumber, adminno, nowtime);
    Paihaolist paihaolist=new Paihaolist();
    paihaolist.setSellerid(shopnumber);
    glyservice.add0(paihaolist);
    glyservice.add00(shopnumber);
    }
    else if(choose==2){glyservice.jujueshenqing(shopnumber, adminno, nowtime);}
	return "redirect:/quanbushenqing.jsp";
}
@RequestMapping("allxiaofeizhe")
public String getallxiaofeizhe(Model m){
	List<User> b=glyservice.getallxiaofeizhe();
	List<Xiaofeizhe> xfzlist=new LinkedList<Xiaofeizhe>();
	for(int i=0;i<b.size();i++){
		Xiaofeizhe a=new Xiaofeizhe();
		a.setXiaofeizhebianhao(b.get(i).getUserno());
		a.setXiaofeizhedianhua(b.get(i).getUsercellphone());
		a.setXiaofeizheid(b.get(i).getUserid());
		a.setXiaofeizhemima(b.get(i).getUserpassword());
		a.setXiaofeizheyouxiang(b.get(i).getUseremail());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(b.get(i).getUserregistertime());
		a.setTime1(dateString);
		a.setXiaofeizhexiadancishu(glyservice.huoqvxiadancishu(b.get(i).getUserno()));
		List<Order> q=glyservice.getzijiorder3(b.get(i).getUserno());
		double zonghuafei=0;
		for(int j=0;j<q.size();j++){
			zonghuafei=zonghuafei+q.get(j).getTotalmount();
		}
		a.setXiaofeizhegongjixiaofeijine(zonghuafei);
		xfzlist.add(a);
	}
	m.addAttribute("xfzlist", xfzlist);
	return "allxiaofeizhe";
}
@RequestMapping("allshangpu")
public String getallshangpu(Model m){
	List<Shop> c=glyservice.getallshangpu();
	List<Shangpu> splist=new LinkedList<Shangpu>();
	for(int i=0;i<c.size();i++){
		Shangpu d=new Shangpu();
	    if(c.get(i).getShopadopttime()!=null){
	    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = formatter.format(c.get(i).getShopadopttime());
			d.setTime2(dateString);
	    	}
	    d.setShangjiabianhao(c.get(i).getShopno());
	    d.setShangpumingzi(c.get(i).getShopname());
	    SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString2 = formatter2.format(c.get(i).getShopapplytime());
	    d.setTime3(dateString2);
	    d.setShangpuyongyouzhebianhao(c.get(i).getOwnerno());
	    d.setShangpuyongyouzheid(userservice.getuserid(c.get(i).getOwnerno()));
	    int zt=c.get(i).getShopstate();
	    if(zt==1) {d.setShangpuzhuangtai("待审核");}
	    else if(zt==2) {d.setShangpuzhuangtai("已开张");
	    d.setShangpuzongxiaoliang(glyservice.huoqvshoudancishu(c.get(i).getShopno()));
	    List<Order> w=glyservice.getzijiorder4(c.get(i).getShopno());
	    double zongshouru=0;
	    for(int j=0;j<w.size();j++){
	    	if(w.get(i).getTotalmount()!=null){
	    		
	    		zongshouru=zongshouru+w.get(j).getTotalmount();}
	    	
	    }
	    d.setShangpuzongshouru(zongshouru);
	    }
	    else if(zt==3) {d.setShangpuzhuangtai("申请失败");}
		splist.add(d);
	}
	m.addAttribute("splist", splist);
	return "allshangpu";
}
@RequestMapping("/shanchuyonghu")
public String shanchuyonghu(int userno){
userservice.shanchuyonghu(userno);
return "redirect:allxiaofeizhe.action";
}
@RequestMapping("/xiugaixiaofeizhe1")
public String xiugaixiaofeizhe1(int userno,Model m){
User uuuqwe=userservice.huoqvgerenxinxi(userno);
m.addAttribute("uuuqwe", uuuqwe);
return "xiugaixiaofeizhe";
}
@RequestMapping("xiugaigerenxinxi2")
public String xiugaigerenxinxi(int userno,String userpassword,String useremail,String usercellphone,Model m,HttpSession session){
	String userid=(String) session.getAttribute("userid");
	int buyerno=userservice.getuserno(userid);
	//User user1=userService.huoqvgerenxinxi(buyerno);
	//m.addAttribute("user1", user1);
	userservice.xiugaigerenxinxi(userno, userpassword, useremail, usercellphone);
	return "redirect:allxiaofeizhe.action";
}
@RequestMapping("/shanchushangjia")
public String shanchushangjia(int shopno){
shopservice.sahnchushangjia(shopno);
return "redirect:allshangpu.action";
}
}
