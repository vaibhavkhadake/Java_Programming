/******************************************************************************
 *  
 *  Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabzs.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws IOException
	{
		Linked_List<Integer> ll=new Linked_List<Integer>();
		File file=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/IntegerValues");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String st=br.readLine();
		System.out.println(st);
		String[] words = st.split(" ");
		
		System.out.println("Enter number to search");
		String search=Utility.stringInput();
		
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(search);
		
		String temp="";
		boolean flag=false;
		
		for(int i=0;i<words.length;i++)
		 {
			temp=words[i];
			 if(temp.equals(search))
				{
				 System.out.println("Element Found");
				
				 flag=true;
				 break;
				}
		 }
		for(int i=0;i<words.length;i++)
		 {
		if(flag==false)
		{
			ll.add(search);
		}
		 }
		for(int i=0;i<words.length;i++)	
		{
			
		}
	
		
//		ll.sort();
//		ll.display();
//		
//		ll.addAnyPosition(3, 30);
//		ll.display();
//		
//		ll.addAtBeggining(100);
//		ll.display();
//		
//		ll.atDelete(2);
//		ll.display();
//	
//		System.out.println("Enter Number to search");
//		int number=Utility.integerInput();
		
		

	}

}
