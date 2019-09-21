<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Registration Form</title>
</head>
<body>
<form action="RegistrationSuccessfull.jsp">
<table>
	<tr>
		<td>
		UserName : 
		</td>
		<td>
			<input type="email" name="email">	
		</td>
	</tr>
	
	<tr>
		<td>
		Password : 
		</td>
		<td>
			<input type="password" name="password">	
		</td>
	</tr>

	<tr>
		<td>
			<button type="Submit" value="Login" onclick="window.location.href='RegistrationSuccessfull.jsp'"> Submit </button>
		</td>
	
		<td>
			<a href="Registration.jsp">Registration For new user</a>	
		</td>
	</tr>

</table>





</form>

</body>
</html>