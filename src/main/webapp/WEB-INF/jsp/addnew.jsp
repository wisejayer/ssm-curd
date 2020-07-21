<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布新闻</title>
</head>
<body>
    <p>发布新闻</p>
    <form action="${pageContext.request.contextPath}/new/addnew" method="post">
    标题：<input type="text" name="title"><br>
    作者：<input type="text" name="author"><br>
    来源：<input type="text" name="source"><br>
    内容：<textarea type="text" name="content"></textarea><br>
    <input type="submit" value="添加">
    </form>
    <a href="${pageContext.request.contextPath}/new/allnew"><button>查看</button></a>
</body>
</html>
