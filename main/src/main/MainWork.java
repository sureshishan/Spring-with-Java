package main;

public class MainWork {

	public static void main(String[] args) {
		//MainWork.main();
		System.out.println("Actual main..");
		main(new Integer(10));
	}
	
	public static void main(Integer i){
		System.out.println("overloaded main...");
		System.out.println(i.intValue());
	}
}
