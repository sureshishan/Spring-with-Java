package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double salary;
	transient long ssn;

	public Employee(int id, String name, double salary, long ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

}
