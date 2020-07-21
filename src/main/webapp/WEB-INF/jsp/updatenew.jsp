<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改新闻</title>
</head>
<body>
<p>修改新闻</p>
<form action="${pageContext.request.contextPath}/new/updatenew?newid=${list.getNewid()}" method="post">
    标题：<input type="text" name="title" value="${list.getTitle()}"><br>
    作者：<input type="text" name="author" value="${list.getAuthor()}"><br>
    来源：<input type="text" name="source" value="${list.getSource()}"><br>
    内容：<input type="text" name="content" value="${list.getContent()}"><br>
    <input type="submit" value="修改">
</form>
    <a href="${pageContext.request.contextPath}/new/allnew"><button>查看</button></a>
</body>
</html>
