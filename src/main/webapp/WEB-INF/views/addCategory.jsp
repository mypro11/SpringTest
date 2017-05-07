<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: brina
  Date: 5/5/17
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add category</title>
</head>
<body>
<form:form method="post" action="/category/add" modelAttribute="newCategory">
    <form:label path="categoryName">Name</form:label>
    <form:input type="text" path="categoryName"/><br>

    <form:label path="description">Description</form:label>
    <form:input path="description" type="text"/><br>

    <button type="submit">Add category</button>
</form:form>
</body>
</html>
