package navigable;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(60);
		set.add(50);
		
		System.out.println(set);
		
		System.out.println(set.ceiling(30));
		System.out.println(set.higher(28));
		System.out.println(set.floor(35));
	}

}
