package com.suresh.ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 5, 3, 6, 7, 5 };
		System.out.println("Before Sorting:");
		insertionSort(arr);
		System.out.println("After Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static void insertionSort(int A[]) {
		int v;
		int j;
		for (int i = 1; i <= A.length - 1; i++) {
			v = A[i];
			j = i;
			while (j >= 1 && A[j - 1] > v) {
				A[j] = A[j - 1];
				j--;
			}
			A[j] = v;
		}
	}
}
