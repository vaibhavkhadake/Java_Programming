<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Details</title>
</head>
<body>
<form action="Login" method="post">
<table border="5" >
		<tr>
			<th> FirstName </th>
			<th><input type="text" name="firstname" placeholder="firstname"required="required"></th></tr>
		<tr>
			<th> LastName </th>
			<th><input type="text" name="lastname" placeholder="lastname"required="required"></th></tr>
		<tr>
			<th> MobileNumber </th>
			<th><input type="number" name="mobilenumber" placeholder="mobilenumber" pattern=".{10}"required="required""></th></tr>
		<tr>
			<th> Email </th>
			<th><input type="email" name="email" placeholder="email" required="required""></th></tr>
		<tr>
			<th> Password </th>
			<th><input type="password" name="password" placeholder="password" required="required""></th></tr>
		<tr>
			<th> Re-Password </th>
			<th><input type="password" name="repassword" placeholder="repassword" required="required""></th></tr>
		<tr>
			<th><input type="submit" value="submit" name="submit"></th>
			<th><input type="reset" value="reset" name="reset"></th></tr>
</table>
</form>
</body>
</html>