package com.bridgelabzs.functional;

public class MergeSort 
{	
	int[] arr;
	int[] tempArr;
	int length;
	
	public void input(int[] newArr)
	{
		this.arr=newArr;
		this.length=newArr.length;
		this.tempArr=new int[length];
		divide(0,length-1);
	}
	public void divide(int low,int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			
			divide(low,mid);
			divide(mid+1,high);
			
			
			mergeSort(low,mid,high);	
		}
		
	}
	
	public void mergeSort(int low, int mid, int high)
	{
		for(int i=low;i<=high;i++)
		{
			tempArr[i]=arr[i];
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid && j<=high)
		{
			if(tempArr[i]<=tempArr[j])
			{
				arr[i]=tempArr[i];
				i++;
			}
			else
			{
				arr[k]=tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			arr[k]=tempArr[i];
			k++;
			i++;
		}
		
	}
	public static void main(String[] args) 
	
	{
		int[] a= {10,45,15,78,91,4,7};
		MergeSort m=new MergeSort();
		m.input(a);
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	}

}
