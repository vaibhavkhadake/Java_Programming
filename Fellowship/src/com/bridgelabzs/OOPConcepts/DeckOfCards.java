/******************************************************************************
 *  
 *  Purpose: Deck of card main methods
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;
public class DeckOfCards
{
	
	public static void main(String[] args)
	{
		Card.getCard();
		Card.shuffleCard();
		String[][]pcard=Card.cards(4, 9);
		Card.display(pcard);
	}

}
