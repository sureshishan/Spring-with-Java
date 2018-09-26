package com.suresh.ds.sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 5 };
		int n = arr.length;
		bubbleSortEnhanced(arr, n);
		System.out.println("Sorted list:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSortEnhanced(int A[], int n) {
		boolean swapped = true;
		for (int pass = n - 1; pass >= 0 && swapped; pass--) {
			swapped = false;
			for (int i = 0; i <= pass - 1; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					swapped = true;
				}
			}
		}
	}
}
