<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看新闻</title>
</head>
<body>
<table border=1>
    <tr>
        <td>id</td>
        <td>title</td>
        <td>author</td>
        <td>source</td>
        <td>date</td>
        <td>update</td>
        <td>delete</td>
    </tr>
    <tbody>
    <c:forEach var="item" items="${requestScope.get('list')}">
        <tr>
            <td>${item.getNewid()}</td>
            <td>${item.getTitle()}</td>
            <td>${item.getAuthor()}</td>
            <td>${item.getSource()}</td>
            <td>${item.getTime()}</td>
            <td>
                <a href="${pageContext.request.contextPath}/new/toupdatenew?newid=${item.getNewid()}">更改</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/new/del/${item.getNewid()}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
