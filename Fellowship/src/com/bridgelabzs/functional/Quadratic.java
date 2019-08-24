/******************************************************************************
 *  
 *  Purpose: To find the roots of the equation a*x*x + b*x + c.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Utility utility=new Utility();
		double a,b,c;
		System.out.println("Enter a, b, and c values");
		a=Utility.doubleInput();
		b=Utility.doubleInput();
		c=Utility.doubleInput();
		// Call method from Utility class
		utility.quadratic(a, b, c);

	}

}
