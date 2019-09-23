package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistrationDetailsDAO
{

	String url="jdbc:mysql://localhost:3306/Emp";
	String databaseusername="root";
	String databasepassword="password";
	String insert="insert into RegistrationDetails values(?,?,?,?,?,?)";
	
	public boolean insertData(String firstname,String lastname,String mobilenumber,String email,String password,String repassword)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection connection=DriverManager.getConnection(url,databaseusername,databasepassword);
		PreparedStatement statement=connection.prepareStatement(insert);
		
		
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
