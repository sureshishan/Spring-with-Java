package synchronization;

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
		} catch (InterruptedException e) {
			System.out.println("Thread could not joined");
		}
		

		System.out.println("End of main Thread");

	}

}
