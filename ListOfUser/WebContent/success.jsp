
<%@page import="com.demo.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	Welcome to BridgeLabzs
	<table>
	<tr>
	<th>Name</th>
	<th>EmailID</th>
	<th>MobileNumber</th>
	<th>Password</th>
	</tr>
	<%
			List<Users> userList = (List)request.getAttribute("userList");
			for(Users u : userList)
			{
				
	%>
	<tr>
	<th><%out.println(u.getUserName()); %></th>
	
	<th><% out.println(u.getMailID());%></th>

	<th><% out.println(u.getMobileNumber());%></th>
	
	<th><% out.println(u.getPassword());%></th>
				
	</tr>				
				
		<% 	}
	
	%>
	
</table>	
</body>
</html>