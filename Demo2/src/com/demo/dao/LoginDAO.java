package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.catalina.connector.Response;

public class LoginDAO {
	
	String url="jdbc:mysql://localhost:3306/Emp";
	String databaseusername="root";
	String databasepassword="password";
	String sql="select * from RegistrationDetails where email = ?  and password = ? ";
	public boolean checkDetails(String email,String password)
	{	
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp","root","password");
			PreparedStatement statement=connection.prepareStatement(sql);
			
			statement.setString(1, email);
			statement.setString(2, password);
			System.out.println(statement);
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
//<table border="5" > 
//
//<tr> <td><lable>UserName </lable></td>
//	<td>
//		<input type="email" placeholder= "username" name= "email"></td></tr>
//<tr> <td><lable>Password </lable> </td>
//	<td>
//		<input type="password" placeholder="password" name="password"></td></tr>
//</table>
//<table>
//		<tr><td><input type="submit" value="Login"></td></tr>
//		
//		<tr><td>
//			<a href="RegistrationDetails.jsp">Registration For new user</a>	
//		</td></tr>
//</table>
//</form>
