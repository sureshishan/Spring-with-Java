package anonymousinner;

public class Test {

	public static void main(String[] args) {
		Connection conn = DriverManager.getConnection();
		conn.createStatement();
	}

}
