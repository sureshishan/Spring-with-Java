package synchronization.block;

public class MyThread extends Thread {

	String name;
	DisplayMessage dm;

	MyThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}

	public void run() {

		dm.displayName(name);
	}

}
