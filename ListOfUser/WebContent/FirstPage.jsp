<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title> 
</head>
<body>
	<form action="LoginController" method="post">
    Enter user Name :<br><input type="text" name="userName"><br>
    Enter password :<br><input type="password" name="password"><br>
    <input type="submit" value="Login">
    <a href="Registration.jsp">Register</a>
</form>
</body>
</html>