package com.bridgelabzs.datastructure;

public class HashingUtility <E>
{
	public Node<E> head;
	public int size;

	public E add(Object search)
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
		return (E) search ;
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
	
}
