package com.suresh.ds.sorting.puzzles;

import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println(powerlogn(x, y));

		scan.close();
	}

	static int power(int x, int y) {
		if (y == 0)
			return 1;
		else if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		else
			return x * power(x, y / 2) * power(x, y / 2);
	}

	static int powerlogn(int x, int y) {

		if (y == 0)
			return 1;
		int temp = powerlogn(x, y / 2);
		if (y % 2 == 0)
			return temp * temp;
		else
			return x * temp * temp;
	}
}
