package fixedthreadpool;

public class CheckProcessorTask implements Runnable {
	private String name;

	public CheckProcessorTask(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name
				+ " Check processor bugan processing check with "
				+ Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name
				+ " Check processor finished processing check with "
				+ Thread.currentThread().getName());
	}

}
