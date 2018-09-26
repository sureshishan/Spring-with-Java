package set;


public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int compareTo(Employee o) {
		String s1 = this.name;
		String s2 = o.name;

		return s1.compareTo(s2);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}
