/******************************************************************************
 *  
 *  Purpose: BubbleSort method for integer.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

public class Bubble_sort_integer 
{

	public static void main(String[] args) 
	{
		int[] number= {5,6,1,2,3,4,7,8,9};
		int temp=0;
		for(int i=0;i<number.length;i++)
		{
			for(int j=1;j<(number.length-i);j++)
			{
				if(number[j-1]>number[j])
				{
					temp=number[j-1];
					number[j-1]=number[j];
					number[j]=temp;
				}
			}
		}
		//print the sorted elements.
		for(int i=0;i<number.length;i++)
		{
		System.out.print(number[i]+" ");
		}
		

	}

}
