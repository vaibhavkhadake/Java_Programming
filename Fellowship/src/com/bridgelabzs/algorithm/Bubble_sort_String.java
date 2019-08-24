/******************************************************************************
 *  
 *  Purpose: BubbleSort method for String.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

public class Bubble_sort_String {

	public static void main(String[] args) 
	{
		String[] s= {"vaibhav","amar","sandip","mark"};
		String temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[j].compareTo(s[i])<0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			System.out.print(s[i]+" ");
		}

	}

}
