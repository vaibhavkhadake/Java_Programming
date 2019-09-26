package com.jsp;
import java.sql.*;
import java.util.ArrayList;
public class User
{
	
	ArrayList<UserDetails> userlist=new ArrayList<>();
	UserDetails user=new UserDetails();
	PreparedStatement statement=null;
	Connection connection=null;
	String sql="select * from User";
	public ArrayList<UserDetails> checkDetails() throws SQLException
	{	
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			 connection=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Emp","root","password");  
			 statement=connection.prepareStatement(sql);
			ResultSet resultSet=statement.executeQuery();
			
			while(resultSet.next())  
			{
				user.setFirstname(resultSet.getString(1));
				user.setLastname(resultSet.getString(2));
				user.setEmailID(resultSet.getString(3));
				user.setAddress(resultSet.getString(4));
				userlist.add(user);
				
				System.out.println(userlist+"\n");
			
			}
			connection.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
	        if (statement != null)
	        { 
	        	statement.close(); 
	        }
	        }
		return userlist;
		
		
	}

}
