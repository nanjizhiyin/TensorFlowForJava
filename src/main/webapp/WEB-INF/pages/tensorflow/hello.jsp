<%--
  Created by IntelliJ IDEA.
  User: xuexin
  Date: 2017/7/31
  Time: 上午10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = (String) request.getContextPath();
%>
<html>
<head>
    <title>${title}</title>
    <script src="<%=ctx%>/js/jquery-3.2.1.min.js"></script>
</head>
<body>

<div class="contain">
   測試結果: ${text}
</div>
</body>
</html>
