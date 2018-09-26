package concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentDemo extends Thread {

	static List list = new ArrayList();

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child thread is going to add an element.");
		}

		list.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		list.add("A");
		list.add("B");
		list.add("C");

		ConcurrentDemo t1 = new ConcurrentDemo();
		t1.start();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(list);
	}

}