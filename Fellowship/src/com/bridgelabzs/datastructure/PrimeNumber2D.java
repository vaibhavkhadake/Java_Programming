/******************************************************************************
 *  
 *  Purpose: Display prime number between 0-1000.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   03-09-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

public class PrimeNumber2D 
{
	public static void main (String [] args)
	{
		int array[]=new int[168];
		int k=1;
		int i=0;
		int n=1;
		// there are 168 prime number between 0-1000.
		while(i<168)
		{
			if(Prime.prime(k)==true)
			{
				array[i]=k;
				i++;
				n++;
			}
			k++;
		}
		int m=0;
		int array1[][]=new int[10][25];
		for(int j=0;j<10;j++)
		{
			for(int l=0;l<25;l++)
			{
				if(array.length>m)
				{
					array1[j][l]=array[m];
					m++;
				}
			}
		}
		/**
		 * This loop is for display prime numbers.
		 */
		for(int j=0;j<7;j++)
		{
			for(int l=0;l<20;l++)
			{
				System.out.print(array1[j][l]+"\t");
			}
			System.out.println("\n");
		}

		
	}		
}
