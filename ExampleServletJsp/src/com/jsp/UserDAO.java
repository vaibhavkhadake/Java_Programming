package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Data")
public class UserDAO extends HttpServlet  
{
	ArrayList<UserDetails> userlist=new ArrayList<>(); 
	User user2=new User();
	ArrayList<UserDetails> data;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/jsp");    

		
		try {
			data = user2.checkDetails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(data);
		
		request.setAttribute("data", data);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Data.jsp");
			if (dispatcher != null){

			  dispatcher.forward(request, response);

			  } 
	}

		

}


