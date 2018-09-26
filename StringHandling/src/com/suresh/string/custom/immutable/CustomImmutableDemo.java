package com.suresh.string.custom.immutable;

import java.util.ArrayList;
import java.util.List;

public final class CustomImmutableDemo {

	//private final int id;
	//private final String name;
	
	
	
	

	public static void main(String[] args) {
		String str = "/service/sharept_hosting,/service/warranty,/service/warranty";
		String[] strArr = str.split(",");
		List<String> listStr = new ArrayList<>();
		for (String string : strArr) {
			System.out.println(string);
			listStr.add(string);
		}
		System.out.println(listStr);
		boolean result = listStr.contains("/service/sharept_hosting");
		System.out.println(result);
		
	}

}
