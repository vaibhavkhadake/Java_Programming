/******************************************************************************
 *  
 *  Purpose: dayOfWeek static function that takes a date as input and
		     prints the day of the week that date falls on
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

import com.bridgelabzs.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		
		Utility.dayWeek( day, month, year);	

	}

}
