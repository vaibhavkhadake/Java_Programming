package com.bridgelabzs.datastructure;

public class Linked <E>
{
	public Node head;
	public int size;
	/**
	 * addAtBeginning
	 * @param string
	 */
	public  void add(Object string)
	{
		Node newItem=new Node(string);
		newItem.next=head;
		head=newItem;
		size++;
	}
	/**
	 * addAtBeggining
	 * @param string
	 */
	public void addAtBeggining(E string)
	{
		Node currentNode=new Node();
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
		Node currentNode=new Node();
		currentNode.data=string;
		currentNode.next=null;
		if(index==0)
		{
			addAtBeggining(string);
		}
		else
		{
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
			
		}
		n.next=currentNode.next;
		n.next=currentNode;
		}
	}
	/**
	 * delete
	 */
	public void delete()
	{
		E temp=(E) head.data;
		head=head.next;
		size--;
		System.out.println("Deleted "+temp+" Word from list");
		
	}
	public void atDelete(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;
		}
	}
	public int search(E data,int length)
	{
		Node node=new Node();
		node=head;
		int position=1;
		while(node.next!=null)
		{
			 if(search.equals(word))
			  {
				break; 
			  }
			 node=node.next;
			 position++;
		}
		if(position>=length)
		{
			return -1;
		}
		else
		{
			return position;
		}
		
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}

}
