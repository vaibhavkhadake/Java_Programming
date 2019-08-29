/******************************************************************************
 *  
 *  Purpose: Simple Balanced Parentheses Main method
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   29-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class StackMain 
{
	
	
	public static void main(String[] args) 
	{
		Stack stack= new Stack();
		
		/*stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		
		stack.push(40);
		
		stack.display();
		*/
		
		System.out.println("Enter arithmatic expression");
		String ae=Utility.stringInput();
		
		
		boolean result=stack.check(ae);
		System.out.println(result);
		
	}
	

}
