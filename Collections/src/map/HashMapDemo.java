package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(2, "Ishan");
		map.put(1, "Suresh");
		map.put(4, "Aashi");
		map.put(3, "Sam");

		System.out.println(map);

		Set<Integer> keySet = map.keySet();

		System.out.println(keySet);
		
		Collection<String> values = map.values();
		
		System.out.println(values);
		
		for (Integer key : keySet) {
			System.out.println("Key: "+key+" Value: "+map.get(key));
		}

	}

}
