package concurrency;

public class StarvationDemo extends Thread{
	
	static int threadCount = 1;
	
	public void run(){
		System.out.println(threadCount+ " thread starts execution.");
		System.out.println("child thread execution completes.");
		threadCount++;
	}

	public static void main(String[] args) {
		System.out.println("main thread starts execution.");
		
	}

}
