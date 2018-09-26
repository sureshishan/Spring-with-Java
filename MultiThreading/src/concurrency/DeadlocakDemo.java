package concurrency;

public class DeadlocakDemo extends Thread {

	public void run() {

		System.out.println("Child thread waits for main thread to complete.");

		try {
			mainThread.join();
		} catch (InterruptedException e) {
			System.out.println("Child thread completes execution");
		}

	}

	static Thread mainThread;

	public static void main(String[] args) throws InterruptedException {
		mainThread = Thread.currentThread();

		DeadlocakDemo thread = new DeadlocakDemo();

		thread.start();

		System.out.println("Main thread wiat for child thread to complete.");
		thread.join();
		System.out.println("Main thread completed execution.");
	}
}
