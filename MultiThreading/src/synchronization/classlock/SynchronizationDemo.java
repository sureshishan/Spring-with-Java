package synchronization.classlock;

public class SynchronizationDemo {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("Suresh");
		MyThread mt2 = new MyThread("Ishan");

		HiThread ht1 = new HiThread("Pinky");

		DisplayMessage dm = new DisplayMessage();
		HelloThread het1 = new HelloThread(dm, "Aashi");

		GoodByeThread gt1 = new GoodByeThread("Dell");
		gt1.start();

		mt1.start();
		mt2.start();
		ht1.start();
		het1.start();

		try {
			mt1.join();
			mt2.join();
			ht1.join();
			het1.join();
			gt1.join();
		} catch (InterruptedException ex) {
			System.out.println("Could not join.");
		}
		System.out.println("End of main thread.");
	}
}
