package com.suresh.ds.sorting.linear;

public class RadixSort {

	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int n = arr.length;
		radixsort(arr, n);
		print(arr, n);
	}

	static void print(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	static void radixsort(int arr[], int n) {
		int m = getMax(arr, n);
		
	}

	static int getMax(int arr[], int n) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
