package threadpool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int num;

	public MyCallable(int num) {
		this.num = num;
	}

	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()
				+ " is calculating the sum of all numbers up to " + num);

		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		Thread.sleep(2000);
		return sum;
	}

}
