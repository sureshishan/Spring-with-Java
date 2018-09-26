package com.suresh.ds.searcing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWithHash {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int arr[] = { 1, 2, 3, 2, 2, 3 };
		
		//int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 1);
		}
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println("Key:"+key+","+"Value:"+map.get(key));
		}
	}
}
