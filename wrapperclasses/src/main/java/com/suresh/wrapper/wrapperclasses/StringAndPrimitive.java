package com.suresh.wrapper.wrapperclasses;

public class StringAndPrimitive {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("x:" + x);
		String s = Integer.toString(x);
		System.out.println("s:" + s);
		int y = Integer.parseInt(s);
		System.out.println("y:"+y);
	}

}
