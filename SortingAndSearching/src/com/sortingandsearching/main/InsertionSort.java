package com.sortingandsearching.main;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		  int[] arr = {4, 7, 2, 5, 6, 9, 1, 3, 8};
	        insertionSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }

	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	}







