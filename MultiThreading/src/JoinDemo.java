import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n;
	static int sum = 0;

	public static void main(String[] args) {
		System.out.println("Sum of first 'N' numbers.");
		System.out.println("Enter a value: ");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();

		long start = System.currentTimeMillis();
		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Sum of first " + JoinDemo.n + " Numbers is:"
				+ JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Total time taken is: " + (end - start) / 1000
				+ " Seconds.");
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			// System.out.println("i :" + i + "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
