package com.bridgelabzs.utility;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabzs.datastructure.Node;
import com.bridgelabzs.datastructure.QueueLinkedList;
import com.bridgelabzs.datastructure.StackLinkedList;
/******************************************************************************
 *  
 *  Purpose: It is a utility class where we written all progams logic.
 *
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/



public class Utility {

	/**
	 * Taking values from user
	 */
	static Scanner scanner =  new Scanner(System.in);
	/**
	 * 
	 * @return integer value
	 */
	public static int integerInput()
	{
		int integerValue = scanner.nextInt();
		return integerValue;
	}
	/**
	 * @return double value
	 */
	public static double doubleInput()
	{
		double doubleValue= scanner.nextDouble();
		return doubleValue;
	}
	public static long longInput()
	{
		long longValue=scanner.nextLong();
		return longValue;
	}
	/**
	 * 
	 * @return stringvalue
	 */
	public static String stringInput() 
	{
		String stringValue=scanner.nextLine();
		return stringValue;
		
	}
	/**
	 * 
	 * @param newString
	 */
	public static void inputString(String newString) 
	{
		String input="“Hello <<UserName>>, How are you?”";
		String replaceString=input.replace( "<<UserName>>", newString);
		System.out.println(input);
		System.out.println(replaceString);	
	}
	
	/**
	 * 
	 * @param coin
	 */
	public static void coin(int coin) {
		int head=0,tail=0;
		for(int i=1;i<=coin;i++)
		{
			if(Math.random()<0.5)
			{
				head++;
			}		
			else
			{
				tail++;
			}
		}
		System.out.println("Head="+head);
		System.out.println("tail="+tail);
		
		//calculate percentage
		double headPercentage=(head*100)/coin;
		double tailPercentage=(tail*100)/coin;
		System.out.println("headPercentage= "+headPercentage);
		System.out.println("tailPercentage= "+tailPercentage);
		
	}
	/**
	 * 
	 * @param year
	 */
	public static void leapYear(int year) 
	{
		if(year>=1582)
		{
			if(year%400==0)
				System.out.println("Leap year");		
			else if(year%100==0)
				System.out.println("Not a Leap year");
			else if(year%4==0)
				System.out.println("Leap year");
			else
				System.out.println("Not a Leap year");
		}
		else
			System.out.println("Plese enter valid year");
		}
	/**
	 * 
	 * @param number
	 */

	public static void power(int number)
	{
		for(int i=1;i<=number;i++)
		{
		int power=(int)Math.pow(i, 2);
		System.out.println(power);
		}	
	}
	/**
	 * 
	 * @param harmonic number
	 */
	public static void harmonic(int number) 
	{
		double harmonicNumber=1;
		for(double i=2;i<=number;i++)
		{
			harmonicNumber=harmonicNumber+(1/i);	
		}
		System.out.println("Sum of harmonic series "+harmonicNumber);
	}
	/**
	 * 
	 * @param number
	 */
	public static void prime_fact(int number) 
	{
		for(int i = 2; i*i<= number; i++)
		{
	         while(number%i == 0) 
	         {
	            System.out.print(i+" * ");
	            number = number/i;
	         }
	     }
	      if(number >2) 
	         System.out.println(number);
	}
	/**
	 * 
	 * @param stake
	 * @param goal
	 * @param trails
	 */
	public static void gamling(double stake, double goal, double trails)
	{
		int bets=0,wins=0;
		for(int i=0;i<trails;i++)
		{
		double cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;// win $1
				else
					cash--;//for loss $1
				if (cash == goal)
					wins++;
			}//while loop end
		}//for loop end
		System.out.println("Numbers of win= "+wins+" out of "+trails);
		System.out.println("Percentage of win ratio= "+wins*100/trails);
		System.out.println("average of bets= "+(1*bets/trails));
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int getCoupan(int n)
	{
		
		return (int)(Math.random()*n);
	}
	/**
	 * 
	 * @param number
	 */
	public static void compute(int number)
	{
		boolean[] collect = new boolean[number];
		int count = 0;
		int distinct = 0;
		
		while(distinct<number)
		{
			int value = getCoupan(number);
			count++;
			if(!collect[value])
				distinct++;
			collect[value]=true;
		}
		System.out.println(distinct);
		System.out.println(count);
		
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void quadratic(double a, double b, double c)
	{
		double delta=b*b-4*a*c;
		 System.out.println("Delta ="+delta); 
		 double root1,root2;
		 if(delta>0)
		 {
		  root1=(-b+ Math.sqrt(delta))/(2*a);
		  System.out.println("Root 1 ="+root1);
		  
		  root2=(-b- Math.sqrt(delta))/(2*a);
		  System.out.println("Root 2 ="+root2);;
		 }
		 else if(delta==0)
		 {
			 root1=-b/(2*a);
			 System.out.println("Root 1 ="+root1);
			
			 root2=-b/(2*a);
			 System.out.println("Root 2 ="+root2);;
		 }
		 // if delta<0 
		 else
		 {
			 double realPart = -b / (2 *a);
	         double imaginaryPart = Math.sqrt(-delta) / (2 * a);
	         
	         System.out.println("realPart="+realPart+"\n ImaginaryPart"+imaginaryPart);   
		 }
	}
	/**
	 * 
	 * @param temperature
	 * @param wind_speed
	 */
	public void windchil(double temperature, double wind_speed)
	{
		System.out.println("Temperature"+temperature);
		System.out.println("Wind speed"+wind_speed);
		double wind_chill = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(wind_speed, 0.16);
		System.out.println("Wind_Chill"+wind_chill);
		
	}
	/**
	 * 
	 * @param string1
	 * @param string2
	 * @return 
	 */
	
	public static boolean anagram(String string1, String string2) 
	{
		// convert string to character
		char[] ch1=string1.toLowerCase().toCharArray(); 
		char[] ch2=string2.toLowerCase().toCharArray(); 
		boolean anagram = true;  
		//sort the elements 
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//compare elements
		anagram=Arrays.equals(ch1, ch2); 
		
		if(anagram)
		{
			System.out.println("String is anagrams");
		}
		else
		{
			System.out.println("String is not anagrams");
		}
		return anagram;
		
	}
	/**
	 * Extended prime number to check number is palindrom or not.
	 * @param number
	 * @return
	 */
	public static boolean palindrom(int number) {
		int temp=number;
		int add=0;
		int reminder;
		while(number>=2)
		{
			reminder=number%10;
			add=(add*10)+reminder;
			number=number/10;
		} 
		if(temp==add)
			System.out.println("Palindom");
		else
			System.out.println("Not Palindrom");	
		return false;	
	}
	/**
	 * 
	 * @param arr
	 * @param number
	 */
	public static void distinctTriplet(int[] arr, int number) 
	{
		int i,j,k;
		int count = 0;
		
		for(i=0;i<number;i++)
		{
			for(j=i+1;j<number;j++)
			{
				for(k=0;k<number;k++)
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
					}
				}//k loop close
			}// j loop close
		}// i loop close
		System.out.println(count);
	}
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public static void dayWeek(int day, int month, int year) 
	{
		int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int date = (day + x + (31*m)/12) % 7;
       if(date==0)
       {
    	   System.out.println("Day is Sunday");  
       }
       else if(date==1)
       {
    	   System.out.println("Day is Monday");   
       }
       else if(date==2)
       {
    	   System.out.println("Day is Tuesday");
       }
       else if(date==3)
       {
    	   System.out.println("Day is Wednesday");   
       }
       else if(date==4)
       {
    	   System.out.println("Day is Thirsday");   
       }
       else if(date==5)
       {
    	   System.out.println("Day is Friday"); 
       }
       else if(date==6)
       {
    	   System.out.println("Day is Saturday"); 
       }      
	}
	/**
	 * 
	 * @param fahrenheit
	 * @param celsius
	 */
	public static void temperature(double fahrenheit, double celsius)
	{

		//calculate Fahrenheit to Celsius
		celsius = (fahrenheit- 32)*(5/9);
		System.out.println("Celsius  "+celsius);
		
		//calculate  Celsius to Fahrenheit 
		fahrenheit = (celsius*9/5)  + 32;
		System.out.println("Fahrenheit "+fahrenheit);
	}
	/**
	 * 
	 * @param amount
	 * @param rate_of_interest
	 * @param period
	 */
	public static void compound_interest(double amount, double rate_of_interest, double period) {
		
		double total=amount*Math.pow((1+rate_of_interest/100),period);
		System.out.println("total amount "+total);
	}
	/**
	 * 
	 * @param amount
	 */
	public static void calculation(int amount) 
	{
		int note1=0,note2=0,note5=0,note10=0,note50=0,note100=0,note500=0,note2000=0;
		int result=0;
		int count=0;
		while(amount!=0)
		{
			if(amount>=2000)
			{
				note2000++;
				count++;
				amount=amount-2000;
				result=result+2000;
			}
			else if(amount<2000&&amount>=500)	
			{
				note500++;
				count++;
				amount=amount-500;
				result=result+500;
			}
			else if(amount<500&&amount>=100)	
			{
				note100++;
				count++;
				amount=amount-100;
				result=result+100;
			}
			else if(amount<100&&amount>=50)	
			{
				note50++;
				count++;
				amount=amount-50;
				result=result+50;
			}
			else if(amount<50&&amount>=10)	
			{
				note10++;
				count++;
				amount=amount-10;
				result=result+10;
			}else if(amount<10&&amount>=5)	
			{
				note5++;
				count++;
				amount=amount-5;
				result=result+5;
			}
			else if(amount<5&&amount>=2)	
			{
				note2++;
				count++;
				amount=amount-2;
				result=result+2;
			}
			else if(amount<2&&amount>=1)	
			{
				note1++;
				count++;
				amount=amount-1;
				result=result+1;
			}
		}//while loop close
		System.out.println("2000 note	"+note2000);
		System.out.println("500 note	"+note500);
		System.out.println("100 note	"+note100);
		System.out.println("50 note		"+note50);
		System.out.println("10 note		"+note10);
		System.out.println("5 coin		"+note5);
		System.out.println("2 coin		"+note2);
		System.out.println("1 coin		"+note1);
		System.out.println("Total number of notes "+count);
		
	}
	/**
	 * 
	 * @param s
	 */
	public static void bubbleString(String[] s) 
	{
		String temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[j].compareTo(s[i])<0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			System.out.print(s[i]+" ");
		}
	}
	/**
	 * 
	 * @param number
	 */
	public static void bubbleInteger(int[] number)
	{
		int temp=0;
		for(int i=0;i<number.length;i++)
		{
			for(int j=1;j<(number.length-i);j++)
			{
				if(number[j-1]>number[j])
				{
					temp=number[j-1];
					number[j-1]=number[j];
					number[j]=temp;
				}
			}
		}
		//print the sorted elements.
		for(int i=0;i<number.length;i++)
		{
		System.out.print(number[i]+" ");
		}
		
	}
	/**
	 * 
	 * @param number
	 */
	public static void insertionInteger(int[] number)
	{
		for (int j=1;j<number.length;j++)
		{
			int key=number[j];
			int i=j-1;
			while((i>=0)&&(number[i]>key))
			{
				number[i+1]=number[i];
				i--;
			}
			number[i+1]=key;
		}//for loop close
		//sorted array
			for(int i:number)
			{
				System.out.print(i+" ");
			}
		
	}
	/**
	 * 
	 * @param names
	 */
	public static void insetionString(String[] names)
	{
		for (int j=1;j<names.length;j++)
		{
			String key=names[j];
			int i=j-1;
			while(i>=0&&(names[i].compareTo(key))>0)
			{
				names[i+1]=names[i];
				i--;
			}
			names[i+1]=key;
		}//for loop close
			//sorted array
			for(String i:names)
			{
				System.out.print(i+" ");
			}	
	}
/******************************************************************************************************************	
	/**
	 * Anagram detecton here we compare two string
	 * @param first
	 * @param second
	 * @return
	 */
	public static boolean anagramDetection2(String first, String second) 
	{
		first = first.toLowerCase();
		second = second.toLowerCase();
		
		char firstArray[] = first.toCharArray();
		char secondArray[] = second.toCharArray();
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		boolean status = false;
		
		if(firstArray.length!=secondArray.length)
		{
			
			status = false;
		}
		else
		{
			
			if(Arrays.equals(firstArray,secondArray))
			{
				status = true;
			}
		}
		
		return status;
		
	}
/*****	*************************************************************************************************************************
	/**
	 * In this program we find prime number and also check number is anagram or not.
	 */
	public static void anagramDetection()
	{
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
	
		
		for(int k=0;k<str.length-1;k++)
		{
			for(int l=k+1;l<str.length;l++)
			{
				flag=Utility.anagramDetection2(str[k], str[l]);
				if(flag==true)
				{
					s1[k][l]=str[k]+" "+str[l];
					System.out.println(s1[k][l]);		
				}
			}
		}
	}	
/*****************************************************************************************************/
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
/***************************************************************************************************/
	public static QueueLinkedList anagramToQueue()
	{
	QueueLinkedList queue = new QueueLinkedList();
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
	//String[][] s2=new String[1000-arr.length][1000-arr.length];

	for(int k = 0;k<str.length-1;k++)
	{
	for(int l=k+1;l<str.length;l++)
	{
	flag=Utility.anagramDetection2(str[k], str[l]);


	if(flag==true)
	{
	s1[k][l]=str[k]+" "+str[l];
	//System.out.println(s1[k][l]);
	queue.enqueue(s1[k][l]);
	}

	}
	}
	return queue;
	//stack.viewStack();


	}	
	
	public static void writeObjectToJson(List list, String fileName)
	{
	Object[] array = list.toArray();

	ObjectMapper mapper = new ObjectMapper();
	try
		{
		mapper.writeValue(new File(fileName), array);
		}
	catch(Exception e) {
	e.printStackTrace();
	}
	}
}
