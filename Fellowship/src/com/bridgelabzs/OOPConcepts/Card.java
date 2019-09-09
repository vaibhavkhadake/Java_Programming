/******************************************************************************
 *  
 *  Purpose: Deck of card all methods
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;
import java.util.ArrayList;
import java.util.Random;

import com.bridgelabzs.datastructure.QueueLinkedList;

public class Card
{
	 static QueueLinkedList<String> queue=new QueueLinkedList<String>();
	 static String[] suit= {"Clubs","Diamonds","Hearts","Spades"};
	 static String[] rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10","Joker", "Queen", "King", "Ace"};
	 static String[] deck=new String[52];
	 // Get card
	public static String[] getCard()
	{
		int i=0;
		for(String s:suit)
		{
			for(String card:rank)
			{
				deck[i]=card+" "+s;
				i++;
			}
		}
		return deck;
	}
	//Shffule the card
	public static void shuffleCard()
	{
		Random random=new Random();
		for(int i=0;i<deck.length;i++)
		{
			int index=random.nextInt(52);
			String temp=deck[index];
			deck[index]=deck[i];
			deck[i]=temp;
		}
	}
	//Distibute the cards
	public static String[][] cards(int players,int noOfCard)
	{
		String pCards[][]=new String[players][noOfCard];
		int p=0;
		for(int i=0;i<players;i++)
		{
			for(int j=0;j<noOfCard;j++)
			{
				pCards[i][j]=deck[p];
				//System.out.println(pCards[i][j]);
				queue.enqueue(pCards[i][j]);
				p++;
				
			}
		}
		
				return pCards;	
	}
	//Display all card player wise.
	public static void display(String[][] playerCard)
	{
		int player=1;
		int c=1;
		for(String[] pcard:playerCard)
		{
			System.out.println("\n Player : "+(player++));
			
			for(String card:pcard)
			{
				System.out.print("\t :"+card+ " ");
			}
			System.out.println();
		}
		
	}
	// Disribute card in queue
	public static String[][] linkedListCards(int players,int noOfCard)
	{
		String pCards[][]=new String[players][noOfCard];
		int p=0;
		for(int i=0;i<players;i++)
		{
			for(int j=0;j<noOfCard;j++)
			{
				//pCards[i][j]=deck[p];
				
				queue.enqueue(deck[p]);
				p++;
			}
		}
		//queue.viewQueue();
				return pCards;	
	}
	// Display card in queue
	public static void LinkedListdisplay(String[][] playerCard)
	{
		int player=1;
		for(String[] pcard:playerCard)
		{
			System.out.println("\n Player : "+(player++));
			
			for(int i=0;i<pcard.length;i++)
			{
				String value= (String) queue.dequeue();
				System.out.print(" : "+value);
			}
			System.out.println();
		}
		
	}
}
