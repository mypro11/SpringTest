<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<table>
    <h2 align="center">${product.category.categoryName}->${product.productName}</h2>
    <p style="margin-top: 50px">description - ${product.description}</p>
    <p>price - ${product.price}</p>
</table>
</body>
</html>
