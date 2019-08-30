/******************************************************************************
 *  
 *  Purpose: Queue program logic.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   29-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class QueueLogic <E>
{
	int front;
	int rear;
	
	int[] array;
	int count,capacity;
	int amount=100000;
	
	
	 public QueueLogic(int size)
	 {
		array=new int[size];
		front=0;
		rear=-1;
		count=0;
		capacity=size;
	 }
	 
	 public int size()
		{
			return count;
		}
	 
	 public Boolean isEmpty()
		{
			return (size() == 0);
		}

		
	public Boolean isFull()
		{
			return (size() == capacity);
		}
		
		
	 public void enqueue(int newElement)
	 {
		 if(isFull())
		 {
			 System.out.println("Overflow");
			 System.exit(1);
		 }
		 else
		 {
			 rear=(rear+1)%capacity;
			 array[rear]=newElement;
			 count++;
		 }
	 }
	 public void dequeue()
	 {

			if(isEmpty())
			 {
				 System.out.println("Underflow empty queue");
				 System.exit(1);
			 }
			 else
			 {
				 
				 int element=array[front];
				 front=(front+1)%capacity;
				 count--; 
				 System.out.println("Remove "+element);
			 }
	 }
	 public void display()
	 {
		 for (int i=front;i<=rear;i++)
		 {
			 System.out.print(array[i%capacity]+" ");
		 }
	 }
	public void deposite()
	{
		System.out.println("Enter amount to deposit");
		//enqueue(Utility.integerInput());
		int newAmount=Utility.integerInput();
		 amount=amount+newAmount;
		 System.out.println("Total amount is  "+amount);
		 dequeue();
		 display();
	}
	public void withdraw()
	{
		System.out.println("Enter amount to withdraw");
		int newAmount=Utility.integerInput();
		 amount=amount-newAmount;
		 System.out.println("Total amount is  "+amount);
		 dequeue();
		 display();
	}
	
		
		
}
