<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Hello From Spring Dispatcher Servlet!!!</h1>
    <table>
        <h2>Categories</h2>
        <tr>
        </tr>
            <c:forEach var="category" items="${categories}">
        <tr>
            <td>
                <a href="<c:out value="/category?id=${category.id}"/>">
                <c:out value="${category.categoryName}"/>
                           </a>
            </td>
        </tr>
        </c:forEach>
    </table>
    <a href="<c:out value="/category/add"/>"><h4>Add new category</h4></a>
</body>
</html>
