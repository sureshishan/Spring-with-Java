package practicepool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		CheckProcessor[] tasks = { new CheckProcessor("ATM"),
				new CheckProcessor("Bank"), new CheckProcessor("Mobile"),
				new CheckProcessor("Web") };

		ExecutorService taskExecutor = Executors.newFixedThreadPool(2);

		for (CheckProcessor task : tasks) {
			taskExecutor.execute(task);
		}

		taskExecutor.shutdown();

	}
}
