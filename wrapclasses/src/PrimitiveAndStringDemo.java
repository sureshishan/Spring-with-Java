public class PrimitiveAndStringDemo {
	public static void main(String[] args) {
		int i = 10;
		String s = Integer.toString(i);
		System.out.println(i);
		System.out.println(s);

		int j = Integer.parseInt(s);

		System.out.println(j);
		System.out.println(s);

	}
}
