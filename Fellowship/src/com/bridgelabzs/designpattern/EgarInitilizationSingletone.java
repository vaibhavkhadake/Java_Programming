package com.bridgelabzs.designpattern;

public class EgarInitilizationSingletone {
	
	private static final EgarInitilizationSingletone instance=new EgarInitilizationSingletone();
	
	private EgarInitilizationSingletone()
	{
		
	}
	public static EgarInitilizationSingletone getInstance()
	{
		
		return instance;
		
	}
}
