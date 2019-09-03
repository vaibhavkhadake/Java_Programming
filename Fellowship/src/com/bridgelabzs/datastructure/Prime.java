package com.bridgelabzs.datastructure;

public class Prime 
{
	public static boolean prime(int number)
	{
		int j,count=0;
			for(j=1;j<=number;j++)
			{
				if(number%j==0)
					count++;
			}
			if(count==2)
				return true;
			else
				return false;
	}
}
