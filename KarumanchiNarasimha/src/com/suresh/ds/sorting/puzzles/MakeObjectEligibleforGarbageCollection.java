package com.suresh.ds.sorting.puzzles;

public class MakeObjectEligibleforGarbageCollection {

	private String obj_name;

	MakeObjectEligibleforGarbageCollection(String obj_name) {
		this.obj_name = obj_name;
	}

	public static void show() {
		new MakeObjectEligibleforGarbageCollection("t1");
		display();
	}

	public static void display() {
		new MakeObjectEligibleforGarbageCollection(
				"t2");
	}

	public static void main(String[] args) {
		show();
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected.");
	}

}
