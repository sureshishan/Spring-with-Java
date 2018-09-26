package anonymousinner;

public class DriverManager {

	static Connection getConnection() {

		Connection conn = new Connection() {

			public void createStatement() {
				System.out
						.println("ConFnection create with Anonymous Inner class.");
			}
		};
		return conn;
	}

}
