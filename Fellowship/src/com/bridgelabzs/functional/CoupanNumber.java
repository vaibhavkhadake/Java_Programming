
/******************************************************************************
 *  
 *  Purpose: N distinct Coupon Numbers, how many random numbers do you
			 need to generate distinct coupon number?
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class CoupanNumber {

	public static void main(String[] args)
	{
		int number;
		System.out.println("Enter new number :");
		number = Utility.integerInput();
		Utility.compute(number);
		
	}

	

}
