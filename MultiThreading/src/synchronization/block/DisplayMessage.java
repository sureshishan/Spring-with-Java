package synchronization.block;

public class DisplayMessage {

	public void displayName(String name) {

		
			for (int i = 0; i < 15; i++) {
				System.out.println("How are you " + name);
				
				synchronized (this) {
					if(i>=5 && i<=10){
						System.out.println("Hi " + name);
					}
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}
}
