package com.bridgelabzs.OOPConcepts;

import com.bridgelabzs.datastructure.QueueLinkedList;

public class DeckOfCardUsingQueueLinkedList {

	public static void main(String[] args)
	{
		QueueLinkedList<String> queue=new QueueLinkedList<String>();
		Card.getCard();
		Card.shuffleCard();
		
		String[][]pcard=Card.linkedListCards(4,9);
		Card.LinkedListdisplay(pcard);
		
		
	}

}
