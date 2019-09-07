package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class AnagramStackMain {

	public static void main(String[] args) 
	{
		StackLinkedList stack=Utility.anagramToStack();
		stack.viewStackAnagram();
	}

}
