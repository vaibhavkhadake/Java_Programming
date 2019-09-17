package com.bridgelabzs.OOPConcepts.AddressBookNew;


import java.util.Comparator;


public class SortByPinCode implements Comparator<AddressBookNew>
{

	
	public int compare(AddressBookNew address1, AddressBookNew address2) 
	{
		if((address1.address.getPincode()) < (address2.address.getPincode()))
		{
			return -1;
		}
		else if((address1.address.getPincode()) > (address2.address.getPincode()))
		{
			return 1;
		}
		return 0;
		
	}
	
	
	


}
