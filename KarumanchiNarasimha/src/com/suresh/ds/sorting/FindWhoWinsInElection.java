package com.suresh.ds.sorting;

public class FindWhoWinsInElection {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 7, 5, 6, 8, 2, 2, 3, 1, 1, 1, 1, 1 };
		int result = findWhoWins(arr);
		System.out.println("Who wins?:" + result);
	}

	static int findWhoWins(int A[]) {
		int candidate = A[0], counter, maxCounter = 0;

		for (int i = 0; i < A.length - 1; i++) {
			candidate = A[i];
			counter = 0;
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]) {
					counter++;
				}
			}
			if (counter > maxCounter) {
				maxCounter = counter;
				candidate = A[i];
			}
		}
		return candidate;
	}
}
