package com.bridgelabzs.designpattern;

public class StaticBlockSingletone {
	
	private static final StaticBlockSingletone instance;
	
	private StaticBlockSingletone()
	{
		
	}
	static
	{
		try
		{
			instance=new StaticBlockSingletone();
		}catch(Exception e)
		{
		throw new  RuntimeException("Errorr");
		
		}
	}
	public StaticBlockSingletone getInstance()
	{
		
		return instance;
		
	}
}
