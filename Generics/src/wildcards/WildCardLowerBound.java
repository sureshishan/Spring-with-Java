package wildcards;

import java.util.Arrays;
import java.util.List;

public class WildCardLowerBound {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 4 , 5, 7, 7);
		printOnlyIntegerOrSuperClass(list1);
		
		List<Double> list2 = Arrays.asList(1.1, 2.6, 3.8, 4.9, 6.9);
		printOnlyIntegerOrSuperClass(list2);
		
		
	}
	
	public static void printOnlyIntegerOrSuperClass(List<?> list){
		System.out.println(list);
	}

}
