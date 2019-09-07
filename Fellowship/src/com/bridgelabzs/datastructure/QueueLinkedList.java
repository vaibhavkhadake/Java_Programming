package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class QueueLinkedList<T>
{
	
	public Node <T> front;
	public Node <T> rear;
	public int size=0;

	public void enqueue(Object item)
	{
	Node<T> newNode = new Node<T>();
	newNode.data =  (T) item;
	if(front == null)
	{
	front = rear = newNode;
	size++;
	}
	else
	{
	size++;
	rear.next = newNode;
	rear = rear.next;
	}
	}

	public Object dequeue()
	{
	Object data;
	Node<T> tempNode = new Node<T>();
	tempNode = front;
	if(front.next==null)
	{
	size--;
	data = front.data;
	front = null;
	}
	else
	{
	size--;
	front = front.next;
	data =  tempNode.data;
	tempNode = null;
	}
	return data;
	}

	public void viewQueue()
	{
	Node<T> tempNode = new Node<T>();
	tempNode = front;
	if(front==null)
	{
	System.out.println("Queue is Empty");
	}
	else
	{
	System.out.print("Queue = ");
	while(tempNode!=null)
	{
	System.out.print("  "+tempNode.data);
	tempNode = tempNode.next;
	}
	System.out.println("");
	}

	}

	public void viewAnagramQueue()
	{
	Node<T> tempNode = new Node<T>();
	tempNode = front;
	int iCnt = 0;
	if(front==null)
	{
	System.out.println("Queue is Empty");
	}
	else
	{

	System.out.print("Queue = ");
	while(tempNode!=null)
	{
	if(iCnt < 2)
	{
	System.out.println("  "+tempNode.data);
	}
	else
	{
	System.out.println("  "+tempNode.data);
	}

	tempNode = tempNode.next;
	}
	System.out.println("");
	}
	}

	public boolean isEmpty()
	{
	if(front==null)
	{
	return true;
	}
	else
	{
	return false;
	}
	}



	public static <T>void main(String[] args)
	{
	QueueLinkedList<T> queue =Utility.anagramToQueue();
	queue.viewAnagramQueue();
	
	}
	}
