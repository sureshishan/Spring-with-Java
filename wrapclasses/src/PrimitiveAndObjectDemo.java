public class PrimitiveAndObjectDemo {

	public static void main(String[] args) {

		int i = 10;
		Integer j = Integer.valueOf(i);

		System.out.println(i);
		System.out.println(j);
		
		int k = 20;
		Integer l = new Integer(k);
		
		System.out.println(k);
		System.out.println(l);
		
		int m = l.intValue();
		
		System.out.println(m);

	}

}
