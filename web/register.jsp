<%--
  Created by IntelliJ IDEA.
  User: cnrobin
  Date: 17-12-20
  Time: 下午11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎注册</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/register.css">
    <script type="text/javascript" src="js/欢迎注册.js"></script>
</head>
<body>
<!-- 头部 -->
<div>
    <div class="Llogo_h">
        <img class="logo" src="image/logo2.png">
    </div>
    <p class="head"></p>
    <p class="home"><a href="index.html">首页</a></p>
    <p class="login"><a href="login.jsp">已有账号</a></p>
</div>
<!-- 中间部分 -->
<div>
    <p class="mainL"></p>
    <p class="mainM"></p>
    <p class="mainR"></p>
    <div>
        <p class="reg">欢迎注册</p>
        <form action="registerServlet" method="get">
            <p class="M_user">账号</p><br/>
            <input class="M_input" type="text" name="username" placeholder="请输入用户名/手机号码">
            <p class="M_pass">密码</p><br/>
            <input type="password" name="password" class="M_passw" placeholder="请输入密码">
            <button class="M_login">注册</button>
        </form>
    </div>
</div>
</body>
</html>
