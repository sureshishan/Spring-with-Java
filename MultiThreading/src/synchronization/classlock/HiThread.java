package synchronization.classlock;

public class HiThread extends Thread {
	
	String name;
	
	public HiThread(String name) {
		this.name = name;
	}

	public void run() {
		DisplayMessage.sayHi(name);
	}

}
