package com.bridgelabzs.algorithm;

import java.util.Scanner;

public class demo
{
	long start = 0;
	long stop = 0;
	long colaps = 0;
	
	public void starting()
	{
		start = System.currentTimeMillis();
		System.out.println("Start Time : "+start);
	}
	
	public void stopping()
	{
		stop = System.currentTimeMillis();
		System.out.println("Stop Time : "+stop);
	}
	
	public long timer()
	{
		colaps = stop-start;
		return colaps;
	}
	public static void main(String args[])
	{
		demo sw = new demo();
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1 to start time :");
		s.nextInt();
		sw.starting();
		
		System.out.println("Press 2 to stop time :");
		s.nextInt();
		sw.stopping();
		
		long et = sw.timer();
		System.out.println("Time :" +et+ "msec" );
		System.out.println("Time in seconds : "+(et/1000)+ "sec");
		
	}

}