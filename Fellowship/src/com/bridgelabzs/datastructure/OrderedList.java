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

public class OrderedList <E>{

	public static <E> void main(String[] args) throws IOException
	{
		Linked_List<Integer> ll=new Linked_List<Integer>();
		File file=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/IntegerValues");
		BufferedReader br=new BufferedReader(new FileReader(file));
		int number;
		System.out.println("Enter number to search");
		int search=  Utility.integerInput();
		while (true) 
		  {
			  String line=br.readLine();
			  if(line==null)
			  {
				  break;
			  }
			 // Split line.
			  String[] words = line.split(" ");
			  for(int i=0;i<words.length;i++)
				 {
					number=Integer.parseInt(words[i]); 
					 ll.add(number);
				 }
			// ll.display();
			// ll.sort();
			 if(ll.search(search))
			 {
				System.out.println("\nElement found"); 
				ll.delete(search);
				ll.display();
				break;
			 }
			 else
			 {
				 System.out.println("Element not found ");
				 	ll.add(search);
				 	System.out.println("New element added ");
				 	ll.display();	
				 	break;
			 } 
		  }	 
		 String s=ll.addToFile();
		 FileWriter fw=new FileWriter(file);
		 BufferedWriter bw= new BufferedWriter(fw);
		 fw.write(s);
		 bw.flush();
	}


	
		
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
		
		



}
