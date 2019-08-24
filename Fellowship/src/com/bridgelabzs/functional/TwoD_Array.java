/******************************************************************************
 *  
 *  Purpose: To take M rows, N Cols, and M * N inputs for 2D Array.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class TwoD_Array {

	public static void main(String[] args)
	{
		int i=0,j=0;
		int[][]matrix1=new int[3][3];
		int[][]matrix2=new int[3][3];
		int[][]multiplication=new int[3][3];
		String m;
		
		System.out.println("\n enter elements for first matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			m=Utility.stringInput();
			matrix1[i][j]=Integer.parseInt(m);
			}
		}
		
		System.out.println("\n enter elements for Second matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			m=Utility.stringInput();
			matrix2[i][j]=Integer.parseInt(m);
			}
		}
		System.out.println("\nMatrix Multipication");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			multiplication[i][j]=matrix1[i][j]*matrix2[i][j];
			System.out.println(multiplication[i][j]);
			}
		}
		
	}

}
