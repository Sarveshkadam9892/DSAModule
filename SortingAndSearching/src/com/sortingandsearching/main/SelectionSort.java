package com.sortingandsearching.main;

public class SelectionSort {

			public static void main(String[] args) {
				int arr[]={26,54, 93, 17, 77, 31, 44 ,55, 20};
				SelectionSort obj=new SelectionSort();
				System.out.println("Unsoreted Array : ");
				obj.print(arr);
				System.out.println();
				obj.sort(arr);
				System.out.println("Soreted Array : ");
				obj.print(arr);

			}
			void print(int arr[]) {
				for(int i=0;i<arr.length;i++)
				System.out.print(arr[i] + " ");
				System.out.println();
			
			}
			void sort(int arr[]) {
				int n = arr.length;
				for(int i=0;i<n-1;i++) {
					int smallest=i;
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[smallest]) 
						smallest =j;
					
				}
				int temp = arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
				}
			}
		}