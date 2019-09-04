/******************************************************************************
 *  
 *  Purpose: Linked List Logic.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

public class Linked_List<E>
{
	public Node<E> head;
	public int size;
	
	/**
	 * add  Element at The End in linked list.
	 * @param string
	 */
	public void add(Object search)
	{
		Node<E> node = new Node<E>();
		node.data = (E) search;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node<E> n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;

		}
		
	}

	/**
	 * add  Element at The Beggining in linked list.
	 * @param string
	 */
	public void addAtBeggining(E string)
	{
		Node<E> currentNode=new Node<E>();
		currentNode.data=string;
		currentNode.next=null;
		currentNode.next=head;
		head=currentNode;
		
	}
	/**
	 * add  Element at any position in linked list.
	 * @param index
	 * @param string
	 */
	public void addAnyPosition(int index,E string)
	{
		Node<E> currentNode=new Node<E>();
		currentNode.data=string;
		currentNode.next=null;
		if(index==0)
		{
			addAtBeggining(string);
		}
		else
		{
		Node<E> n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		currentNode.next=n.next;
		n.next=currentNode;
		}
	}
	
	/**
	 * Delete  Element at any position in linked list.
	 * @param index
	 */
	public void atDelete(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node<E> n=head;
			Node<E> n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;
		}
	}
	/**
	 * Search  Element in linked list.
	 * @param search
	 * @return
	 */
	public boolean search(E search)
	{
		Node<E> current=head;
		while(current!=null)
		{
		if(current.data.equals(search))
		//	if(current.data==search)
			{
			return true;
			}
		current=current.next;
		}
		
		return false;
		
	}
/**
 * Display all the elelments in linked list.
 */
	public void display()
	{
		Node<E> n=head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.print(n.data+"\n");
	}
	/**
	 * 
	 * @param search
	 */
	public void delete(Object search)
	{
		Node n=head;
		if(n.data==search)
		{
			head=n.next;
			//n=null;
		}
		else if(n.next.next==null)
		{
			Node temp=n.next;
			n.next=null;
			//temp=null;
		}
		else
		{	
			while(!search.equals(n.next.data))
			{
				n = n.next;		
			}
			Node temp=n.next;
			n.next=temp.next;
			temp=null;
		}
	}
	
	/**
	 * Sort the elements in asending order
	 */
	public void sort()
	{
		Node current=head;
		Node index=null;
		int temp;
		
		if(head==null)
		{
			return ;
		}
		else
		{
		 //Node index will point to node next to current  
		while(current!=null)
		{
			index=current.next;
			
			while(index!=null)
			{
				//Use bubble sort 
			    if((int)current.data > (int)index.data)
			    {  
			    	   temp = (int) current.data;  
                       current.data = index.data;  
                       index.data = temp;  
				}
			    index=index.next;
			}
			current=current.next;
		}
		}	
		
	}
/**
 * Add elemnt in file.
 * @return
 */
	public String addToFile() 
	{
		String temp="";
		Node n=head;
		while(n!=null)
		{
			temp=temp+n.data+" ";
			n=n.next;
		}
		//System.out.println(temp);
		return temp;
	}
}
