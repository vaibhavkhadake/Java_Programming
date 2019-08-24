/******************************************************************************
 *  
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class FlipCoin {

	public static void main(String[] args)
	{
		int coin;
		System.out.println("Enter a number we want to Flip the coin");
		coin=Utility.integerInput();
		// Call method from Utility class
		Utility.coin(coin);
	}

}
