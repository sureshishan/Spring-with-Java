
public class StringPoolDemo {

	public static void main(String[] args) {
		User user1 = new User(1, "suresh");
		User user2 = new User(2, "Ishan");
		User user3 = new User(1, "suresh");
		
		String s1 = new String("Suresh");
		String s2 = new String("Suresh");
		
		String s3 = "Suresh";
		String s4 = "Suresh";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s3));
		
		System.out.println("===================================");
		
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
	}

}
