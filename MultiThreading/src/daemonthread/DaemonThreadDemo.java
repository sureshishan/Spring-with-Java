package daemonthread;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		DaemonThread de1 = new DaemonThread("dt1");
		DaemonThread de2 = new DaemonThread("dt2");
		DaemonThread de3 = new DaemonThread("dt3");
		
		de1.setDaemon(true);
		de1.start();
		
		de2.start();
		
		de3.setDaemon(true);
		de3.start();
	}

}
