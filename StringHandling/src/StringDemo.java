public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Suresh";
		String s2 = new String("Bethala");

		char[] c = { 'a', 'e', 'i', 'o', 'u' };
		String s3 = new String(c);

		byte[] b = { 97, 98, 99, 100, 101 };
		String s4 = new String(b);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
