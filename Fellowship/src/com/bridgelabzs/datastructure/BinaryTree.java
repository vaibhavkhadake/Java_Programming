/******************************************************************************
 *  
 *  Purpose: Binary Search Tree.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class BinaryTree<E> {
	
	public Node newNode(int k)
	{
		Node n=new Node();
		n.data=k;
		n.prev=null;
		n.next=null;
		return n;
	}
	
	public Node insert(Node node,int value)
	{
		if(node==null)
		{
		return newNode(value);
		}
		if(value < (int)node.data)
		{
			node.prev=insert(node.prev, value);
		}
		else if(value > (int)node.data)
		{
			node.next=insert(node.next, value);
		}
			
		
		return node;
		
	}
	public Node delete(Node node ,int value)
	{
		if(node==null)
		{
			return null;
		}
		if(value < (int)node.data)
		{
			node.prev=delete(node.prev, value);
		}
		else if(value > (int)node.data)
		{
			node.next=delete(node.next, value);
		}else
		{
			if(node.prev==null || node.next==null)
			{
				Node temp=null;
				temp= node.prev==null ? node.next : node.prev;
				
				if(temp==null)
				{
					return null;
				}
				else
				{
					return node;
				}
			}
			else
			{
				Node successor=getSuccessor(node);
				node.data=successor.data;
				node.next=delete(node.next, 4); 
				return node;
			}
			
		}
		
		return node;
		
	}
	

	private Node getSuccessor(Node node)
	{
		if(node==null)
		{
			return null;
		}
		Node temp=node.next;
		while(temp!=null)
		{
			temp=temp.prev;
		}
	
		return null;
	}

	public static <E> void main(String[] args)
	{
		BinaryTree<E> bt=new BinaryTree<E>();
		Node root=null;
		root=bt.insert(root,500);
		System.out.println(root.data);
		root=bt.insert(root,600);
		System.out.println(root.data);
		root=bt.insert(root,200);
		System.out.println(root.data);
		root=bt.insert(root,300);
		System.out.println(root.data);

	}

}
