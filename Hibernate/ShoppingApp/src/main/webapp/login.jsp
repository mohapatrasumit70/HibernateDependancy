<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String message =(String)request.getAttribute("msg");
if(message!=null){%>
<h2>
<%=message %>
</h2>
<%} %>
<form action="login" method="post">
<input type="tel" name="ph" placeholder="Enter Your Phone Number"><br>
<input type="text" name="ps" placeholder="Enter Your password"><br>
<input type="submit" value ="login">
</form>
<h2>
<a href ="register.jsp">Click Here to Resister </a>
</h2>
</body>
</html>