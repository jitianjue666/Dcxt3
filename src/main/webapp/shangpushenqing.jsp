<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style3.css">
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery.js"></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>

<script>

	(function($){
		$(window).load(function(){
			
			$("a[rel='load-content']").click(function(e){
				e.preventDefault();
				var url=$(this).attr("href");
				$.get(url,function(data){
					$(".content .mCSB_container").append(data); //load new content inside .mCSB_container
					//scroll-to appended content 
					$(".content").mCustomScrollbar("scrollTo","h2:last");
				});
			});
			
			$(".content").delegate("a[href='top']","click",function(e){
				e.preventDefault();
				$(".content").mCustomScrollbar("scrollTo",$(this).attr("href"));
			});
			
		});
	})(jQuery);
</script>
</head>
<body>
<!--header-->
<header>
 <h1><img src="shopPic"/></h1>
 <ul class="rt_nav">
  <li><a href="http://www.mycodes.net" target="_blank" class="website_icon"><div id="spzp2"  ></a></li>
  <li><a href="#" class="clear_icon">清除缓存</a></li>
  <li><a href="#" class="admin_icon">DeathGhost</a></li>
  <li><a href="#" class="set_icon">账号设置</a></li>
  <li><a href="login.html" class="quit_icon">安全退出</a></li>
 </ul>
</header>
<!--aside nav-->
<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="index.html">起始页</a></h2>
 <ul>
  <li>
   <dl>
    <dt>菜品管理</dt>
    <!--当前链接则添加class:active-->
    <dd><a href="xinzengcaipin.jsp" class="active">新增菜品</a></dd>
    <dd><a href="xiugaicaipinxinxi">修改菜品信息</a></dd>
    <dd><a href="xiugaicaipintupian">修改菜品图片</a></dd>
    <dd><a href="guanlicaipinfenlei.jsp">管理菜品分类</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>红包</dt>
    <dd><a href="zijihongbaoguanli">红包管理</a></dd>
   
   </dl>
  </li>
  <li>
   <dl>
    <dt>订单管理</dt>
    <dd><a href="gaishangpusuoyouweiwanchengdingdan">查看所有未完成订单</a></dd>
    <dd><a href="getbendiansuoyoudingdan">查看所有订单</a></dd>

   </dl>
  </li>
  <li>
   <dl>
    <dt>基础设置</dt>
    <dd><a href="setting.html">站点基础设置示例</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>配送与支付设置</dt>
    <dd><a href="express_list.html">配送方式</a></dd>
    <dd><a href="pay_list.html">支付方式</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>在线统计</dt>
    <dd><a href="discharge_statistic.html">流量统计</a></dd>
    <dd><a href="sales_volume.html">销售额统计</a></dd>
   </dl>
  </li>
  <li>
   <p class="btm_infor"></p>
  </li>
 </ul>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <div class="page_title">
       <h2 class="fl">商铺申请</h2>
      </div>
      <section>
      <form action="shangpushenqing" method="post">
      <ul class="ulColumn2">
       <li>
        <span class="item_name" style="width:120px;">店名：</span>
        <input type="text" class="textbox textbox_225" name="shopname"/>
        <span class="errorTips">一般不超过10个字符</span>
       </li>
       
       <li>
        <span class="item_name" style="width:120px;">业主姓名：</span>
        <input type="text" class="textbox textbox_295" name="soname"/>
     
       </li>
       <li>
        <span class="item_name" style="width:120px;">联系电话：</span>
        <input type="text" class="textbox textbox_295" name="cellphone"/>
        
       </li>
      
       <li>
        <span class="item_name" style="width:120px;">证件号码：</span>
        <input type="text" class="textbox textbox_295" name="sozjno"/>
       </li>
  <li>
     <input type="radio" name="dcategory" value="中式简餐" /> 中式简餐
             <input type="radio" name="dcategory" value="米粉面馆" /> 米粉面馆
             <input type="radio" name="dcategory" value="烧烤海鲜" /> 烧烤海鲜
             <input type="radio" name="dcategory" value="西式快餐" /> 西式快餐
             <input type="radio" name="dcategory" value="炸鸡炸串" /> 炸鸡炸串
             <input type="radio" name="dcategory" value="异域风情" /> 异域风情
       </li>
       
       <li>
        <span class="item_name" style="width:120px;"></span>
        <input type="submit" class="link_btn" value="下一步"/>
       </li>
      </ul>
      </form>
     </section>
</section>
<script src="js/amcharts.js" type="text/javascript"></script>
<script src="js/serial.js" type="text/javascript"></script>
<script src="js/pie.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function (e) {
        GetSerialChart();
        MakeChart(json);
    });
    var json = [
  { "name": "数据1", "value": "35" },
  { "name": "数据2", "value": "60" },
  { "name": "数据3", "value": "22" },
  { "name": "数据4", "value": "65" },
  { "name": "数据5", "value": "35" },
  { "name": "数据6", "value": "22" },
  { "name": "数据7", "value": "43" },
  { "name": "数据8", "value": "55" }
  ]
    //折线图
    AmCharts.ready(function () {
        var chart = new AmCharts.AmSerialChart();
        chart.dataProvider = json;
        chart.categoryField = "name";
        chart.angle = 30;
        chart.depth3D = 20;
        //标题
        //chart.addTitle("3D折线图Demo", 15);  
        var graph = new AmCharts.AmGraph();
        chart.addGraph(graph);
        graph.valueField = "value";
        //背景颜色透明度
        graph.fillAlphas = 0.3;
        //类型
        graph.type = "line";
        //圆角
        graph.bullet = "round";
        //线颜色
        graph.lineColor = "#8e3e1f";
        //提示信息
        graph.balloonText = "[[name]]: [[value]]";
        var categoryAxis = chart.categoryAxis;
        categoryAxis.autoGridCount = false;
        categoryAxis.gridCount = json.length;
        categoryAxis.gridPosition = "start";
        chart.write("line");
    });

</script>
</body>
</html>
