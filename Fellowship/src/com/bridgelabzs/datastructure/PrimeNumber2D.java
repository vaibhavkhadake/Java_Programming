package com.bridgelabzs.datastructure;

public class PrimeNumber2D 
{
	
	
	public static void main (String [] args)
	{
		if(Prime.prime(1000))
		{
			
		}

		int[][] range =new int[10][30];
		

	int array[]=new int[168];
		int k=1;
		int i=0;
		int n=1;
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
		for(int j=0;j<10;j++)
		{
			for(int l=0;l<20;l++)
			{
				System.out.print(array1[j][l]+"\t");
			}
			System.out.println("\n");
		}
	}
		
}
