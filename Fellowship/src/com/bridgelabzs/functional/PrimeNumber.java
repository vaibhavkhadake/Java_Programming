/******************************************************************************
 *  
 *  Purpose: Dispay prime number less than 1000.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class PrimeNumber 
{
	
	
	public static void main(String[] args)
	{
		
		int sum=0;
		int count=0;
		int[] arr=new int[1000];
		
		for(int i=2;i<1000;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				//prime numbers
				System.out.print(i+" ");
				count++;
				//call method from utility class to check number is palindom or not
				if(Utility.palindrom(i))
				{
					arr[sum]=i;
					sum++;
				}
				
			}
			
		}
		System.out.println("\nTotal count of prime number "+count);
		
	}

}
