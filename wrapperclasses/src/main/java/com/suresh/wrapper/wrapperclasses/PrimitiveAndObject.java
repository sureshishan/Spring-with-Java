package com.suresh.wrapper.wrapperclasses;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		int x = 10;
		System.out.println("x:" + x);
		Integer y = Integer.valueOf(x);
		System.out.println("y:" + y);
		int z = y.intValue();
		System.out.println("z:" + z);
	}

}
