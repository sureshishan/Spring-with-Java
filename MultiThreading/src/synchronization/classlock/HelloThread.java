package synchronization.classlock;

public class HelloThread extends Thread {

	DisplayMessage dm;
	String name;

	public HelloThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}

	public void run() {
		dm.sayHello(name);
	}

}
