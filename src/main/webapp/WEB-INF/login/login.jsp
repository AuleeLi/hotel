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
            <span id="login_account" class="login_type" onclick="changeInpBack('account')">帐号登录</span>
            <span id="login_phone_num" class="login_type" onclick="changeInpBack('phone')">手机号登录</span>
            <span id="login_mail" class="login_type" onclick="changeInpBack('mail')">邮箱登录</span>
        </div>
        <div id="login_info" class="login_info">
            <span id="account" class="info">
                <input type="text" name="" id="login_account_num" class="login_info_input"
                       placeholder="请输入帐号"
                       onfocus="changeColor(this, true)" onblur="changeColor(this, false)">
            </span>
            <span id="password" class="info">
                <input type="password" name="" id="login_password" class="login_info_input"
                       placeholder="请输入密码"
                       onfocus="changeColor(this, true)" onblur="changeColor(this, false)">
            </span>
            <span id="forget" class="option">
                <div class="forget">忘记密码？</div>
            </span>
            <span id="login" class="option">
                <div class="login">登录</div>
            </span>
            <span id="register" class="option_register">
                <div class="no_have">还没有帐号？</div>
                <div class="register">免费注册</div>
            </span>
            <span  class="option_end">
                <div class="agreement">
                    <input type="checkbox" id="agreement_check">
                    我已阅读并同意
                    <a href="<%=basePath%>login/agreement" target="_blank">《没团用户协议》</a>
                    <a href="<%=basePath%>login/policy" target="_blank">《隐私政策》</a> ，
                    并授权没团使用该没团账号信息（如昵称、头像、联系方式）进行统一管理。
                </div>
            </span>
        </div>
    </div>
</body>
</html>
