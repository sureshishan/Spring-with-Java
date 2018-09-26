package threadpool;

public class CheckProcessorTask implements Runnable {

	String name;

	CheckProcessorTask(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is getting processed by "
				+ Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name
				+ " Check processor has bugan processing the check "
				+ Thread.currentThread().getName());
	}

}
