package com.bridgelabzs.algorithm;

import com.bridgelabzs.utility.Utility;

public class Triplet {

	public static void main(String[] args) {
int arr[] = new int[10];
		
		System.out.print("Enter the length of value  N =");
		int N= Utility.integerInput();
		
		System.out.print("Enter The integers :");
		for(int i=0; i< N;i++)
		{
			arr[i]=Utility.integerInput();
		}
		
		for(int i=0;i<N-2; i++)
			for(int j=0;j<N-1;j++)
				for(int k=0;k<N;k++)
				{
					if(arr[i] + arr[j] +arr[k] ==0) 
					{
						System.out.println("Triplets:");
						System.out.println(+arr[i]+" "+ arr[j]+" "+arr[k]);
					}
				}

	}

}
