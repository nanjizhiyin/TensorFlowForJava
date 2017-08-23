<%--
  Created by IntelliJ IDEA.
  User: XPFirst
  Date: 2017/5/19
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = (String) request.getContextPath();
%>
<html>
<head>
    <title>参数</title>
    <script src="<%=ctx%>/js/nunjucks.js"></script>
    <script src="<%=ctx%>/js/jquery-3.2.1.min.js"></script>
</head>
<body>

<h2>${paramValue}!</h2>
<div class="contain">

</div>
</body>
<script type="text/javascript">
    var items=[
        {
            name: "日溪乡汶石",
            area_id: "350111",
        },
        {
            name: "寿山乡红寮",
            area_id: "350111"
        }
    ];
    //调用模板生成界面
    nunjucks.configure('<%=ctx%>/html/template', { autoescape: true });
    var html = nunjucks.render('list.html', { items: items });
    console.log(html);
    $(".contain").append(html);//yes
</script>
</html>
