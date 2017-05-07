<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form method="post" action="/register" modelAttribute="newUser">
    <c:if test="${not empty error}">
        <div class="msg">
                ${error}
        </div>
    </c:if>
        <form:label path="name">Name</form:label>
        <form:input type="text" path="name"/><br>

        <form:label path="password">Password</form:label>
        <form:input path="password" type="password"/><br>

        <form:label path="email">Email</form:label>
        <form:input path="email" type="text"/><br>

    <button type="submit">Register</button>
</form:form>

</body>
</html>
