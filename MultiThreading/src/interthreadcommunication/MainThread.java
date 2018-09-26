package interthreadcommunication;

public class MainThread {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();

		synchronized (t) {
			try {
				System.out.println("Main thread is going to wait ");
				t.wait();
				System.out.println("Main thread state: "
						+ Thread.currentThread().getState());
				System.out.println("Main Thread notified.");
				System.out.println("Total: " + t.total);
				System.out.println("Main thread state: "
						+ Thread.currentThread().getState());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(t.getState());
		}

	}

}
