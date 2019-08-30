package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class PalindromQueue {

	public static void main(String[] args)
	{
		Deque<String> d=new Deque<String>();
//		System.out.println("Enter element in queue");
//		String element=Utility.stringInput();
		d.add("Abhi");
		d.add("Mark");
		d.add("Suraj");
		d.add("Ganesh");
		d.add("Sachin");
		d.addAtBeggining("Vaibhav");
		d.display();
		d.delete();
		d.display();
		d.delete();
		
		d.atDelete(2);
		d.display();
		d.deleteAtEnd();
	}

}
