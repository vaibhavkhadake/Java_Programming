package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	String url="jdbc:mysql://localhost:3306/Emp";
	String databaseusername="root";
	String databasepassword="password";
	String sql="select * from logindetails where username = ?  and password = ? ";
	public boolean checkDetails(String username,String password)
	{
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection connection=DriverManager.getConnection(url,databaseusername,databasepassword);
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			
			ResultSet resultSet=statement.executeQuery();
			
			while(resultSet.next())  
				
			{
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
