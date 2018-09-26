package journaldev;

public class SnippetDemo2 {

	public static void main(String[] args) {
		
		String str = "abc";
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(str.equals(sb));
	}

}
