<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8"/>
<title>顾客注册</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="js/jquery.js"></script>
<script src="js/verificationNumbers.js"></script>
<script src="js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //粒子背景特效
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });
  //验证码
  createCode();
  //测试提交，对接程序删除即可

});
</script>
</head>
<body>
<form action="register1" method="post">
<dl class="admin_login">
 <dt>
  <strong>啄木鸟美食中心点餐系统</strong>
  <em>顾客注册</em>
 </dt>
 <dd class="user_icon">
  <input type="text" name="userid" placeholder="账号id" class="login_txtbx"/>
 </dd>
 <dd class="pwd_icon">
  <input type="password"  name="userpassword" placeholder="密码" class="login_txtbx"/>
 </dd>
  <dd class="user_icon">
  <input type="text" name="useremail" placeholder="邮箱" class="login_txtbx"/>
 </dd>
  <dd class="user_icon">
  <input type="text" name="usercellphone" placeholder="手机" class="login_txtbx"/>
 </dd>
  
 <dd>
  <input type="submit" value="立即注册" class="submit_btn"/>
 </dd>
</dl>
</form>

</body>
</html>
