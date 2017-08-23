<!DOCTYPE html>
<html lang="en">
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%
    String ctx = (String) request.getContextPath();
%>
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
<h2>Hello World!</h2>
<form action="<%=ctx%>/user/login" id="logForm">
    <input type="text" name="username" id="username" value=""><br/><button type="submit" id="submitBtn">登录</button>
</form>

<div><a href="<%=ctx%>/nunjucks/list">nunjucks</a></div>
</body>
</html>
