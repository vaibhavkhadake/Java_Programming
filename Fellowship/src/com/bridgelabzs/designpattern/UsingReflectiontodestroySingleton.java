package com.bridgelabzs.designpattern;

import java.lang.reflect.Constructor;

public class UsingReflectiontodestroySingleton
{

	public static void main(String[] args)
	{
		
		EgarInitilizationSingletone instanceOne=EgarInitilizationSingletone.getInstance();
		EgarInitilizationSingletone instanceTwo=null;
		try
		{
			@SuppressWarnings("rawtypes")
			Constructor[] constructors=EgarInitilizationSingletone.class.getDeclaredConstructors();
			for(@SuppressWarnings("rawtypes") Constructor constructor:constructors)
			{
				//destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo= (EgarInitilizationSingletone) constructor.newInstance();
                break;
			}
		}
		catch (Exception e)
		{
            e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
