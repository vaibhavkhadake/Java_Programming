/******************************************************************************
 *  
 *  Purpose: An Anagram Detection
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   23-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class Anagram {

	public static void main(String[] args) 
	{
		
		String string1,string2;
		  // take two string to check anangram are not.
		System.out.println("Enter string 1");
		string1=Utility.stringInput();
		System.out.println("Enter string 2");
		string2=Utility.stringInput();
		// Call method from Utility class
		Utility.anagram(string1,string2);
			
	}

}
