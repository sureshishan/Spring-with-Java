package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		Person emp = new Employee();
		emp.test();
	}
}

class Person{
	static int test(){
		System.out.println("test-Super");
		return 0;
	}
}

class Employee extends Person{
	public static int test(){
		System.out.println("Test-Sub");
		return 0;
	}
}
class PermanentEmployee extends Employee{
	
}

