<%--
  Created by IntelliJ IDEA.
  User: jinyugai
  Date: 2018/6/1
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书管理</title>
    <meta charset="UTF-8"/>
</head>
<body>
<h2>图书管理</h2>
<table width="100%" id="tab" border="1">
    <tr>
        <td>编号</td>
        <td>书名</td>
        <td>类型</td>
        <td>价格</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.typename}</td>
            <td>${book.price}</td>
            <td>${book.state}</td>
            <td><a href="#">删除</a> | <a href="#">编辑</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
