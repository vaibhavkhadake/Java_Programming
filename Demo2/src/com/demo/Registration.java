package com.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.RegistrationDetailsDAO;
@WebServlet("/RegistrationDetails")
public class Registration extends HttpServlet
{
	
	RegistrationDetailsDAO dao=new RegistrationDetailsDAO();
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
{
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String mobilenumber=request.getParameter("mobilenumber");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String repassword=request.getParameter("repassword");
	
	dao.insertData(firstname, lastname, mobilenumber, email, password, repassword);
	
}
}
}