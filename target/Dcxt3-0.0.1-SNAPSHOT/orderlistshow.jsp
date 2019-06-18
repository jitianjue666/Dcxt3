<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="../css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->
    
    <script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="../js/menu.js"></script>    
                
	<script type="text/javascript" src="../js/n_nav.js"></script>   
    
    <script type="text/javascript" src="../js/num.js">
    	var jq = jQuery.noConflict();
    </script>     
    
    <script type="text/javascript" src="../js/shade.js"></script>

<title>尤洪</title>
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
                	<a href="../chakanzijiorder">我的订单</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        
                        </div>
                    </div>    
                </div>
                <div class="ss_list">
                	<a href="../chakanzijihongbao">查看红包</a>
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
    <div class="logo"><a href="../Index.html"><img src="../images/logo.png" style="height:50px;width:150px"/></a></div>
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
    	购物车
        </div>  
        <!--End 商品分类详情 End-->                                                     

        <div class="m_ad">中秋送好礼！</div>
    </div>
</div>




<!--End Menu End--> 
<div class="i_bg">
	
    <!--Begin 筛选条件 Begin-->
   
    <!--End 筛选条件 End-->
    
  <div class="content mar_20">
    	<img src="../images/img1.jpg" />        
    </div>
    
    <!--Begin 第一步：查看购物车 Begin -->
    <div class="content mar_20">
   
    	<table border="0" class="car_tab" style="width:1200px; margin-bottom:50px;" cellspacing="0" cellpadding="0">
          <tr>
          <td class="car_th" width="450">商品图片</td>
            <td class="car_th" width="450">商品名称</td>

            <td class="car_th" width="150">购买数量</td>
            <td class="car_th" width="150">小计</td>
</tr>
          
          	<c:forEach items="${orderlist}" var="clazz" varStatus="statee">
          <tr class="car_tr">
            <td>
            	<div class="c_s_img" style="height:200px;width:300px" ><img src="../cptp8?did=${clazz.dishno}" width="200" height="200" /></div>
               
            </td>
            <td>
            	${clazz.dishmingzi}
               
            </td>
            <td align="center">
            	<div class="c_num">
                    ×${clazz.dishmount}
                </div>
            </td>
            <td align="center" style="color:#ff4e00;">￥${clazz.totalmount}</td>
             </tr>
             </c:forEach>
          
          <tr height="70">
          	<td colspan="6" style="font-family:'Microsoft YaHei'; border-bottom:0;">
            	<label class="r_rad"><input type="checkbox" name="clear" checked="checked" /></label><label class="r_txt"></label>
                <span class="fr">菜品总价：<b style="font-size:22px; color:#ff4e00;">${totalprice}元</b></span>
            </td>
          </tr>
          <tr valign="top" height="150">
          <td> <div id="hbs"></div></td>
          	<td colspan="6" align="right">
          	
            	<a href="../hongbaozhifu/${orderno}"><img src="../images/hongbao.jpg"  style="height:40px;width:100px"/></a>&nbsp; &nbsp; <a href="../xiadan"><img style="height:40px;width:100px" src="../images/buy2.gif" /></a>
            </td>
          </tr>
        </table>
        
    </div>
    
    <!--Begin Footer Begin -->
    <div class="b_btm_bg bg_color">
        <div class="b_btm">
            <table border="0" style="width:210px; height:62px; float:left; margin-left:75px; margin-top:30px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="72"><img src="../images/b_1.gif" width="62" height="62" /></td>
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
            <div class="b_er_c"><img src="../images/er.gif" width="118" height="118" /></div>
            <img src="../images/ss.png" />
        </div>
    </div>    
    <div class="btmbg">
		<div class="btm">
        	<br />
            <img src="../images/b_1.gif" width="98" height="33" /><img src="../images/b_2.gif" width="98" height="33" /><img src="../images/b_3.gif" width="98" height="33" /><img src="../images/b_4.gif" width="98" height="33" /><img src="../images/b_5.gif" width="98" height="33" /><img src="../images/b_6.gif" width="98" height="33" />
        </div>    	
    </div>
    <!--End Footer End -->    
</div>


</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>