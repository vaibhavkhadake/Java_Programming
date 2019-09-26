<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="Style.css"/>
</head>
<body>
<h1>Login Form</h1>
<form action="Login">

<table border="5" > 
<lable>UserName:</lable>
	
		<input type="email" placeholder= "username" name= "email"/><br>
<lable>Password:</lable>
	
		<input type="password" placeholder="password" name="password"/><br>

		<input type="submit" value="Login"/>
		
		
			<a href="RegistrationDetails.jsp" value="Registration For new user">Registration For new user</a>	
		
</table>
</form>

</body>
</html>