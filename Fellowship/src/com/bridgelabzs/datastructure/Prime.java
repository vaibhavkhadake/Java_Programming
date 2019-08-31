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
/***
*
				if(array1[j][l]>1 && array1[j][l]<100)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>100 && array1[j][l]<200)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>200 && array1[j][l]<300)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>400 && array1[j][l]<500)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>500 && array1[j][l]<600)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>600 && array1[j][l]<700)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>700 && array1[j][l]<800)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>800 && array1[j][l]<900)
					System.out.print(array1[j][l]+" ");
				else if(array1[j][l]>900 && array1[j][l]<1000)
					System.out.print(array1[j][l]+" ");
*/