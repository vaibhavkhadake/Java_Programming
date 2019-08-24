/******************************************************************************
 *  
 *  Purpose: This program takes a command­line argument N and prints a table of the
			  powers of 2 that are less than or equal to 2^N.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args)
	{
		//take input from command line
		int number=Integer.parseInt(args[0]);
		// Call method from Utility class
		Utility.power(number);
	}

}
