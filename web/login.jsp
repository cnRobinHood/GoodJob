<%--
  Created by IntelliJ IDEA.
  User: cnrobin
  Date: 17-12-20
  Time: 下午11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>欢迎登陆</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <script type="text/javascript" src="js/欢迎登陆.js"></script>
</head>
<body>
<!-- 头部 -->
<div>
    <div class="Llogo_h">
        <img class="logo" src="image/logo2.png">
    </div>
    <p class="head"></p>
    <span class="home"><a href="index.html">首页</a></span>
    <span class="login"><a href="register.jsp">注册</a></span>
</div>
<!-- 中间部分 -->
<div>
    <p class="mainL"></p>
    <p class="mainM"></p>
    <p class="mainR"></p>
    <div>
        <form method="get" action="loginServlet">
            <p class="M_user">账号</p><br/>
            <input class="M_input" type="text" name="username" placeholder="请输入用户名/手机号码">
            <p class="M_pass">密码</p><br/>
            <input type="password" name="password" class="M_passw" placeholder="请输入密码">
            <button class="M_login">登录</button>
        </form>
    </div>

</div>
</body>
</html>