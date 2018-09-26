package com.suresh.ds.sorting.puzzles;

import java.util.Scanner;

import com.suresh.ds.sorting.BubbleSorting;

public class ABK {

	public static void main(String[] args) {
		int A[] = { 6, 2, 4, 7, 8, 5 };
		int B[] = { 1, 3, 2, 6, 4, 9 };
		int n = A.length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element:");
		int k = scan.nextInt();

		boolean result = find(A, B, n, k);
		System.out.println("Resule:" + result);
		scan.close();
	}

	static boolean find(int A[], int B[], int n, int k) {
		int c;
		BubbleSorting.bubbleSortEnhanced(A, n);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		for (int i = 0; i < A.length; i++) {
			c = k - B[i];
			boolean search = search(A, c);
			if (search) {
				return true;
			}
		}
		return false;
	}

	static boolean search(int A[], int c) {

		for (int i = 0; i < A.length; i++) {
			if (A[i] == c) {
				return true;
			}
		}
		return false;
	}
}
