package threads;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();

		System.out.println("Thread Name:" + Thread.currentThread().getName());
		//System.out.println("Thread Name:"+ Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		//System.out.println("Thread Name:"+ Thread.currentThread().getPriority());

		t1.setName("First");
		t2.setName("Second");
		
		//t1.setDaemon(true);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		//t2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : "
					+ Thread.currentThread().getId() + " : " + " : "
					+ Thread.currentThread().getPriority() + " : " + i);
		}

	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + " : "
					+ Thread.currentThread().getId() + " : " + " : "
					+ Thread.currentThread().getPriority() + " : " + i);
		}
	}
}
