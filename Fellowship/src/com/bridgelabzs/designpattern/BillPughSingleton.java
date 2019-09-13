package com.bridgelabzs.designpattern;

public class BillPughSingleton 
{
	private BillPughSingleton()
	{
		
	}
	private static class BillPughHelper
	{
		private static final BillPughSingleton instance=new BillPughSingleton();
	}
	
	public BillPughSingleton getInstance()
	{
		return BillPughHelper.instance;
		
	}
	 
	 
}
