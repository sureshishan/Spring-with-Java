package daemonthread;

public class DaemonThread extends Thread {

	public DaemonThread(String name) {
		super(name);
	}

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(this.getName() + " It is a daemon thread."
					+ "id of the thread: " + this.getId());
		} else {
			System.out.println(this.getName() + " It is user thread."
					+ "id of the thread: " + this.getId());
		}
	}
}
