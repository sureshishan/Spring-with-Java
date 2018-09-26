package synchronization.classlock;

public class MyThread extends Thread {

	String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		DisplayMessage.displayName(name);
	}

}
