/******************************************************************************
 *  
 *  Purpose: Simulates a gambler to check how many time win and loss.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class Gambler
{
	public static void main(String[] args)
	{
		double stake, goal  ,trails;
		
		System.out.println("Enter stake ");
		stake=Utility.doubleInput();
		System.out.println("Enter goal ");
		goal=Utility.doubleInput();
		System.out.println("Enter trails ");
		trails=Utility.doubleInput();
		// Call method from Utility class
		Utility.gamling(stake,goal,trails);
	}

}
