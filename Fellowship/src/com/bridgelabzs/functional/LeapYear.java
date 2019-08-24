/******************************************************************************
 *  
 *  Purpose: To check year is leap year or not.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class LeapYear {

	public static void main(String[] args)
	{
		System.out.println("Enter Year ");
        int year= Utility.integerInput();
     // Call method from Utility class
        Utility.leapYear(year);  
	}

}
