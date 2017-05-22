<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

<%@include file="/WEB-INF/views/header.jsp"%>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="inner cover">

                <table>
                    <!-- here should go some titles... -->
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

            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Cover template for <a href="http://getbootstrap.com">Bootstrap</a>, by <a href="https://twitter.com/mdo">@mdo</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>



</body>
</html>
