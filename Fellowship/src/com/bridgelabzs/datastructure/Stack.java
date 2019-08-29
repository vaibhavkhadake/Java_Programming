/******************************************************************************
 *  
 *  Purpose: Stack program logic.
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   29-08-2019
 *
 ******************************************************************************/
package com.bridgelabzs.datastructure;

public class Stack 
{
	int[]stack=new int[50];
	int top=0;
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		
		return (top==0);
	}
	/**
	 * 
	 * @param data
	 */
	public void push(int data)
	{
		top++;
		stack[top]=data;
		
	}
	/**
	 * 
	 * @return
	 */
	public int pop()
	{
		int data;
		top--;
		data=stack[top];
		//stack[top]=0;
		return data;
	}
	/**
	 * 
	 * @param ae
	 * @return
	 */
	public boolean check(String ae)
	{
		for(int i=0;i<ae.length();i++)
		{
			char ch=ae.charAt(i);
			if(ch=='(')
				{
				push(i);
				}
			else if(ch==')')
			{
				
				pop();
			}
		}
		return isEmpty();
		
	}
	/**
	 * show stack elements
	 */
	public void display() 
	{
		for(int i:stack)
		{
			System.out.print(i+" ");
		}
		
	}
}
