package com.bridgelabzs.functional;

public class Permutation {

	public static void main(String[] args)
	{
			String s="ACBDE";
			per(s.toCharArray(),0);
	}

		private static void swap(char[] ch,int i,int j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		private static void per(char[] ch, int index)
		{
			if(index==ch.length-1)
			{
				System.out.println(ch);
			}
			for(int i=index;i<ch.length;i++)
			{
				swap(ch,index,i);
				per(ch,index+1);
				swap(ch,index,i);
				
			}
			

	}

}
