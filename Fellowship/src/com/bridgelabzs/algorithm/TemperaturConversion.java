/******************************************************************************
 *  
 *  Purpose: Convert temperature in fahrenheit and temperature in Celsius.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

import com.bridgelabzs.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args)
	{
		System.out.println("Enter the temperature in fahrenheit=");
		double Fahrenheit=Utility.doubleInput();
		
		System.out.println("Enter the temperature in Celsius=");
		double Celsius=Utility.doubleInput();
		
		Utility.temperature(Fahrenheit,Celsius);

	}

}
