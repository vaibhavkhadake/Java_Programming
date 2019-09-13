/******************************************************************************
 *  
 *  Purpose: It is part of Factory Pattern Program, This program is client side program. 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabzs.designpattern.Factory;

public class ComputerFactoryMain 
{
	public static void main(String[] args) 
	{
		PersonalComputer pc=(PersonalComputer) Server.getDetails("PC", "4 GB","500 GB", "2.4 GHz");
		System.out.println("Personal Computer Details are	: "+pc);
		
		Laptop laptop=(Laptop) Server.getDetails("Laptop", "8 GB", "1 TB", "2.4 GHz");
		System.out.println("Laptop Details are		: "+laptop);
	}

}
