/******************************************************************************
 *  

 *  Purpose: BinarySearch method for String.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   24-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.algorithm;

public class BinarySearch_String {

	public static void main(String[] args)
	{
		String[] name= {"Amit","Baban","Rakesh","Vaibhav"};
		int high=name.length-1,low=0,mid;
		String search="Amit";
		
	//System.out.println("\nEnter element you want to search");
	//String search=Utility.stringInput();
	
		while(low<high)
		{
		mid=low+high/2;
			if(name[mid].compareTo(search)==0)
			{
				System.out.println("Name Found");
			}	
			else if(name[mid].compareTo(search)<0)
			{
				low=mid+1;
			}
			else //if(name[mid].compareTo(search)>0)
			{
				high=mid-1;
			}
			
			
		}//while loop close
	
	}

}
