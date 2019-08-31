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
	 * add At The End
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
			n.next =  node.next;
			node.next=n;

		}
		
	}

	/**
	 * addAtBeggining
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
	 * 
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
	 * delete
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
	public boolean search(E data)
	{
		Node<E> current=head;
		while(current!=null)
		{
		if(current.data.equals(data))
			{
			return true;
			}
		current=current.next;
		}
		
		return false;
		
	}

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

	public void delete(E search) 
	{
		Node n = head,temp=null;
		if(n!=null && n.data==search) {
			head = n.next;
			return;
		}
		while(n!=null && n.data!=search) {
			temp =n;
		 n =n.next;
		}
		temp.next=n.next;
		System.out.println("Deleted Successfully");
		display();
//		while(!search.equals(n.next.data))
//		{
//			n = n.next;
//		}
//		
//		Node n2 = new Node();
//		n2 = n.next;
//		if(n2.next==null)
//		{
//			//System.out.println(n2.data);
//			n2 = null;
//			
//		}
//		else
//		{
//			n.next = n2.next;
//			System.out.println(n2.data);
//			n2 = null;
//		}		
	}
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
}
