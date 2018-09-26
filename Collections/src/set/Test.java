package set;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>();

		set.add(new Employee(3, "Sam", 10000));
		set.add(new Employee(2, "Ishan", 10000));
		set.add(new Employee(4, "Aashi", 10000));
		set.add(new Employee(1, "suresh", 10000));

		//System.out.println("Set: " + set);
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}

}
