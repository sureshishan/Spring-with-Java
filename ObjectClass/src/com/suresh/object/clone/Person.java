package com.suresh.object.clone;

public class Person implements Cloneable {

	private int id;
	private String name;
	private Address address;

	Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return this.id + ":" + this.name + ":" + this.address;
	}

	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.id == p.id && this.name == p.name;// && this.address ==
														// p.address;
	}

	public int hashCode() {
		int hashValue = 0;
		hashValue += Integer.toString(id).hashCode();
		hashValue += name.hashCode();
		// hashValue += address.toString().hashCode();
		return hashValue;
	}

	public Person getColnableObject() throws CloneNotSupportedException {
		return (Person) this.clone();
	}

	protected Object clone() throws CloneNotSupportedException {

		Person p = (Person) super.clone();
		Address address = new Address(p.address.getPlace(),
				p.address.getStreet());
		p.address = address;
		return p;

	}
}
