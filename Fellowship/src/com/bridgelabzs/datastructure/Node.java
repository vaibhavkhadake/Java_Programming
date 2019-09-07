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
	
	public Node()
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
