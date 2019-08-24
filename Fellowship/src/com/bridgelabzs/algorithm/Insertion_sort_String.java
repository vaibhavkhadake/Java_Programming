/******************************************************************************
 *  
 *  Purpose: InsertionSort method for String.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   23-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

public class Insertion_sort_String {

	public static void main(String[] args)
	{
		String[] names= {"Vaibhav","Amit","Ajay","Rakesh","Suresh"};
		
			for (int j=1;j<names.length;j++)
			{
				String key=names[j];
				int i=j-1;
				while(i>=0&&(names[i].compareTo(key))>0)
				{
					names[i+1]=names[i];
					i--;
				}
				names[i+1]=key;
			}//for loop close
			//sorted array
				for(String i:names)
				{
					System.out.print(i+" ");
				}

	
	}

}
