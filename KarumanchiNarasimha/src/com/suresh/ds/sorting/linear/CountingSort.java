package com.suresh.ds.sorting.linear;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int K = 5;
		int A[] = { 2, 3, 4, 1, 2, 3, 2, 3, 3, 1, 4, 1, 1, 1, 1, 1, 1, 0 };
		int length = A.length;
		int B[] = new int[length];
		countingSort(A, B, K);
	}

	static void countingSort(int A[], int B[], int K) {

		int C[] = new int[K], n = A.length;
		for (int i = 0; i < K; i++) {
			System.out.println(C[i]);
		}

		for (int i = 0; i < n; i++) {
			C[A[i]] = C[A[i]] + 1;
		}
		/*
		 * System.out.println("After:"); int win = C[0]; int candidate = 0; int
		 * i; for (i = 0; i < K; i++) { if (C[i] > win) { win = C[i]; candidate
		 * = i; System.out.println("Candidate:" + candidate); } }
		 * System.out.println("Candidate: " + candidate + " Wins with " + win +
		 * " Votes");
		 */
		System.out.println("After:");
		for (int i = 0; i < K; i++) {
			System.out.println(C[i]);
		}
		// 1, 8, 3, 4, 2
		// int A[] = { 2, 3, 4, 1, 2, 3, 2, 3, 3, 1, 4, 1, 1, 1, 1, 1, 1, 0 };

		for (int i = 1; i <= C.length - 1; i++) {
			C[i] += C[i - 1];
		}
		System.out.println("Sorting:");
		for (int i = 0; i < n; i++) {
			B[C[A[i]] - 1] = A[i];
			--C[A[i]];

		}

		System.out.println("After Sorting:");
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
		
		Arrays.fill(C, 0);

		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}
	}
}
