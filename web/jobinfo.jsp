<%--
  Created by IntelliJ IDEA.
  User: cnrobin
  Date: 17-12-21
  Time: 上午12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="entities.CompanyInfo"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
    <title>goodjob</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/goodjobs.css">
    <script type="text/javascript" src="js/goodjob.js"></script>
</head>
<body>
<!-- 头部 -->
<div>
    <div class="Llogo_h">
        <img class="logo" src="image/logo2.png">
    </div>
    <p class="title">你离好工作只差一份优质简历！</p>
    <p class="head"></p>
    <p class="home"><a href="index.html">首页</a></p>
    <p class="login"><a href="personcenter.jsp">个人中心</a></p>
</div>
<!-- 搜索框 -->
<div>
    <img class="marry" src="image/marry.jpg">
    <input type="text" name="" class="search" placeholder="请输入关键字">
    <button class="do">搜索</button>
</div>
<!-- 为你优选 -->
<div class="main">
    <div class="forYou">

        <p class="for">为你优选</p>
        <div class='lit'><p>
        <%

            List<CompanyInfo> companyInfoList = (List<CompanyInfo>) request.getAttribute("companyinfo");
            if (companyInfoList != null && companyInfoList.size() != 0) {
                for (CompanyInfo companyInfo:companyInfoList
                        ) {
                    out.print("</br>"+companyInfo.getPosition()+"&nbsp;&nbsp;"+companyInfo.getSalary()+"</br>"+companyInfo.getCompanyName()+"&nbsp;&nbsp;"+companyInfo.getCompanyAddr());

                }
            }


        %>
        </p></div>
        <div class="lit"></div>
        <div class="lit"></div>
        <div class="lit"></div>
        <div class="lit"></div>
        <div class="lit"></div>
        <div class="lit"></div>
        <div class="lit"></div>
        <div class="lit"></div>
    </div>
</div>
<!-- 公司展示 -->
<div class="show">
    <img class="for1" src="image/for1.jpg">
    <img class="for2" src="image/for2.jpg">
    <img class="for3" src="image/for3.jpg">
</div>
</body>
</html>