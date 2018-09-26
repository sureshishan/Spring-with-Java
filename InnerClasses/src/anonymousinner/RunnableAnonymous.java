package anonymousinner;

public class RunnableAnonymous {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){

			public void run() {
				System.out.println("Thread executed this piece of when it spans");
			}
			
		});
		t1.start();
	}

}
