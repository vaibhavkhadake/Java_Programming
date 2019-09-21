<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New user Registration form</title>
</head>
<body>
<form action="Login.jsp">
<table style="background-color: maroon;">
<tr>
	<td>First Name : </td>
	<td><input type="text" name="firstName"> </td>
</tr>

<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lastName"> </td>
</tr>

<tr>
	<td>EmailID : </td>
	<td><input type="email" name="email"> </td>
</tr>
<tr>
	<td>Mobile Number : </td>
	<td><input type="number" name="mobileNumber" pattern=".{10}"> </td>
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
		Re-Password : 
		</td>
		<td>
			<input type="password" name="password">	
		</td>
	</tr>
<tr>
	<td><input type="submit" name ="submit" value="Register">
</table>




</form>

</body>
</html>