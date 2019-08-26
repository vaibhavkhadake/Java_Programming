/******************************************************************************
 *  
 *  Purpose: MonthlyPayment.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

import com.bridgelabzs.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		double  amount,rate_of_interest,period;
		
		System.out.println("Enter amount");
	 	amount=Utility.doubleInput();
	 	System.out.println("Enter rate of interest");
	 	rate_of_interest=Utility.doubleInput();
	 	System.out.println("Enter period");
	 	period=Utility.doubleInput();
	 	
	 	Utility.compound_interest(amount,rate_of_interest,period);
	}

}
