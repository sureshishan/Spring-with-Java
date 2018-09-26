package arraysutil;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Integer[] a = { 10, 2, 15, 6, 9 };

		System.out.println("Before sorting: ");
		for (Integer i : a) {
			System.out.println(i);
		}

		//Arrays.sort(a);
		Arrays.sort(a, new MyComparator());
		System.out.println("After sorting: ");
		for (Integer i : a) {
			System.out.println(i);
		}
	}

}
