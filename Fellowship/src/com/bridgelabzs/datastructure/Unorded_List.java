package com.bridgelabzs.datastructure;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabzs.utility.Utility;

public class Unorded_List<E>
{
	public static<E> void main(String[] args) throws IOException 
	{
		Linked_List<String> ll=new Linked_List<String>();
		File file=new File("/home/user/Desktop/Vaibhav_VK/sample");
		System.out.println("Enter element to search");
		String  search=Utility.stringInput();
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		 String temp="";
		 
		  // Read lines from file.
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
			 }
		  }
				  if(search.equals(temp))
				  {
					  System.out.println("Element found..........");
					  ll.delete(); 
				  }
				  else  
				  {
					  System.out.println("Element not found..then element add in list");
					  ll.add(search);
			  
					  FileWriter fw=new FileWriter(file,true);
					  BufferedWriter bw= new BufferedWriter(fw);
					  bw.write(search);
			  
					  bw.close();
					  fw.close();
				  }
		 
		  ll.display();
		
	}

}
