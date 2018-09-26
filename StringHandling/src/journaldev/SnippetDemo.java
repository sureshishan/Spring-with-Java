package journaldev;

public class SnippetDemo {

	public static void main(String[] args) {
		
		String s1 = new String("suresh");
		String s2 = new String("suresh");
		
		String s3 = "Suresh";
		String s4 = "Suresh";
		String s5 = "suresh";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s3.hashCode() == s4.hashCode());
	}

}
