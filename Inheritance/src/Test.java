
public class Test {

	public static void main(String[] args) {

		String str = "abc";
		System.out.println(isNull(str));
		
	}
	
	static boolean isNull(String str){
		System.out.println("Interface Null Check");
		 
        return str == null ? true : "".equals(str) ? true : false;
	}

}
