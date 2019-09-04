/******************************************************************************
 *  
 *  Purpose: Palindrom using Double ended queue.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   30-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class PalindromQueue 
{
	public static void main(String[] args)
	{	
		
		Deque<Character> deque=new Deque<Character>();
		System.out.println("Enter element in queue");
		String element=Utility.stringInput();
		int flag=0;
		/**
		 * Insert element in queue
		 */
		for(int i=0;i<element.length();i++)
		{
			char ch=element.charAt(i);
			deque.addAtEnd(ch);
		}
		deque.display();
		// delete the character.
		while(deque.size>1)
		{
			char char1=deque.dLeftdelete();
			char char2=deque.dRightdelete();
			
			if(char1!=char2)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
	

}
