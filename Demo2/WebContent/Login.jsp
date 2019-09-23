<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form action="Login">
<table border="5" > 
<tr> <td>UserName </td>
	<td>
		<input type="text" placeholder= "username" name= "username"></td></tr>
<tr> <td>Password  </td>
	<td>
		<input type="password" placeholder="password" name="password"></td></tr>
</table>
<table>
		<tr><td><input type="submit" value="Login"></td></tr>
		
		<tr><td>
			<a href="Registration.jsp">Registration For new user</a>	
		</td></tr>
</table>
</form>

</body>
</html>