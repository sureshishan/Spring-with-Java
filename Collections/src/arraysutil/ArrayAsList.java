package arraysutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		Integer[] a = { 10, 4, 19, 67, 56 };
		System.out.println("Array: ");
		for (Integer i : a) {
			System.out.println(i);
		}
		
		a[2] = new Integer(7);

		List<Integer> list = Arrays.asList(a);
		list.set(2, 34);
		System.out.println("List: " + list);
		
		List<Integer> list2 = new ArrayList<Integer>(list);
		list2.add(40);

	}

}
