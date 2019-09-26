<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.jsp.UserDetails"%>
<%@page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Data">
<input type="submit" value="submit">
<table>
<tr>
<td>First name </td>
<td>Last Name </td>
<td>Email</td>
<td>Address</td>
</tr>


<%
ArrayList<UserDetails> data=(ArrayList)request.getAttribute("data");

for(UserDetails s:data)
{
%>
	<tr>
	<td><%s.getFirstname();%></td>
	<td><%s.getLastname();%></td>
	<td><%s.getEmailID();%></td>
	<td><%s.getAddress();%></td>
	</tr>
	
	
	<% }%>



</table>
</form>
</body>
</html>