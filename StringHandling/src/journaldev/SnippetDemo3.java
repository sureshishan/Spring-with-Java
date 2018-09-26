package journaldev;

public class SnippetDemo3 {

	public static void main(String[] args) {
		
		String s1 = "suresh";
		
		String s2 = new String("suresh");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		s2 = s2.intern();
		System.out.println(s1 == s2);
		
		String str = "JournalDev";
		
		char[] chars = str.toCharArray();
		System.out.println(chars);
		
		System.out.println(chars.length);
		
		char c = str.charAt(2);
		System.out.println(c);
		
		char[] chars2 = new char[7];
		
		str.getChars(0, 7, chars2, 0);
		System.out.println(chars2);
	}

}
