<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
ID: <input type="number" name="id" value="${u.getId()}" readonly="readonly">
Name<input type="text" name="name" value="${u.getName()}" >
Phone<input type="tel" name="phone" value="${u.getPhone()}">
password<input type="text" name="password" value="${u.getPassword()}">
<input type="submit" value="Update">
</form>
</body>
</html>