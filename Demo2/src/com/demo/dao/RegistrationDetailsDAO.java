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
	public void insertData(String firstname,String lastname,String mobilenumber,String email,String password,String repassword)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection connection=DriverManager.getConnection(url,databaseusername,databasepassword);
		//String insert="insert into RegistrationDetails(firstname,lastname,mobilenumber,email,password,repassword)"+ "values(?,?,?,?,?,?)";
		String insert="insert into RegistrationDetails(firstname,lastname,mobilenumber,email,password,repassword) values(?,?,?,?,?,?)";
		PreparedStatement prepStatement = connection.prepareStatement(insert);
		
			prepStatement.setString(1, firstname);
			prepStatement.setString(2, lastname);
			prepStatement.setString(3, mobilenumber);
			prepStatement.setString(4, email);
			prepStatement.setString(5, password);
			prepStatement.setString(6, repassword);
			prepStatement.executeUpdate();
			connection.close();
		} catch (Exception e) {
				e.printStackTrace();
			}
		//	return false;
	}	
	
	
	


}
