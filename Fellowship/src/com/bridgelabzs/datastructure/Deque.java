/******************************************************************************
 *  
 *  Purpose: Write a program in double ended Queue.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   1-09-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

public class Deque<E>
{
	public Node<E> head;
	public int size=0;
	
	public int size()
	{
		return size;
	}
	/**
	 * add At The End
	 * @param string
	 */
	public void addAtRight(E search)
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
		size++;
	}

	/**
	 * addAtBeggining
	 * @param string
	 */
	public void addAtLeft(E string)
	{
		Node<E> currentNode=new Node<E>();
		currentNode.data=string;
		currentNode.next=null;
		currentNode.next=head;
		head=currentNode;
		size++;
	}
	
	/**
	 * delete the element through index position.
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
		size--;
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
/**
 * delete the element through element.
 * @param search
 */
	public void delete(E search) 
	{
		Node n = new Node();
		n = head;
		while(!search.equals(n.next.data))
		{
			n = n.next;
		}
		
		Node n2 = new Node();
		n2 = n.next;
		if(n2.next==null)
		{
			//System.out.println(n2.data);
			n2 = null;
			
		}
		else
		{
			n.next = n2.next;
			System.out.println(n2.data);
			n2 = null;
		}
		size--;
	}
	/**
	 *add element at the end.
	 * @param element
	 */
	public void addAtEnd(E element)
	{
		Node n = new Node();
		n.data=element;
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node n2=new Node();
			n2=head;
			while(n2.next!=null)
			{
				n2=n2.next;
			}
			n2.next=n;
			n.prev=n2;
			
		}
		
		size++;	
	}
	/**
	 * Delete element left to right.
	 * @return
	 */
	public E deleteAtLeftEnd() 
	{
		Node n = new Node();
		n = head;
		head=head.next;
		E str=(E) n.data;
		n=null;
		//System.out.println(str);
		size--;
		System.out.println("left"+size);
		
		return str;
	}
	/**
	 * Delete element right.to left
	 * @return
	 */
	public E deleteAtRightEnd()
	{
		Node n=new Node();
		n=head;
		while(n.next.next!=null)
		{
			n=n.next;
		}
		
		Node n2=n.next;
		E str=(E) n2.data;
		n2=null;
		n.next=null;
		//System.out.println(n2.data);
		//n2=null;
		size--;
		System.out.println("Right"+size);
		return str;
	}
	/**
	 * Double ended for delete the element at the left side.
	 * @return
	 */
	public E dLeftdelete() {
		Node n= new Node();
		n=head;
		head=head.next;
		head.prev=null;
		E str=(E) n.data;
		size--;
		return str;
		
	}
	/**
	 * Double ended for delete the element at the Right side.
	 * @return
	 */
	public E dRightdelete() {
		Node n= new Node();
		n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		Node n2=n.prev;
		
		E str=(E) n.data;
		n=null;
		n2.next=null;
		size--;
		return str;
		
	}
	
	
}
