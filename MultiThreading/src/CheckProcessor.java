public class CheckProcessor implements Runnable {

	public void run() {

		System.out.println("Check processed.");

	}

	public static void main(String[] args) {
		CheckProcessor cp = new CheckProcessor();
		Thread th = new Thread(cp);
		th.start();
	}

}
