package com.bridgelabzs.datastructure;




import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.transform.Templates;


public class demo<T>
{
	
	Node head;
	
	
	//Inserting data in linkedList
	public void insert(T string)
	{
		Node new_node = new Node(string);
		if(head==null) 
		{
			head = new Node(string);
			return;
		}
		new_node.next = null;
		
		Node lastNode = head;
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
		}
		lastNode.next = new_node;
	
	}
	public boolean search(Node head,T string) {
		Node current = head;
		
		while(current!=null) {
			
			if(current.data.equals(string)) 
				return true;
				
			current = current.next;
		}
		return false;
	}
	
	//deleting Node
	void deleteNode(T key)
	{
		Node temp = head, prev_node=null;
		if(temp!=null && temp.data==key) {
			head = temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev_node =temp;
			temp = temp.next;
		}
		
		prev_node.next = temp.next;
		System.out.println("Deleted Successfully");
		display();
	}
	//Dispalying Data from linkedllist
	public void display() {
		Node tempNode = head;
		while(tempNode!=null) {
			System.out.println(tempNode.data+"");
			tempNode = tempNode.next;
		}
	}

	public static void main(String[] args) throws IOException{
		demo<String> ul = new demo();
		File file = new File("/home/user/Desktop/Vaibhav_VK/sample");
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(file);
		String string;
		int length = (int) file.length();
		while(scan.hasNext()) 
		{
			String s = scan.next();
			ul.insert(s);
		}
		System.out.println("Words seperated from text file:\n");
		ul.display();
		System.out.println("\nEnter the key u want to search");
		Scanner scanner = new Scanner(System.in);
		string=scanner.next();
		if(ul.search(ul.head,string))
		{
			System.out.println("\nElement Found and deleting element....\n");
			ul.deleteNode(string);
			ul.display();
		}
		else {
			System.out.println("\nElement Not Found, Adding into the list\n");
			ul.insert(string);
			System.out.println("Added Successfully");
			ul.display();
		}
		
	}

}

