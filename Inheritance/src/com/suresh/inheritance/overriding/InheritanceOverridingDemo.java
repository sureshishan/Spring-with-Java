package com.suresh.inheritance.overriding;

public class InheritanceOverridingDemo {

	public static void main(String[] args) {
		Person p = new Employee();
		Person emp = (Person) p;
		emp.test();
	}
}

class Person {
	int id = 100;

	public void test() {
		System.out.println("Person's test().");
	}
}

class Employee extends Person {
	int id = 200;
	int salary;

	public void test() {
		System.out.println("Employee's test().");
	}
}

class PermanenetEmployee extends Employee {

}

class Student extends Person {

}

/*
 * If the overriding is initiated and the rules are not satisfied then it is a
 * compile time error
 * 
 * Compiler will not check to which object it is referring to but to the data
 * type of the reference
 * 
 * Compiler will never check what is the Object only it checks the type of the
 * reference.
 * 
 * because of dynamic binding polymorphism occurs.
 * 
 * 
 * In Java without inheritance can i have polymorphism? No. without inheritance
 * there is no concept of polimorphism. and it happens only when Dynamic binding
 * happens
 * 
 * Only can have dynamic binding attributes will have only static binding, so
 * the attributes point to the members of the reference only even at runtime.
 * 
 * If you try to refe the attribute using reference variable it bind to the
 * attribute in the reference call only
 * 
 * 
 * 
 * Type casting
 * 
 * changing the value into another data type is called as type casting.
 * 
 * it can happen either for primitieves even for dirived data types
 * 
 * if the super class object is type casted into the sub class object it given
 * runtime exception(ClasscastException)
 * 
 * The object can be type casted into the same class or even the super class.
 * 
 * So blindly we can tell that the type casting list contain at least one sub
 * class or irrelated class the it leads to ClasscastException at run time.
 */
