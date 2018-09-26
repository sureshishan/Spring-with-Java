package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("X");
		list.add("FG");
		list.add("ZYURD");
		list.add("CYU");
		list.add("BUIFDIIUFDC");
		System.out.println(list);
		//Collections.sort(list);
		Collections.sort(list, new MyComparator());
		System.out.println(list);

		int result = Collections.binarySearch(list, "CYU");
		System.out.println("Index is: " + result);
	}
}
