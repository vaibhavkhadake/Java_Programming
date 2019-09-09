
/******************************************************************************
 *  
 *  Purpose: Anagram Detection using linked List.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class AnagramStackMain {

	public static void main(String[] args) 
	{
		StackLinkedList stack=Utility.anagramToStack();
		stack.viewStackAnagram();
	}

}
