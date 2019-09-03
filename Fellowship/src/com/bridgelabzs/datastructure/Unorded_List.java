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
				 ll.add(temp);
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

}
