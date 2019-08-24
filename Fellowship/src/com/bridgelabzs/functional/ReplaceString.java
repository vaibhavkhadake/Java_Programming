/******************************************************************************
 *  
 *  Purpose: Replace String.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class ReplaceString
{
	public static void main(String[] args)
	{
		System.out.println("Enter name for replace string");
		String newString=Utility.stringInput();
		//newString must be greater than 3 character
		if(newString.length()>3)
			Utility.inputString(newString);
		else
			System.out.println("Please Ensure UserName has min 3 char ");
	}

}
