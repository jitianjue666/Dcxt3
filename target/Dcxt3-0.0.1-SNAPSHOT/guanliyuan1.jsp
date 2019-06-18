<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="lib/jquery-1.8.1.min.js" type="text/javascript"></script>
 <script type="text/javascript">
 $(document).ready(function(){
	 $("#wclnumber").load("getnumber");
      });
 </script>

<title>Insert title here</title>
</head>
<body>
<p name="wclnumber" id="wclnumber"></p>
<a href="quanbushenqing.jsp" > 查看商铺申请信息</a>
<form action="shenhe" method="post">

</form>
</body>
</html>