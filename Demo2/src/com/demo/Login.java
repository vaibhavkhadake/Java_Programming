package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.dao.LoginDAO;
import com.demo.dao.RegistrationDetailsDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	String url="jdbc:mysql://localhost:3306/Emp";
	String databaseusername="root";
	String databasepassword="password";
	String sql="select * from RegistrationDetails where email = ?  and password = ? ";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		try
		{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp","root","password");
				PreparedStatement statement=connection.prepareStatement(sql);
				
				statement.setString(1, email);
				statement.setString(2, password);
				System.out.println(statement);
				ResultSet resultSet=statement.executeQuery();
				
				while(resultSet.next())  
				{
					response.sendRedirect("Registration.jsp");
					connection.close();
					return;
				}
				
				response.sendRedirect("Login.jsp");
				return;
				
		} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				
			}
			
	
		}

		
		
//		
//		try {
//			if(dao.checkDetails(email,password))
//			{
//				HttpSession session=request.getSession();
//				session.setAttribute("email", email);
//				response.sendRedirect("Registration.jsp");
//			}
//			else
//			{
//				response.sendRedirect("Login.jsp");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

}
