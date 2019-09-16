package com.bridgelabzs.OOPConcepts.AddressBookNew;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByPinCode implements Comparator<Object >
{

	List<AddressNew> list=new ArrayList<AddressNew>();
	public int compare(AddressNew address1, AddressNew address2) 
	{
		if((address1.getPincode()) < (address2.getPincode()))
		{
			return -1;
		}
		else if ((address1.getPincode()) > (address2.getPincode()))
		{
			return 1;
		}
		return 0;
		
	}
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}



}
