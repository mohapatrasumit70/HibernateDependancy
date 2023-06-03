<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
  <c:when test="${sum%2==0}">
  <h2>${sum} is Even Number</h2>
  </c:when>
  <c:otherwise>
  <h2>${sum} is Odd Number</h2>
  </c:otherwise>
</c:choose>
</body>
</html>