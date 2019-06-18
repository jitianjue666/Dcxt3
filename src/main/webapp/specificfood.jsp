<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Fruits</title>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="../css/style2.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

 <script type="text/javascript">
 $(document).ready(function(){
	 var q = document.getElementsByName('ppp');
	 var a=q.length;
	 
	 for(var j=0;j<a;j++){
		 var val=q[j].id;
		 
		 $("#"+val).load("../getnow?p="+val);
	 }
	 //$("#spzp2").load("getspzp2");
      });
 </script>
 <script type="text/javascript">
function plus(n) {

	  $.ajax({  
          type: 'POST',  
          url: '../foodplus', 
          data: { "dishid": $(n).attr("name")},  
          success: function(data) {  
           
          }  
      }); 
	  var a=$(n).attr("name");
	  var number=a+"q";
	  var b= $("#"+number).text();
	  var c=parseInt(b)+1;
	  $("#"+number).text(c);
}
</script>
 <script type="text/javascript">
function minus(n) {

	  $.ajax({  
          type: 'POST',  
          url: '../foodminus',  
          data: { "dishid": $(n).attr("name")},  
          success: function(data) {  
           
          }  
      }); 
	  var a=$(n).attr("name");
	  var number=a+"q";
	  var b= $("#"+number).text();
	  if(b>0){ 
		  var c=parseInt(b)-1;
	  $("#"+number).text(c);}
	 
}
</script>
<!----webfonts---->
<link href='../http://fonts.googleapis.com/css?family=Exo+2:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
</head>
<body>
	<div class="header">
		<div class="container">
		  <div class="header_top">
			<ul class="phone">
				<li class="phone_left"><i class="mobile"> </i><span>1-200-346-2986</span></li>
				<li class="phone_right">Free Ground Shipping for Products over $100</li>
				<div class="clearfix"></div>
			</ul>
			<ul class="social">
				 <li><a href=""> <i class="tw"> </i> </a></li>
				 <li><a href=""><i class="fb"> </i> </a></li>
				 <li><a href=""><i class="rss"> </i> </a></li>
				 <li><a href=""><i class="msg"> </i> </a></li>
				 <div class="clearfix"> </div>
			</ul>
			<ul class="account">
				<li><a href="../account.html">My Account</a></li>
			</ul>
			<ul class="shopping_cart">
			   <a href="../chakangouwuche"><li class="shop_left"><i class="cart"> </i><span>购物车</span></li></a>
			   <a href="../jiesuan/${shopid}"><li class="shop_right"><span>立即结算</span></li></a>
			   <div class="clearfix"> </div>
			</ul>
			<div class="clearfix"></div>
		</div>
		<div class="header_bottom">
		  <div class="header_nav">
      		<div class="logo">
				<a href="../shoplist.jsp"><img src="../images/logo.png" alt=""/><br></a>
			 </div>
			 <nav class="navbar navbar-default menu" role="navigation"><h3 class="nav_right"><a href="shoplist.jsp"><img src="../images/logo.png" class="img-responsive" alt=""/></a></h3>
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			    </div>
				<!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav menu1">
			      	<li><a href="../index.html">Specials</a></li>
			        <li class="active"><a href="../fruits.html">Fruits & Veg</a></li>
			        <li><a href="../products.html">Food Products</a></li>
			        <li><a href="../store.html">Locate Store</a></li>
			        <li><a href="../club.html">Fan Club</a></li>
			        <li><a href="../contact.html">Contact</a></li>
		          </ul>
		           
			      <div class="clearfix"></div>
			      </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
            <div class="clearfix"></div>
           </div>
            
		 </div>  
		</div>
	</div>
    <div class="main">
		<div class="container">
		  <div class="single">
		   <div class="row content">
		   	<div class="col-md-3">
		   	   <div class="category_box">
		   	  	<h3 class="cate_head">Categories</h3>
		   	     <ul class="category">
		   	     <c:forEach items="${ld}" var="clazz" varStatus="statee">
<li><a  href="#${clazz.dcategory}">${clazz.dcategory}</a></li>

</c:forEach>

		   	     </ul>
		   	   </div>
		   	  
		   	</div>
		   	<div class="col-md-9">
		   	   <div class="breadcrumb">
				 <span class="last" style="font-size:30px">${lw}</span>
	           </div>
	           <div class="fruit">
	           	
	           	 <p style="font-size:23px">请点菜 点击右上方进行结算</p>
	           </div>
		  	   <div class="product-filter">
		        
	            <div class="product-compare"><a href="#" id="compare-total">Product Compare (0)</a></div>
	            <div class="clearfix"> </div>
	          </div>    
	          <div class="row content_bottom" >
              <c:forEach items="${totalfood}" var="clazz" varStatus="statee">
    
			   	   <div id="${clazz.dishcategory}" class="col-md-3" style="width:50%">
			   	   	<div class="content_box"> <a >
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="../cptp8?did=${clazz.dishid}" class="img-responsive" style="height:200px;width:300px" alt="">
				   	   	 <div class="content_box-grid">
				   	   	 <span>${clazz.dishname}</span>
				   	   	  <p class="m_1">${clazz.dishintroduction}</p>
				   	   	  <div class="price">Price:
						    <span class="actual">${clazz.dishprice}   销量${clazz.dishsales} 库存${clazz.dishstock}</span>
						  </div>
						  <a onclick="plus(this)" name="${clazz.dishid}"><img src="../img/jiahao.jpg" height="30" weight="30" ></a>
				<span id="${clazz.dishid}q" name="ppp">0</span>
				<a onclick="minus(this)" name="${clazz.dishid}"><img src="../img/jianhao.jpg" height="30" weight="30" ></a>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   
			   	   </c:forEach>
			   	   </div>
		   </div>
	  </div>
	 </div>
	</div>
	</div>
	<div class="footer">
		<div class="container">
			<div class="footer-grid footer-grid1">
			  <h3 class="m_2">Company</h3>
			  <ul class="list1">
			  	<li><a href="#">Home</a></li>
			    <li><a href="#">About Us</a></li>
			    <li><a href="#">Blog</a></li>
			    <li><a href="#">Latest News</a></li>
			    <li><a href="#">Login</a></li>
			    <li><a href="#">Join Us</a></li>
			  </ul>
		   </div>
		   <div class="footer-grid footer-grid2">
			  <h3 class="m_2">Company</h3>
			  <ul class="list1">
			  	<li><a href="#">Lorem ipsum dolor sit amet</a></li>
			    <li><a href="#">diam nonummy nibh euismod</a></li>
			    <li><a href="#">nostrud exerci tation</a></li>
			    <li><a href="#">hendrerit in vulputate velit</a></li>
			    <li><a href="#">soluta nobis eleifend option</a></li>
			    <li><a href="#">dynamicus, qui sequitur</a></li>
			  </ul>
		   </div>
		   <div class="footer-grid footer-grid3">
			  <h3 class="m_2">Information</h3>
			  <ul class="list1">
			  	<li><a href="#">My Account</a></li>
			    <li><a href="#">Rewards</a></li>
			    <li><a href="#">Terms & Conditions</a></li>
			    <li><a href="#">Buying Guide</a></li>
			    <li><a href="#">FAQ</a></li>
			  </ul>
		   </div>
		   <div class="footer-grid footer-grid4">
			   <h3 class="m_2">Let's be friends</h3>
			   <ul class="footer_social">
				 <li><a href=""> <i class="tw"> </i> </a></li>
				 <li><a href=""><i class="fb"> </i> </a></li>
				 <li><a href=""><i class="rss"> </i> </a></li>
				 <li><a href=""><i class="msg"> </i> </a></li>
				 <div class="clearfix"> </div>
			   </ul>
			   <h3 class="m_3">Subscribe</h3>
			   <p class="m_4">aliquam erat volutpat. Ut wisi</p>
			   <div class="footer_search">
			    <input type="text" class="text" value="Enter Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Email';}">
			    <input type="submit" value="Search">
			   </div>
		   </div>
		   <div class="footer-grid footer-grid_last">
	          <ul class="secure">
			  	<li class="secure_img"><img src="images/secure.png" alt=""/></li> 
			  	<li class="secure_desc">Lorem ipsum dolor coadipiscing</li>
			  	<div class="clearfix"> </div>
			  </ul>
			  <ul class="secure">
			  	<li class="secure_img"><img src="images/order.png" alt=""/></li> 
			  	<li class="secure_desc">Lorem ipsum dolor coadipiscing</li>
			  	<div class="clearfix"> </div>
			 </ul>
		   </div>
		   <div class="clearfix"> </div>
		   <div class="copy">
		    <p>Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="../http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	   </div>
	</div>
<div style="display:none"><script src='../http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>


