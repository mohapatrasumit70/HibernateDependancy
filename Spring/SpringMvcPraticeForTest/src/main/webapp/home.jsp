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
<h2><a href="update.jsp">UPDATE USER</a></h2>
<h2><a href="delete?id=${u.getId() }">DELETE USER</a></h2>
<h2><a href="viewuser.jsp">VIEW USER</a></h2>
<h2><a href="logout">Logout   </a></h2>
</c:when>
<c:otherwise>
<% 
response.sendRedirect("login.jsp") ;
%>
</c:otherwise>

</c:choose>
</body>
</html>