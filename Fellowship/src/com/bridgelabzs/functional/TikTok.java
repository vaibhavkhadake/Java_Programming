package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class TikTok {

	public static void main(String[] args)
	{
		/*int i,j;
		
		int[][]matrix1=new int[3][3];
		int list[] = new int[9];
		int m=1;
		

		System.out.println("matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(m+"  ");
			matrix1[i][j]=m;
			m++;
			}
			System.out.println();
		}
		
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(int k=0;k<list.length;k++)
				{
					if(list[k]==matrix1[i][j])
					{
						matrix1[i][j]=2;
					}
				}
				
				
				
				
				
			}
		
		}
		showing matrices
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
			}
		*/
		
		int flag=0;
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
	
		//display array elements
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				 System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

		
		int sum7=0;
		for(int i=0;i<=2;i++)
		{
			
			for(int j=0;j<=2;j++)
			{
				//addition of matrix diogonals
				if(i==j)
				{
					sum7+=arr[i][j];
				}
				
				
			}
		}
		//addition of matrix row wise
		for(int i=0;i<=2;i++)
		{
			int sum2=0;
			for(int j=0;j<=2;j++)
			{
				sum2=sum2+arr[i][j];
				
			}
			if(sum7==sum2)
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
			
		}
		//addition of matrix column wise
		for(int i=0;i<=2;i++)
		{
			int sum3=0;
			for(int j=0;j<=2;j++)
			{
				sum3=sum3+arr[j][i];
				
			}
			if(sum7==sum3)
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
			
		}
}

}
