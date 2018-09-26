package com.suresh.ds.sorting;

public class CheckDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 4, 45, 3, 67, 78, 67 };
		System.out
				.println("Duplicates Exist:" + checkIfThereAreDuplicates(arr));
	}

	static boolean checkIfThereAreDuplicates(int A[]) {
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]) {
					return true;
				}
			}

		}
		return false;
	}
}
