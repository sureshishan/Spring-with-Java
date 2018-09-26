public class InterruptedDemo extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child thread is executing...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child thread interrupted");
			}
		}
	}

	public static void main(String[] args) {
		
		InterruptedDemo thread = new InterruptedDemo();
		thread.start();
		thread.interrupt();
		System.out.println("Main thread experied...");

	}

}
