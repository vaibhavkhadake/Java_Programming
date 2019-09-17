package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.util.Comparator;

public class SortByFirstName implements Comparator<AddressBookNew>
{
	public  int compare(AddressBookNew address1, AddressBookNew address2) 
	{
		return  address1.person.getPersonFirstName().compareTo(address2.person.getPersonFirstName());  
	}
	
}
