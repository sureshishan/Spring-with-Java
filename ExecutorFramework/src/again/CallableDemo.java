package again;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		MyCallable[] tasks = { new MyCallable(10), new MyCallable(20),
				new MyCallable(5), new MyCallable(15) };

		ExecutorService taskExecutor = Executors.newFixedThreadPool(2);
		
		for (MyCallable task : tasks) {
			Future<Integer> future = taskExecutor.submit(task);
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
		}
		taskExecutor.shutdown();
	}

}
