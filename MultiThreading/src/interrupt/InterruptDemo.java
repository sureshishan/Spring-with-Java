package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		//mt.interrupt();

		System.out.println("End of main thread.");
	}
}
