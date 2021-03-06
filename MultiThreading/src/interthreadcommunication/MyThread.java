package interthreadcommunication;

public class MyThread extends Thread {

	int total;

	public void run() {
		System.out.println("Chile thread is calculating the sum.");
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
			System.out.println(Thread.currentThread().getState());

			notify();
		}

	}
}
