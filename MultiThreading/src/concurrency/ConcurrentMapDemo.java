package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(100, "For");
		map.put(101, "Each");
		map.put(102, "Every");
		
		map.putIfAbsent(101, "Hello");
		
		map.remove(100);
		map.putIfAbsent(100, "Geeks");
		map.replace(100, "Geeka", "For");
		System.out.println(map);
		
		
	}

}
