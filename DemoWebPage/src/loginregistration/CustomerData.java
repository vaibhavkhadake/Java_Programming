package loginregistration;

public interface CustomerData 
{
	public int insertCustomer(Customer customer);
	public Customer getCustomer(String username,String password);
}
