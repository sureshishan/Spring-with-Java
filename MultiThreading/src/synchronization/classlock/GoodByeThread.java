package synchronization.classlock;

public class GoodByeThread extends Thread {

	String name;

	public GoodByeThread(String name) {
		this.name = name;
	}

	public void run() {
		DisplayMessage.sayGoodBye(name);
	}
}
