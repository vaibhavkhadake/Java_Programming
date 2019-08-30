package com.bridgelabzs.datastructure;

public class Deque<E>
{
	public Node<E> head;
	public int size;
	
	/**
	 * add At The End
	 * @param string
	 */
	public void add(String search)
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
	}
	public void delete() 
	{
		Node n = new Node();
		n = head;
		head=head.next;
		E str=(E) n.data;
		n=null;
		System.out.println(str);
	}
	public void deleteAtEnd()
	{
		Node n=new Node();
		n=head;
		while(n.next.next!=null)
		{
			n=n.next;
		}
		Node n2=n.next;
		n.next=null;
		System.out.println(n2.data);
		n2=null;
		
		
	}

}
