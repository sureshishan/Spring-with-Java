package synchronization.block;

public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();

		MyThread mt1 = new MyThread(dm, "Suresh");
		MyThread mt2 = new MyThread(dm, "Ishan");

		mt1.start();
		mt2.start();

		try {
			mt1.join();
			mt2.join();
		} catch (InterruptedException ex) {
			System.out.println("Could not join.");
		}
	}

}
