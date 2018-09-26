
public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";

		System.out.println("Length of string: " + s.length());
		System.out.println("IndexOf: " + s.indexOf('l'));
		System.out.println("IndexOf: " + s.indexOf("World"));
		System.out.println("IndexOf: " + s.indexOf('l', 3));
		System.out.println("IndexOf: " + s.indexOf("ld", 6));
		System.out.println("charAt:" + s.charAt(10));
		System.out.println("subsstring: " + s.substring(3));
		System.out.println("subsstring: " + s.substring(3, 10));
		System.out.println("subsequence: " + s.subSequence(3, 10));
		
		String[] strings = s.split(" ");
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		System.out.println(s.replace('l', 'k'));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		char[] charArray = s.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
	}

}
