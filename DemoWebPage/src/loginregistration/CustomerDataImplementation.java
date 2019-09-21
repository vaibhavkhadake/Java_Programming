package loginregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDataImplementation implements CustomerData {

	
	static Connection connection=null;
	static PreparedStatement prepaidStatement;
	@Override
	public int insertCustomer(Customer customer) {
		int status=0;

		try
		{
		connection=MyConnectionProvider.getConnection();
	
			prepaidStatement=connection.prepareStatement("insert into customer values(?,?)");
			prepaidStatement.setString(1, customer.getUserName());
			prepaidStatement.setString(2, customer.getPassword());
			prepaidStatement.setString(3, customer.getName());
			
			status=prepaidStatement.executeUpdate();
			connection.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		
		Customer customer=new Customer();
		
		
		try
		{
			connection=MyConnectionProvider.getConnection();
			prepaidStatement=connection.prepareStatement("select * from customer where username=? and password=?");
			prepaidStatement.setString(1, username);
			prepaidStatement.setString(2, password);
			ResultSet resultset=prepaidStatement.executeQuery();
			while(resultset.next())
			{
				customer.setUserName(resultset.getString(1));
				customer.setPassword(resultset.getString(2));
				customer.setName(resultset.getString(3));
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
