package synchronization.classlock;

public class DisplayMessage {

	public synchronized static void displayName(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized static void sayHi(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void sayHello(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void sayGoodBye(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("GoodBye: " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
