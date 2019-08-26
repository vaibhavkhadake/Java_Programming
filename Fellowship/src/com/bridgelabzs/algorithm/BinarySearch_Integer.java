/******************************************************************************
 *  
 *  Purpose: BinarySearch method for Interger.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

import com.bridgelabzs.utility.Utility;

public class BinarySearch_Integer {

	public static void main(String[] args) 
	{
		//In binary search method elements arrange in Sorted order
		
		System.out.println("Enter how many elements");
		int number=Utility.integerInput();;
		int[] array= new int[number];
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.integerInput();
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		//Element arrange in sorted order.
		System.out.println("\n Sorted elements are \n");
		//method call from Utility class
		Utility.bubbleInteger(array);
		int high=array.length,low=0,mid=low+high/2;
	
		System.out.println("\nEnter element you want to search");
		int search=Utility.integerInput();

		
	while(low<=high)
	{
		if(array[mid]<search)
		{
			low=mid+1;
		}
		else if(array[mid]==search)
		{
			System.out.println("Element Found");
			break;
		}
		else
		{
			high=mid-1;
		}
		mid = (low+high)/2;
	}
	if(low>high)
		System.out.println("not found");
	}

}
