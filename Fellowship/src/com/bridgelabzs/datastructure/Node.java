/******************************************************************************
 *  
 *  Purpose: Create Node.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

public class Node<E> 
{

	public E data;
	public Node next;
	public Node prev;
	
	Node()
	{
		//data=0;
		//next=null;
		
		
	}
	Node(E d)
	{
		data =  d;
		next = null;
		prev=null;
		
	}
	
}
/**
 *  // Read lines from file.
		  
			 for(int i=0;i<words.length;i++)
			 {
			 if(search.equals(words[i]))
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
			 }
			 
		  }
		  
		  
		  
		  
 * 
 * 
 * 
 */
