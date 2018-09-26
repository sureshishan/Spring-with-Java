package com.suresh.ds.sorting;

public class FindNumberOccursMaxTimes {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 1, 6, 4, 6, 2, 4, 3, 5, 4, 4, 4, 4, 4, 7 };
		int number = findNumberOmaxTimes(arr);
		System.out.println("\nNumber:" + number);
	}

	static int findNumberOmaxTimes(int A[]) {
		int n = A.length;
		BubbleSorting.bubbleSortEnhanced(A, n);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		int whoWins = SortFindWhoWins.findWhoWins(A);
		return whoWins;
	}

}
