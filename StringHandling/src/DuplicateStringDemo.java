import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateStringDemo {

	public static void main(String[] args) {
		DuplicateStringDemo dsd = new DuplicateStringDemo();
		String[] arr = { "abc", "xyz", "pqr", "abc", "pqr", "xyz", "pqr" };

		dsd.duplicateStringCount(arr);
	}

	void duplicateStringCount(String[] arr) {
		Map<String, Integer> map = new HashMap<>();

		for (String element : arr) {
			if (map.containsKey(element)) {
				int count = map.get(element);
				map.put(element, ++count);
			} else {
				map.put(element, 1);
			}
		}
		
		System.out.println("Before Sorting...");

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("After Sorting...");
		//Based on key:
		/*Map<String, Integer> smap = new TreeMap<String, Integer>(map);
		Set<String> keySet2 = smap.keySet();
		for (String key : keySet2) {
			System.out.println(key + ":" + smap.get(key));
		}*/
		
		/*Based on value*/
		
		Map<String, Integer> smap = new HashMap<>();
		List<Entry<String, Integer>> list = new LinkedList<>(smap.entrySet());
		Collections.sort(list, new Comparator<Object>(){

			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}
			
		});
	}

}
