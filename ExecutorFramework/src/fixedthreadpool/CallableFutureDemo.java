package fixedthreadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) {
		MyCallable tasks[] = { new MyCallable(10), new MyCallable(20),
				new MyCallable(30), new MyCallable(40), new MyCallable(50),
				new MyCallable(60) };

		ExecutorService taskExecutor = Executors.newFixedThreadPool(3);

		for (MyCallable task : tasks) {
			Future<Integer> future = taskExecutor.submit(task);
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
