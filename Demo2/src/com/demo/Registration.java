package com.demo;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.RegistrationDetailsDAO;
@SuppressWarnings("serial")
@WebServlet("/RegistrationDetails")
public class Registration extends HttpServlet
{
	
	RegistrationDetailsDAO dao=new RegistrationDetailsDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/jsp");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mobilenumber=request.getParameter("mobilenumber");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		
		System.out.println(firstname+""+lastname+""+mobilenumber+""+email+""+password+""+repassword);	 
	 dao.insertData(firstname, lastname, mobilenumber, email, password, repassword);
	 response.sendRedirect("Login.jsp");
	}
	
	
}