package loginregistration;

import java.sql.*;

public class MyConnectionProvider implements MyProvider
{
	static Connection connection=null;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			@SuppressWarnings("unused")
			Connection connection=DriverManager.getConnection(connectionURL,userName,password);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
		
	}
}
