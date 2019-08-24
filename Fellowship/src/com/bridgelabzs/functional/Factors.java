/******************************************************************************
 *  
 *  Purpose: Computes the prime factorization of N using brute force.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;
import com.bridgelabzs.utility.Utility;

public class Factors {

	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter Number greater than 2 ");
		number=Utility.integerInput();
		// Call method from Utility class
		Utility.prime_fact(number);
	}
}
