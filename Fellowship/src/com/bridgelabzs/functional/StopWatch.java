/******************************************************************************
 *  
 *  Purpose: Simulate Stopwatch Program.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   23-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.functional;

import com.bridgelabzs.utility.Utility;

public class StopWatch 
{

	 long start = 0;
	 long stop = 0;
	 long elaps = 0;
			
	public void start()
	{
		start = System.currentTimeMillis();
		System.out.println("Start Time "+start);
	}
	
	public void stop()
	{
		stop = System.currentTimeMillis();
		System.out.println("Stop Time  "+stop);
	}
	
	public void elapse()
	{
	 elaps=stop-start;
	 System.out.println("Time in msecond "+elaps);
	 System.out.println("Time in second  "+elaps/1000);
	}
	
	
	public static void main(String[] args)
			{
				StopWatch sw=new StopWatch();
				System.out.println("Press any numeric key to start time ");
				Utility.integerInput();
				sw.start();
				System.out.println("Press any numeric key to stop time ");
				Utility.integerInput();
				sw.stop();
				sw.elapse();
			}
}
