package com.bridgelabzs.algorithm;

public class MergeSort
{
	 void merge(int []array1,int low,int mid,int high)
	{
	 
	int[] array2=new int[20];
	int i=low;
	int j=mid+1;
	int k=low;
	
	while(i<=mid && j<=high)
	{
		if(array1[i]<=array1[j])
		{
			array2[k]=array1[i];
			i++;
		}
		else
		{
			array2[k]=array1[j];
			j++;
		}
		k++;
	}
	if(i>mid)
	{
		while(j<=high)
		{
			array2[k]=array1[j];
			j++;
			k++;
		}
	}
	else
	{
		while(i<=mid)
		{
			array2[k]=array1[i];
			i++;
			k++;
		}
	}
}
	 void sort(int[] array1,int low,int high)
	 {
		 if(low<high)
		 {
		 int mid=low+high/2;
		 sort(array1, low, mid);
		 sort(array1, mid+1, high);
		 merge(array1, low, mid, high);
		 }
		 
	 }
	 
	public static void main(String[] args)
	{
		 int[] array1= {5,6,8,9,1,2,10,15,25,7};
		 int low=0;
		 int high=array1.length-1;
		 MergeSort ms=new MergeSort();
		 ms.sort(array1, low, high);
		 
		 for(int i=0;i<array1.length;i++)
		 {
			 System.out.println(array1[i]+" ");
		 }
		
		

	}

}
