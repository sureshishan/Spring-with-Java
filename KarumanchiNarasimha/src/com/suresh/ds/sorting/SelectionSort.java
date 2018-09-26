package com.suresh.ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 2, 6, 45, 67, 2, 1 };

		System.out.println("before sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		selectionSort(arr);
		System.out.println("after sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	static void selectionSort(int arr[]) {

		int min;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp;
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
