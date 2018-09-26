package runnable;

public class RunnableDemo {

	public static void main(String[] args) {
		
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt1);
		t1.start();
		
	}

}
