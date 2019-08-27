package com.bridgelabzs.datastructure;

class Node
{
	public String data;
	public Node next;
	
	Node(String d)
	{
		this.data=d;
		this.next=null;
	}
}

public class Unorded_List
{
	public Node head;
	public int size;
	
	public Unorded_List()
	{
		head=null;
	}
	
	public void add(String data)
	{
		Node newItem=new Node(data);
		newItem.next=head;
		head=newItem;
		size++;
	}
	
	public String delete()
	{
		String temp=head.data;
		head=head.next;
		size--;
		return temp;
		
	}
	
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public int search(String data)
	{
		Node search=head;
		int count=1;
		while(search!=null)
		{
			if(search.data==data)
			{
				return count;
			}
			else
			{
				search=search.next;
				count++;
			}
		}
		
		return -1;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		Unorded_List ul=new Unorded_List();
		ul.add("Vaibhav");
		ul.add("Amit");
		ul.add("Suraj");
		
		ul.display();
		ul.delete();
		ul.search("aaa");
		ul.display();
	}

}
