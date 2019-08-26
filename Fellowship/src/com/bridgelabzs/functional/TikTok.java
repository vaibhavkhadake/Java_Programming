package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class TikTok
{	
	static int player;
	static int[][] board=new int[3][3];
	static boolean isEmpty=true;
	
	static void init()
	{
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=-10;
			}
	
		}
		display();
	}
	
	static void display()
	{
		int count=0;
		for(int i=0;i<board.length;i++)
		{
			System.out.println("--------------");
			//System.out.print("||");
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]==0)
				{
					count++;
					System.out.print(" O |");
				}
				else if(board[i][j]==1)
				{
					count++;
					System.out.print(" X |");	
				}
				else
				{
					System.out.print("   |");
				}
				
			}
			System.out.println();
		}
		if (count == 9)
		{
			isEmpty = false;
		}
		System.out.println("-------------");
	}
	
	static void put()
	{
		int i,j;
		
		if(player%2==1)
		{
			//for computer
			i=(int)(Math.random()*10)%3;
			j=(int)(Math.random()*10)%3;	
		}
		else
		{
			//For user
			System.out.println("Enter value of X and Y by space");
			i=Utility.integerInput();
			j=Utility.integerInput();	
		}
		if(board[i][j]==-10)
		{
			if(player%2==0)
			{
				board[i][j]=0;
			}
			else
			{
				board[i][j]=1;
				System.out.println("Computer "+i +""+j);
			}
		}
		else
		{
			put();
		}
	}
	static boolean win() 
	{
		return (
				(	board[0][0]	+	board[0][1]	+	board[0][2]	==	player*3) //1st row
			||  (	board[1][0]	+	board[1][1]	+	board[1][2]	==	player*3) //2nd row
			||  (	board[2][0]	+	board[2][1]	+	board[2][2]	==	player*3) //3rd row
			||  (	board[0][0]	+	board[1][0]	+	board[2][0]	==	player*3) //1st column
			||  (	board[0][1]	+	board[1][1]	+	board[2][1]	==	player*3) //2nd column
			||  (	board[0][2]	+	board[1][2]	+	board[2][2]	==	player*3) //3rd column
			||  (	board[0][0]	+	board[1][1]	+	board[2][2]	==	player*3) //Diagonal left to right
			||  (	board[0][2]	+	board[1][1]	+	board[2][0]	==	player*3) //Diagonal right to left
				);
		
	}
	static void start()
	{
		init();
		while(isEmpty)
		{
			System.out.println("Player turn");
			put();
			display();
			if(win())
			{
				System.out.println("You Won the game ");
			}
			player=1;
			System.out.println("Computer turn");
			put();
			display();
			if(win())
			{
				System.out.println("Computer Won the game ");
			}
			player=0;
			
		}
	}

	public static void main(String[] args)
	{
		
		TikTok.start();
		
	}

}
