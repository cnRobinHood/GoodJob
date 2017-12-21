<%--
  Created by IntelliJ IDEA.
  User: cnrobin
  Date: 17-12-21
  Time: 上午12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>个人中心</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/personcenter.css">
    <script type="text/javascript" src="js/个人中心.js"></script>
</head>
<body>
<!-- 头部 -->
<div>
    <div class="Llogo_h">
        <img class="logo" src="image/logo2.png">
    </div>
    <p class="head"></p>
    <p class="home"><a href="index.html">首页</a></p>
    <p class="modify"><a href="">修改</a></p>
</div>
<!-- 中间部分 -->
<div>
    <p class="mainL"></p>
    <p class="mainM"></p>
    <p class="mainR"></p>
</div>
<div>
    <p class="edit">请完善个人信息</p>
    <form class="info1" action="personinfoServlet" method="post" enctype="multipart/form-data">
        <p>姓名</p>
        <input class="E_input1" type="text" name="realname"></br></br>
        <p class="age">性别</p>
        <input type="radio" class="E_sex" name="sex" value="male">男士
        <input type="radio" name="sex" value="female">女士</br></br>
        <p class="E_age">年龄</p>
        <input class="E_input1" type="text" name="age"></br></br>
        <p>毕业院校</p>
        <input class="E_input2" type="text" name="school"></br></br>
        <p>学历</p>
        <input class="E_input2" type="text" name="eduBackground"></br></br>
        <p class="E_ideal">求职意向</p>
        <input class="E_input3" type="text" name="jobIntension"></br></br>
        <p class="E_demand">薪资要求</p>
        <input class="E_input3" type="text" name="salaryIntension"></br></br>
        <p class="E_city">工作城市</p>
        <input class="E_input3" type="text" name="cityIntension"></br></br>
        <p class="E_intro">简介</p>
        <textarea class="E_input4" name="brief"></textarea></br></br>
        <p class="E_photo">照片</p>
        <input class="E_input3" type="file" name="photoSrc">
        <button class="E_serve"><a target="_blank">保存</a></button>
    </form>

</div>
</body>
</html>