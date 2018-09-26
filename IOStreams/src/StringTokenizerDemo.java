import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "You are the creator of your own destiny.";
		
		StringTokenizer st = new StringTokenizer(s, " ", true);
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
