<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search User</title>
</head>
<body>

<h1>User</h1>

<c:if test="${!empty listUsers}">
<table class="tg">
    <tr>
        <th width="80">ID</th>
        <th width="120">Name</th>
        <th width="120">Age</th>
        <th width="120">IsAdmin</th>
        <th width="120">CreateDate</th>
    </tr>
    <c:forEach items="${listUsers}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>${user.admin}</td>
        <td>${user.createDate}</td>
    </tr>
    </c:forEach>
</table>
</c:if>
</body>
</html>
