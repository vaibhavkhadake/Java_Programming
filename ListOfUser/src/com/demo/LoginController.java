package com.demo;




import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException
	{
		List <Users> userList = new ArrayList<>();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		Users u;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp","root","password");
			
			PreparedStatement prepaStatement = connection.prepareStatement("select * from User2 where userName = ? and password = ?");
			System.out.println(prepaStatement);
			System.out.println(connection);
			prepaStatement.setString(1, userName);
			System.out.println(prepaStatement);
			prepaStatement.setString(2, password);
			System.out.println(prepaStatement);
			ResultSet result = prepaStatement.executeQuery();
			
			while(result.next())
			{
				System.out.println("User Present");
				PreparedStatement prepaStmtAll = connection.prepareStatement("select * from User2 ");
				ResultSet rs = prepaStmtAll.executeQuery();
				while(rs.next())
				{
					PrintWriter write = response.getWriter();
					write.println("Name : "+rs.getString(1));
					write.println("Email : "+rs.getString(2));
					write.println("Mobile : "+rs.getString(3));
					
					String name = rs.getString(1);
					String mail = rs.getString(2);
					String mobile = rs.getString(3);
					String pass = rs.getString(4);
					
					u= new Users();
					u.setUserName(name);
					System.out.println(u.getUserName());
					u.setMailID(mail);
					System.out.println(u.getMailID());
					u.setMobileNumber(mobile);
					System.out.println(u.getMobileNumber());
					u.setPassword(pass);
					System.out.println(u.getPassword());
					userList.add(u);
					System.out.println("list"+userList);
				}
							 
				break;
			}
			
			for(Users u1:userList)
			{
				System.out.println("name = "+u1.getUserName());
				System.out.println("mail = "+u1.getMailID());
				System.out.println("Mobile = "+u1.getMobileNumber());
				System.out.println("Password = "+u1.getPassword());
			}
			System.out.println(userList);
			request.setAttribute("userList", userList);
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
			
		}
		
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
