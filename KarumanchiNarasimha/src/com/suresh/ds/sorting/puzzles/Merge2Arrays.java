package com.suresh.ds.sorting.puzzles;

public class Merge2Arrays {

	public static void main(String[] args) {
		int A[] = { 3, 5, 9 };
		int B[] = { 1, 2, 4, 6, 7, 8, 10 };
		int n1 = A.length;
		int n2 = B.length;
		int C[] = new int[n1 + n2];
		merge(A, B, C, n1, n2);

	}

	static void merge(int A[], int B[], int C[], int n1, int n2) {

		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (A[i] < B[j]) {
				C[k++] = A[i++];
			} else {
				C[k++] = B[j++];
			}

		}
		while (i < n1) {
			C[k++] = A[i++];
		}
		while (j < n2) {
			C[k++] = B[j++];
		}
		for (int l = 0; l < C.length; l++) {
			System.out.println(C[l]);
		}

	}
}
