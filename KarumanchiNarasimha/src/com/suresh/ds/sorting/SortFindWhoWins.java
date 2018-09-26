package com.suresh.ds.sorting;

public class SortFindWhoWins {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3,
				3, 3, 3, 3, 3 };
		int result = findWhoWins(arr);
		System.out.println("Who wins?:" + result);
	}

	static int findWhoWins(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		int currentCandidate, maxCandidate;
		int currentCounter = 0, maxCounter = 0;
		currentCandidate = maxCandidate = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] == currentCandidate) {
				currentCounter++;
			} else {
				currentCandidate = A[i];
				currentCounter = 1;
			}

			if (currentCounter > maxCounter) {
				maxCounter = currentCounter;
				maxCandidate = currentCandidate;
			}
		}

		return maxCandidate;
	}
}
