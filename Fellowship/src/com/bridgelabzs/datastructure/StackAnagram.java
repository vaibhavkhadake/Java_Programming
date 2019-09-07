package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class StackAnagram 
{
	public static StackLinkedList anagramToStack()
	{
		StackLinkedList stack = new StackLinkedList();
		String arr1[][] = new String[10][30];
		int y = 0;

		int[] arr = new int[170];

		for (int i = 1; i <= 1000; i++) {
			boolean flag = true;

			for (int j = 2; j < i - 1; j++) {
				
				if (i % j == 0) 
				{
					flag = false;
					break;
				}
			}
			if (flag == true) {
				arr[y] = i;
				y++;
			}
			
		}
		
	
		int[] a= new int[170];
		
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
		}
		

		
		StringBuffer sb= new StringBuffer(arr.length);
		
		String s=" ";
		
		for(int i=0;i<arr.length;i++)
		{
			s=sb.append(a[i]+" ").toString();
		}
		
		String[] str=s.split(" ");
		
		
		boolean flag=true;
		String[][] s1=new String[arr.length][arr.length];
		//String[][] s2=new String[1000-arr.length][1000-arr.length]
		
		for(int k = 0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				flag=Utility.anagramDetection2(str[k], str[l]);
			
			
				if(flag==true)
				{
					s1[k][l]=str[k]+" "+str[l];
					//System.out.println(s1[k][l]);
					stack.push(s1[k][l]);	
				}
			
			}
		}
		

		return stack;
		//stack.viewStack();
		
		
	}
}
