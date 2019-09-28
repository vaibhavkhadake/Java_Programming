<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"type="text/css" href="Style.css"> 
</head>
<body>
	<form action="RegisterUser" method = "post">
		Enter Your Name :<input type="text" name="userName"><br>
		Enter Mail id : <input type="email" name="mailID"><br>
		Enter Mobile Number : <input type="number" name="mobileNumber"><br>
    	Enter password :<input type="password" name="password"><br>
    	
    	<input type="submit" name="Register"><br>
	</form>
</body>
</html>