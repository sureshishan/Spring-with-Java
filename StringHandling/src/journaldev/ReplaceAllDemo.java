package journaldev;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "SaaS";
		String newStr = ReplaceAllDemo.removeChar(str, 'a');
		System.out.println(newStr);
	}

	static String removeChar(String str, char ch) {
		
		try {
			Class.forName("test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		int compareTo = str.compareTo("xyz");
		System.out.println(compareTo);

		return str.replaceAll(Character.toString(ch), "");
		
		
	}

}
