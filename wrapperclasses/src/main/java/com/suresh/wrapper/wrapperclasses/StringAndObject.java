package com.suresh.wrapper.wrapperclasses;

public class StringAndObject {

	public static void main(String[] args) {
		long x = 100;
		Long y = Long.valueOf(x);
		String z = y.toString();
		Long w = Long.valueOf(z);
	}

}
