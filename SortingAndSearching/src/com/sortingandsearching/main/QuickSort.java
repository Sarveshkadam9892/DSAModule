package com.sortingandsearching.main;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort obj=new QuickSort();
		int arr[]= {10 , 8, 6 ,12,6,15,3 ,9 ,5 ,20};
		System.out.println("Unsorted Array : ");
		obj.PrintArray( arr);
		System.out.println();
		obj.QuickSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array : ");
		obj.PrintArray( arr);

	}
	public int partition(int arr[],int lb,int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end= ub;
		
		while(start < end) {
			while(arr[start]<=pivot)
			{start++;
		}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<end) {
				swap(arr,start,end);
			}
	}
		swap(arr,lb , end);
		return end;
}
	void swap(int arr[],int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	void QuickSort(int arr[],int lb,int ub) {
		if(lb<ub) {
			int lock =partition(arr,lb,ub);
			QuickSort(arr,lb,lock-1);
			QuickSort(arr,lock+1,ub);
		}
	}	
	
	void PrintArray(int arr[]) {
		for(int i=0 ;i<arr.length;i++)
		System.out.print(arr[i] + " ");
	}
}