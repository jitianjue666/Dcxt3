<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="js/jquery.1.11.1.js"></script>
 <script type="text/javascript" src="js/n_nav4.js"></script>t>
<title>全部餐厅</title>
</head>
<body>  
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
    <div class="logo"><a href="shoplist.jsp"><img src="images/logo.png" style="height:50px;width:150px"/></a></div>
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
    	<div class="nav">
        	<div class="nav_t">全部店铺分类</div>
            <div class="leftNav none">
                <ul>      
                    <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist.jsp">全部店铺</span>
                        </div>
                  </li>
                                 <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist1.jsp">中式简餐</span>
                        </div>
                  </li>
                                  <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist2.jsp">米粉面馆</span>
                        </div>
                  </li>
                                  <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist3.jsp">烧烤海鲜</span>
                        </div>
                  </li>
                                  <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist4.jsp">西式快餐</span>
                        </div>
                  </li>
                                  <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist5.jsp">炸鸡炸串</span>
                        </div>
                  </li>	
                           <li>
                    	<div class="fj">
                        	<span class="n_img"><span></span><img src="images/nav1.png" /></span>
                            <span class="fl"><a href="shoplist6.jsp">异域风情</span>
                        </div>
                  </li>
                </ul>            
            </div>
        </div>  
        <!--End 商品分类详情 End-->                                                     
    	<ul class="menu_r">                                                                                                                                               
        	<li><a href="shoplist.jsp">首页</a></li>
            <li><a href="shoplist1.jsp">中式简餐</a></li>
            <li><a href="shoplist2.jsp">米粉面馆</a></li>
            <li><a href="shoplist3.jsp">烧烤海鲜</a></li>
            <li><a href="shoplist4.jsp">西式快餐</a></li>
            <li><a href="shoplist5.jsp">炸鸡炸串</a></li>
            <li><a href="shoplist6.jsp">异域风情</a></li>
           
        </ul>
        <div class="m_ad">中秋送好礼！</div>
    </div>
</div>




<!--End Menu End--> 
<div class="i_bg">
	
    <!--Begin 筛选条件 Begin-->
   
    <!--End 筛选条件 End-->
    
    <div class="content mar_20">
        <div class="l_history">
            <div class="his_t">
                <span class="fl">商家推荐</span>
            </div>
            <ul>
                <div id="pou9">
                </div>
            </ul>
            <div class="his_t">
                <span class="fl">菜品推荐</span>
            </div>
            <ul>
                <div id="pou10"  style="height:540px;length:209px;">

                </div>
            </ul>
        </div>
        <div class="l_list">
        	<div class="list_t">
            	<span class="fl list_or">

   
                   
                </span>
             
            </div>
            <div class="list_c">
            	<div id="qwert">

                </div>
                
                
                
            </div>
        </div>
    </div>
    
    <!--Begin Footer Begin -->
    <div class="b_btm_bg bg_color">
        <div class="b_btm">
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="72"><img src="images/b1.png" width="62" height="62" /></td>
                <td><h2>保障</h2>放心购买</td>
              </tr>
            </table>
			
          
           
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
