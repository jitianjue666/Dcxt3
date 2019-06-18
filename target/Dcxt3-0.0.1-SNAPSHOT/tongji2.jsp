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
 <h1><img src="images/admin_logo.png"/></h1>
 <ul class="rt_nav">
  <li><a href="http://www.mycodes.net" target="_blank" class="website_icon">站点首页</a></li>
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
    <dt>统计</dt>
    <dd><a href="tongji1">订单数统计</a></dd>
     <dd><a href="tongji2">收入统计</a></dd>
     <dd><a href="tongji3">菜品销量统计</a></dd>
         <dd><a href="tongji4">月度订单数统计</a></dd>
     <dd><a href="tongji5">月度收入统计</a></dd>
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
       <h2 class="fl">数据信息统计</h2>
      </div>
    <div class="dataStatistic">
        <div id="line">
        </div>
    </div>
 </div>
</section>
本店总销售额为{r}元
<script src="js/amcharts.js" type="text/javascript"></script>
<script src="js/serial.js" type="text/javascript"></script>
<script src="js/pie.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function (e) {
        GetSerialChart();
        MakeChart(json2);
    });
var json2 = [
	  { "name": "1-2", "value": '${w1}' },
	  { "name": "2-3", "value": '${w2}' },
	  { "name": "3-4", "value": '${w3}' },
	  { "name": "4-5", "value": '${w4}' },
	  { "name": "5-6", "value": '${w5}' },
	  { "name": "6-7", "value": '${w6}' },
	  { "name": "7-8", "value": '${w7}' },
	  { "name": "8-9", "value": '${w8}' },
	  { "name": "9-10", "value": '${w9}' },
	  { "name": "10-11", "value": '${w10}' },
	  { "name": "11-12", "value": '${w11}' },
	  { "name": "12-13", "value": '${w12}' },
	  { "name": "13-14", "value": '${w13}' },
	  { "name": "14-15", "value": '${w14}' },
	  { "name": "15-16", "value": '${w15}' },
	  { "name": "16-17", "value": '${w16}' },
	  { "name": "17-18", "value": '${w17}' },
	  { "name": "18-19", "value": '${w18}' },
	  { "name": "19-20", "value": '${w19}' },
	  { "name": "20-21", "value": '${w20}' },
	  { "name": "21-22", "value": '${w21}' }
  ]
    //折线图
    AmCharts.ready(function () {
        var chart2 = new AmCharts.AmSerialChart();
        chart2.dataProvider = json2;
        chart2.categoryField = "name";
        chart2.angle = 30;
        chart2.depth3D = 20;
        //标题
        chart2.addTitle("分时段总收入统计", 15);  
        var graph = new AmCharts.AmGraph();
        chart2.addGraph(graph);
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
        var categoryAxis = chart2.categoryAxis;
        categoryAxis.autoGridCount = false;
        categoryAxis.gridCount = json2.length;
        categoryAxis.gridPosition = "start";
        chart2.write("line");
    });
</script>

</body>
</html>
