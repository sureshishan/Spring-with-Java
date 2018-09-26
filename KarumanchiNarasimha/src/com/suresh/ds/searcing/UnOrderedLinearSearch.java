package com.suresh.ds.searcing;

import java.util.Scanner;

public class UnOrderedLinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int arr[] = { 3, 4, 1, 5, 78, 67, 3, 6 };
		int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
		System.out.println("Enter the element to search:");
		int data = scan.nextInt();
		int result = unOrderedSearch(arr, data);
		System.out.println("Element found:" + result);
		scan.close();
	}

	public static int unOrderedSearch(int A[], int data) {

		for (int i = 0; i < A.length; i++) {
			if (A[i] == data) {
				return 1;
			} else if (A[i] > data) {
				return -1;
			}
		}
		return -1;
	}
}
