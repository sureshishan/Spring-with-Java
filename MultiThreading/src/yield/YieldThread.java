package yield;

public class YieldThread {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();

		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread.");
		}

	}

}
