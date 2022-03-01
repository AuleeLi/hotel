<%--
  Created by IntelliJ IDEA.
  User: wqc
  Date: 2022/2/27
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <script type="text/javascript" src="<%=basePath%>/tools/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/tools/header.js"></script>
    <script>
        var basePath = "<%=basePath%>";
    </script>
</head>
<body>
</body>
</html>
