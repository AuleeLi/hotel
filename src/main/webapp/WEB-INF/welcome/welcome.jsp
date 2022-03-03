<%--
  Created by IntelliJ IDEA.
  User: wqc
  Date: 2022/2/27
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/header.jsp"%>
<html>
<head>
    <title>没团酒店预订</title>
    <link rel="stylesheet" type="text/css" href="css/welcome.css">
    <script type="text/javascript" src="<%=basePath%>/js/welcome.js"></script>
</head>
<body>
    <div id = "head" class="head">
        <span id="login" class="login" onclick="login()">立即登录</span>
        <span id="register" class="register">注册</span>
    </div>
    <div id="home" class="home">
        <div id="title" class="title">
            <span id="hotel_name" class="hotel_name">没团·橘子酒店</span>
            <span id="hotel_type" class="hotel_type">舒适型</span>
            <span id="hotel_address" class="hotel_address"></span>
        </div>
        <div id="image_home" class="image_home">
            <div id="big_image" class="big_image">
                <img id="big_img" class="big_img" src="">
            </div>
            <div id="hotel_info" class="hotel_info">
                <img id="info_img" class="info_img" src="images/hotel_info.png">
            </div>
            <div id="hotel_images" class="hotel_images">

            </div>
        </div>
    </div>
</body>
</html>
