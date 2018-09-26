package com.suresh.ds.sorting.linear;

public class CountingSortGeeks {

	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 1, 2, 3, 2, 3, 3, 1, 4, 1, 1, 1, 1, 1, 1, 0 };
		int k = 5;
		countingSort(A, k);
	}

	static void countingSort(int A[], int k) {
		int n = A.length;

		int output[] = new int[n];
		int count[] = new int[k];

		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}

		for (int i = 0; i < A.length; i++) {
			++count[A[i]];
		}

		/*
		 * for (int i = 0; i < count.length; i++) {
		 * System.out.println(count[i]); }
		 */

		for (int i = 1; i <= count.length - 1; ++i)
			count[i] += count[i - 1];

		for (int i = 0; i < A.length; i++) {
			output[count[A[i]] - 1] = A[i];
			--count[A[i]];
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}
