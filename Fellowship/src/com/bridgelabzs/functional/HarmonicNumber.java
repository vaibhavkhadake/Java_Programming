/******************************************************************************
 *  
 *  Purpose: Prints the Nth harmonic number.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class HarmonicNumber
{
	public static void main(String[] args)
	{
		//take input from command line
		int number=Integer.parseInt(args[0]);
		// Call method from Utility class
		Utility.harmonic(number);
	}

}
