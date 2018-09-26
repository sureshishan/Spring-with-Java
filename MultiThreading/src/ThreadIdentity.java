public class ThreadIdentity extends Thread {

	public static void main(String[] args) {

		ThreadIdentity ti = new ThreadIdentity();
		ti.start();

		Thread currentThread = Thread.currentThread();
		System.out.println("Thread name is:" + currentThread.getName());

	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Print 200 Numbers");
		System.out.println("Thread name is:" + currentThread.getName());
	}

}
