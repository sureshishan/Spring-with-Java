package again;

public class CheckProcessorTask implements Runnable {

	private String name;

	public CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + " started processing by "
				+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " finished processing by "
				+ Thread.currentThread().getName());

	}

}
