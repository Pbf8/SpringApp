<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div id="todo-list" class="page-content">
        <c:choose>
            <c:when test="${empty users}">
                <p>"vuootooo"</p>
            </c:when>
            <c:otherwise>
                <c:forEach items="${users}" var="user">
                    <div>
                        <c:out value="${user.name}"/> <c:out value="${user.surname}"/>
                    </div>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </div>
</body>
</html>