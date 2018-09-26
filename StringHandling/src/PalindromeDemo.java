public class PalindromeDemo {

	public static void main(String[] args) {
		PalindromeDemo pd = new PalindromeDemo();
		String str = "SaaS";
		boolean result = pd.isPalindrome(str);
		System.out.println(result);
	}

	public boolean isPalindrome(String str) {

		if (str == null) {
			return false;
		}

		int length = str.length();
		System.out.println(length / 2);

		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;

		/*
		 * StringBuffer stringBuffer = new StringBuffer(str);
		 * stringBuffer.reverse();
		 * 
		 * return stringBuffer.toString().equals(str);
		 */

		/*
		 * StringBuilder stringBuilder = new StringBuilder(str);
		 * stringBuilder.reverse(); return stringBuilder.toString().equals(str);
		 */
	}
}
