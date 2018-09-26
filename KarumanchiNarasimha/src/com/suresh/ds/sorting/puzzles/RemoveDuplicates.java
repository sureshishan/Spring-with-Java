package com.suresh.ds.sorting.puzzles;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7 };
		int result = removeDuplicates(arr);
		System.out.println("Final Result:" + result);
		for (int i = 0; i < result; i++) {
			System.out.println(arr[i]);
		}
		
		List<Integer> list = new ArrayList<>();
	}

	static int removeDuplicates(int A[]) {

		int len = A.length;
		int j = 0;
		if (len <= 1) {
			return len;
		}
		for (int i = 0; i < len - 1; i++) {
			if (A[i] != A[i + 1]) {
				A[j++] = A[i];
			}
		}
		A[j++] = A[len - 1];
		return j;
	}
}
