package com.suresh.ds.sorting;

public class FindDuplicatesWithSorting {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean result = findDuplicates(arr);
		System.out.println("Duplicates found:" + result);
	}

	static boolean findDuplicates(int A[]) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == A[i + 1]) {
				return true;
			}
		}
		return false;
	}
}
