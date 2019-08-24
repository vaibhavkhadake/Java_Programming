/******************************************************************************
 *  
 *  Purpose: Takes two double command­line arguments t
			 and v and prints the wind chill. Use Math.pow(a, b).
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class WindChill {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		/**the formula is not valid if tempereture is larger than 50 in absolute value or if wind_speed is larger
		than 120 or less than 3 (you may assume that the values you get are in that range).
		*/
		double temperature=Double.parseDouble(args[0]);
		double wind_speed=Double.parseDouble(args[1]);
		// Call method from Utility class
		utility.windchil(temperature,wind_speed);	

	}

}
