/******************************************************************************
 *  
 *  Purpose: Find the Fewest Notes to be returned for Vending Machine
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   26-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

import com.bridgelabzs.utility.Utility;

public class Vending_Machine 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter amount");
		int amount=Utility.integerInput();	
		Utility.calculation(amount);	
	}

}
