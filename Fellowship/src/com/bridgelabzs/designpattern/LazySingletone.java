package com.bridgelabzs.designpattern;

public class LazySingletone
{
	private static  LazySingletone instance;
	
	private LazySingletone()
	{
		
	}
	
	public static LazySingletone getInstance()
	{
		if(instance==null)
		{
			instance=new LazySingletone();
		}
		return instance;
		
	}
}
