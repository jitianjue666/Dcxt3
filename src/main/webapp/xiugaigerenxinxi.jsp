<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->
    
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>    
                
	<script type="text/javascript" src="js/n_nav.js"></script>   
    
    <script type="text/javascript" src="js/num.js">
    	var jq = jQuery.noConflict();
    </script>     
    
    <script type="text/javascript" src="js/shade.js"></script>
    
<title>啄木鸟</title>
</head>
<body>  
<!--Begin Header Begin-->
<!--Begin Header Begin-->
<div class="soubg">
	<div class="sou">
    	<!--Begin 所在收货地区 Begin-->

        <!--End 所在收货地区 End-->
        <span class="fr">
        	
        	<span class="ss">
            	
                <div class="ss_list">
                	<a href="chakanzijiorder">我的订单</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        
                        </div>
                    </div>    
                </div>
                <div class="ss_list">
                	<a href="chakanzijihongbao">查看红包</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                      
                        </div>
                    </div>    
                </div>
                  <div class="ss_list">
                	<a href="gerenxinxi">个人信息</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">

                        </div>
                    </div>
                </div>
               <span class="ss_list" id="ertyu"></span>
            </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
           
        </span>
    </div>
</div>
<div class="top">
    <div class="logo" style="height:80px;length:200px;"><a href="shoplist.jsp"><img src="images/logo.png" style="height:80px;length:150px;" /></a></div>
    <div class="search">
    	<form>
        	<input type="text" value="" class="s_ipt" />
            <input type="submit" value="搜索" class="s_btn" />
        </form>                      
        
    </div>
    
</div>
<!--End Header End--> 
<!--Begin Menu Begin-->
<div class="menu_bg">
	<div class="menu">
    	<!--Begin 商品分类详情 Begin-->    
    
        </div>  
        <!--End 商品分类详情 End-->                                                     

        <div class="m_ad">中秋送好礼！</div>
    </div>
</div>




<!--End Menu End--> 
<div class="i_bg bg_color">
	
    <!--Begin 筛选条件 Begin-->
   
    <!--End 筛选条件 End-->
    <div class="m_content">
   		<div class="m_left">
        	<div class="left_n">管理中心</div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">订单中心</div>
                <ul>
                	<li><a href="Member_Order.html">我的订单</a></li>
                    <li><a href="Member_Address.html">收货地址</a></li>
                    <li><a href="#">缺货登记</a></li>
                    <li><a href="#">跟踪订单</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg2">会员中心</div>
                <ul>
                	<li><a href="Member_User.html">用户信息</a></li>
                    <li><a href="Member_Collect.html">我的收藏</a></li>
                    <li><a href="Member_Msg.html">我的留言</a></li>
                    <li><a href="Member_Links.html">推广链接</a></li>
                    <li><a href="#">我的评论</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg3">账户中心</div>
                <ul>
                	<li><a href="Member_Safe.html">账户安全</a></li>
                    <li><a href="Member_Packet.html" class="now">我的红包</a></li>
                    <li><a href="Member_Money.html">资金管理</a></li>
                </ul>
            </div>
            <div class="left_m">
            	<div class="left_m_t t_bg4">分销中心</div>
                <ul>
                	<li><a href="Member_Member.html">我的会员</a></li>
                    <li><a href="Member_Results.html">我的业绩</a></li>
                    <li><a href="Member_Commission.html">我的佣金</a></li>
                    <li><a href="Member_Cash.html">申请提现</a></li>
                </ul>
            </div>
        </div>

 <div class="m_right">
            <p></p>		
            
			<div class="mem_tit">
            	修改个人信息
            </div>
            <form action="xiugaigerenxinxi">
            <table border="0" class="mem_tab" style="width:930px; margin-bottom:30px;" cellspacing="0" cellpadding="0">
              <tr>
              	<td class="ma_a" colspan="2" style="padding:12px 50px;">
                	<span class="fl" style="color:#ff4e00; font-size:14px;">消费者编号：<b>${user1.userno }</b></span>
                    <span class="fr"><a href="#">消费者id</a>|<a href="#">${user1.userid }</a></span>        
                </td>
              </tr>
              <tr>                                                                                                                                                    
                <td width="150" class="tx_l">密码</td>                                                                                                                                         
                <td width="680"><input type="password" name="userpassword" value="${user1.userpassword }" class="tx_ipt" /></td>
              </tr>
              <tr>
                <td class="tx_l">手机号</td>
                <td><input type="text" name="usercellphone" value="${user1.usercellphone }" class="tx_ipt" /></td>
              </tr>
              <tr>
                <td class="tx_l">邮箱</td>
                <td><input type="text" name="useremail" value="${user1.useremail }" class="tx_ipt" /><input type="hidden" name="userno" value="${user1.userno }" class="tx_ipt" /></td>
             </tr>
          
        
              <tr height="70">
                <td colspan="2" align="center">
                	<input type="submit" value="确认修改" class="btn_tj" /> &nbsp; &nbsp; <input type="reset" value="重置表单" class="btn_tj" />
                </td>
              </tr>
			</table>
            </form>
</div>
           
 
    </div>
    <div class="b_nav">
    	<dl>                                                                                            
        	<dt><a href="#">新手上路</a></dt>
            <dd><a href="#">售后流程</a></dd>
            <dd><a href="#">购物流程</a></dd>
            <dd><a href="#">订购方式</a></dd>
            <dd><a href="#">隐私声明</a></dd>
            <dd><a href="#">推荐分享说明</a></dd>
        </dl>
        <dl>
        	
            <dd><a href="#">支付方式说明</a></dd>
        </dl>
        <dl>
        	<dt><a href="#">会员中心</a></dt>
            <dd><a href="#">资金管理</a></dd>
            <dd><a href="#">我的收藏</a></dd>
            <dd><a href="#">我的订单</a></dd>
        </dl>
        <dl>
        	<dt><a href="#">服务保证</a></dt>
            <dd><a href="#">退换货原则</a></dd>
            <dd><a href="#">售后服务保证</a></dd>
            <dd><a href="#">产品质量保证</a></dd>
        </dl>
        <dl>
        	<dt><a href="#">联系我们</a></dt>
            <dd><a href="#">网站故障报告</a></dd>
            <dd><a href="#">购物咨询</a></dd>
            <dd><a href="#">投诉与建议</a></dd>
        </dl>
        <div class="b_tel_bg">
        	<a href="#" class="b_sh1">新浪微博</a>            
        	<a href="#" class="b_sh2">腾讯微博</a>
            <p>
            服务热线：<br />
            <span>18846939958</span>
            </p>
        </div>
        <div class="b_er">
            <div class="b_er_c"><img src="images/er.gif" width="118" height="118" /></div>
            <img src="images/ss.png" />
        </div>
    </div>    
    <div class="btmbg">
		<div class="btm">
        	<br />
            <img src="images/b_1.gif" width="98" height="33" /><img src="images/b_2.gif" width="98" height="33" /><img src="images/b_3.gif" width="98" height="33" /><img src="images/b_4.gif" width="98" height="33" /><img src="images/b_5.gif" width="98" height="33" /><img src="images/b_6.gif" width="98" height="33" />
        </div>    	
    </div>
    <!--End Footer End -->    
</div>


</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>