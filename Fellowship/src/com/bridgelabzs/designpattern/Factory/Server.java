/******************************************************************************
 *  
 *  Purpose: It is part of Factory Pattern Program. 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabzs.designpattern.Factory;

public class Server 
{
	public static Computer getDetails(String type,String ram,String hardDisk,String cpu)
	{
		if("PC".equalsIgnoreCase(type))
		{
			return new PersonalComputer(ram,hardDisk,cpu);
		}
		else if("Laptop".equalsIgnoreCase(type))
		{
			return new Laptop(ram,hardDisk,cpu);
		}
		return null;	
	}
}
