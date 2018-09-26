package wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 4, 6);
		System.out.println(sum(list1));
		
		List<Double> list2 = Arrays.asList(1.2, 4.5, 6.7, 8.9);
		System.out.println(sum(list2));

	}

	public static double sum(List<? extends Number> list) {

		double sum = 0.0;
		for (Number number : list) {
			sum = sum + number.doubleValue();
		}
		return sum;
	}

}
