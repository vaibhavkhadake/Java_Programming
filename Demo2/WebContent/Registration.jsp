<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register Successfully</h1>
<%
	
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("Login.jsp");
	}

%>
<form action="Logout">
<input type="submit" value="Logout"><br>
</form>
</body>
</html>