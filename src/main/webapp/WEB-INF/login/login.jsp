<%--
  Created by IntelliJ IDEA.
  User: wqc
  Date: 2022/3/3
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/header.jsp"%>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/login.css">
    <script type="text/javascript" src="<%=basePath%>js/login.js"></script>
</head>
<body>
    <div id="title" class="title">
        <img id="title_img" class="title_img" src="<%=basePath%>images/title_img.png">
    </div>
    <div id="home_left" class="home_left">
        <img id="left_img" class="left_img" src="<%=basePath%>images/login_left.png">
    </div>
    <div id="login_home" class="login_home">
        <div id="type_head" class="type_head">
            <span id="login_account" class="login_type">帐号登录</span>
            <span id="login_phone_num" class="login_type">手机号登录</span>
            <span id="login_mail" class="login_type">邮箱登录</span>
        </div>
        <div id="login_info" class="login_info">
            <span id="account" class="info">
                <input type="text" name="" id="login_account_num" class="login_info_input" onfocus="changeColor(this, true)" onblur="changeColor(this, false)">
            </span>
            <span id="password" class="info">
                <input type="password" name="" id="login_password" class="login_info_input" onfocus="changeColor(this, true)" onblur="changeColor(this, false)">
            </span>
            <span id="forget" class="option">
                <div class="forget">忘记密码？</div>
            </span>
            <span id="login" class="option">
                <div class="login">登录</div>
            </span>
        </div>
    </div>
</body>
</html>
