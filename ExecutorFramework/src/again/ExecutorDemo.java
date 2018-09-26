package again;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] tasks = { new CheckProcessorTask("ATM"),
				new CheckProcessorTask("Bank"), new CheckProcessorTask("Web"),
				new CheckProcessorTask("Mobile") };
		
		ExecutorService taskExecutor = Executors.newFixedThreadPool(2);
		for (CheckProcessorTask task : tasks) {
			taskExecutor.execute(task);
		}
		
		taskExecutor.shutdown();
	}
}
