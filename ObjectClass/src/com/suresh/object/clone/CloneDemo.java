package com.suresh.object.clone;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add = new Address("KPHB", "Road#3");
		Person p1 = new Person(100, "Suresh", add);
		Person p2 = null;
		/*try {
			p2 = p1.getColnableObject();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
		
		p2 = (Person) p1.clone();
		p1.setId(200);
		p1.setName("Ishan");
		p1.getAddress().setPlace("ECIL");
		p2.getAddress().setStreet("Road#1");
		System.out.println(p1);
		System.out.println(p2);
		
		
		//if the object contains primitive, wrapper or String it will create Deep copy. Disjoint copy
		
		// To obtain deep copy even though we have shallow elements we override the clone method.
		
		//new Person(100, "Suresh");
		
		//System.out.println(p1);
		//System.out.println(p1.equals(p2));
		
		//System.out.println(p1.hashCode());
		//System.out.println(p2.hashCode());
		
		
	}

}
