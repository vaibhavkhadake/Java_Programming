package com.bridgelabzs.algorithm;

import java.util.Scanner;

public class MergeSort2 {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
			System.out.print("Enter the length of list :");
			int N = sc.nextInt();
			int list[] = new int[N];
			
			//user input element
			
			System.out.print("Enter the element of list :");
			for(int i=0;i<N;i++)
				list[i] = sc.nextInt();
				
			Merge_Sort(list,0,N-1);
			System.out.println("Sorted List"); 	
			int n = list.length;
			for(int i=0; i<n; i++)
				
		    System.out.print(list[i] + " "); 
		    
				
			sc.close();
					
			}
			
		static void Merge_Sort(int list[], int start, int End) 
		    { 
		    if (start < End) 
		    {
		    	int mid = (start+End)/2; 
		  
		        Merge_Sort(list, start, mid); 
		        Merge_Sort(list , mid+1, End); 
		  
		        merge(list, start, mid, End); 
		        } 
		    } 
			
			
		static void merge(int list[], int start, int mid, int End) 
		    {
			int n1 = mid - start + 1; 
		    int n2 = End - mid; 
		  
		    int L[] = new int [n1]; 
		    int R[] = new int [n2]; 
		  
		    for (int i=0; i<n1; i++) 
		    	L[i] = list[start + i]; 
		        for (int j=0; j<n2; j++) 
		            R[j] = list[mid + 1+ j];
		        int i = 0, j = 0; 
		  
		        int k = start; 
		        while (i < n1 && j < n2) 
		        { 
		            if (L[i] <= R[j]) 
		            { 
		            	list[k] = L[i]; 
		                i++; 
		            } 
		            else
		            { 
		            	list[k] = R[j]; 
		                j++; 
		            } 
		            k++; 
		        } 
		  
		        while (i < n1) 
		        { 
		        	list[k] = L[i]; 
		            i++; 
		            k++; 
		        } 
		  
		        while (j < n2) 
		        { 
		        	list[k] = R[j]; 
		            j++; 
		            k++; 
		        } 			
		       
		    }

		}



