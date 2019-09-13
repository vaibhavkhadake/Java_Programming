package com.bridgelabzs.designpattern;

public class DoubleCheckingThreadSafeSingleton 
{
	private static DoubleCheckingThreadSafeSingleton instance;
	
	private DoubleCheckingThreadSafeSingleton()
	{
		
	}
	
	public static DoubleCheckingThreadSafeSingleton getInstance()
	{
		if(instance==null)
		{
			synchronized (DoubleCheckingThreadSafeSingleton.class) 
			{
				if(instance==null)
				{
					instance=new DoubleCheckingThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
