public class AmbiguityDemo {

	public static void main(String[] args) {
		AmbiguityDemo ad = new AmbiguityDemo();
		ad.foo(null);

	}

	void foo(Object obj) {
		System.out.println("Object");
	}

	/*void foo(String str) {
		System.out.println("String");
	}*/
	
	/*void foo(AmbiguityDemo ad){
		System.out.println("AmbiguityDemo");
	}*/
	
	/*void foo(Integer integer){
		System.out.println("Integer");
	}*/
	
	void foo(Exception ex){
		System.out.println("Exception");
	}
	
	void foo(NullPointerException ex){
		System.out.println("NullPointerException");
	}

}
