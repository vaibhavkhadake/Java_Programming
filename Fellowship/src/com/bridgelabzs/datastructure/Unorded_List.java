package com.bridgelabzs.datastructure;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabzs.utility.Utility;

public class Unorded_List<E>
{
	public static<E> void main(String[] args) throws IOException 
	{
		Linked_List<String> ll=new Linked_List<String>();
		File file=new File("/home/user/Desktop/Vaibhav_VK/sample");
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		System.out.println("Enter element to search");
		String  search=Utility.stringInput();
		String temp="";
		
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
				 temp=words[i];
				 ll.addAtBeggining(temp);
			 }
			 if(ll.search(search))
			 {
				ll.display();
				System.out.println("\nElement found"); 
				ll.delete(search);
				ll.display();
				break;
			 }
			 else
			 {
				 
				 System.out.println("Element not found ");
				 ll.addAtBeggining(search);
				 System.out.println("New element added ");
				  FileWriter fw=new FileWriter(file,true);
				  BufferedWriter bw= new BufferedWriter(fw);
				  bw.write(search);
				 
				 break;
				 
			 }
		  }	 

		  ll.display();
//		  File file = new File("/home/user/Desktop/Vaibhav_VK/sample");
//			Scanner scan = new Scanner(System.in);
//			scan = new Scanner(file);
//			String string;
//			int length = (int) file.length();
//			while(scan.hasNext()) 
//			{
//				String s = scan.next();
//				ll.add(s);
//			}
//			System.out.println("Words seperated from text file:\n");
//			ll.display();
//			System.out.println("\nEnter the key u want to search");
//			Scanner scanner = new Scanner(System.in);
//			string=scanner.next();
//			if(ll.search(string))
//			{
//				System.out.println("\nElement Found and deleting element....\n");
//				ll.delete(string);
//			}
//			else {
//				System.out.println("\nElement Not Found, Adding into the list\n");
//				ll.add(string);
//				System.out.println("Added Successfully");
//				ll.display();
//			}
	}

}
