package com.suresh.object.clone;

public class Address {
	private String place;
	private String street;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	Address(String place, String street) {
		this.place = place;
		this.street = street;
	}

	public String toString() {

		return place + "," + street;
	}

}