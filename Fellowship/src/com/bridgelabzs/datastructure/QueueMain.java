package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class QueueMain {

	public static void main(String[] args)
	{
		int size=5;
		QueueLogic ql=new QueueLogic(size);
		int ch=0;
		System.out.println("Person in queue");
		ql.enqueue(101);
		ql.enqueue(102);
		ql.enqueue(103);
		ql.enqueue(104);
		ql.enqueue(105);
		ql.display();
		
		do
		{
			System.out.println("\n Press\n 1.Deposit \n 2.Withdraw \n 3.Exit");
			System.out.println("Enter choice");
			int choice=Utility.integerInput();
		switch(choice)
		{
		case 1:
			ql.deposite();
			break;
		case 2:
			ql.withdraw();
			break;	
		case 3:
			System.exit(0);
			break;	
		default : System.out.println("Wrong Entry \n ");
        break;
		
		}
		}while(ch<4);
	}


	}

