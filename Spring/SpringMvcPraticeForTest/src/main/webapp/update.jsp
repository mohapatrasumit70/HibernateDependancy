<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${u!=null}">
<form action="update" method="post">
<input type="hidden" name="id" value="${u.getId()}">
<input type="text" name="name" value ="${u.getName()}">
<input type="tel" name="phone" value ="${u.getPhone()}">
<input type="password" name="password" value ="${u.getPassword()}">
<input type="submit" value="UPDATE">
</form>
</c:when>
<c:otherwise>
 <%
 response.sendRedirect("login.jsp");
 %>
</c:otherwise>
</c:choose>

</body>
</html>