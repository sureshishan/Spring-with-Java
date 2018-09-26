package practicepool;

public class CheckProcessor implements Runnable {

	String name;

	public CheckProcessor(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name
				+ " CheckProcess started processing check with "
				+ Thread.currentThread().getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name
				+ " CheckProcess finished processing check with "
				+ Thread.currentThread().getName());

	}

}
