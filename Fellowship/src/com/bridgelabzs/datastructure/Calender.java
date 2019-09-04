/******************************************************************************
 *  
 *  Purpose: Write a program Calendar.java that takes the month and year.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class Calender
{
	static int[] demo=new int[10];

	static int[][] calender=new int[5][7];
	static int[] month= { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	 public static void init()
	 {
		 for(int i=0;i<calender.length;i++)
		 {
			 for(int j=0;j<calender[i].length;j++)
			 {
				 calender[i][j]=-10;
			 }
		 }
	 }
	 
	 public static void display(int m)
	 {
		 System.out.println("\nSun 	Mon 	Tus 	Wed 	Thir 	Fri 	Sat ");
		 for(int i=0;i<calender.length;i++)
		 {
			 for(int j=0;j<calender[i].length;j++)
			 {
				 if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) 
				 {
					 System.out.print("\t");
				 }
				 else if(calender[i][j]>0)
				 {
					 System.out.print(calender[i][j]+"\t" );
				 }
			 }
			 System.out.println();
		 }
	 }
	 public static void putCalender(int d)
	 {
		 int d1 = 1;
			for (int i = d; i < calender[0].length; i++)
			{
				calender[0][i] = d1++;
			}
			for (int i = 1; i < calender.length; i++) 
			{
				for (int j = 0; j < calender[i].length; j++)
				{
					calender[i][j] = d1++;
				}
			}
	 }
	public static  void displayCalender(int m,int y)
	 {
		 	int d = dayOfWeek(m, y);
			init();
			putCalender(d);
			display(m);
	 }
	public static int  dayOfWeek(int m, int y)
	 	{
			int d = 1;
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}
	 
	public static void main(String[] args) 
	{
		System.out.println("enter month");
		int m =Utility.integerInput();
		System.out.println("enter year");
		int y = Utility.integerInput();
		displayCalender(m, y);
		
	}
}
