package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("suresh");
		list.add("Aashi");
		list.add("Sam");
		list.add("Tom");
		list.add("Bob");
		list.add("John");
		list.add("Ishan");

		System.out.println(list);

		Queue<String> queue = new PriorityQueue<>();

		System.out.println(queue.peek());
		// System.out.println(queue.element());
		System.out.println(queue.poll());

		try {
			System.out.println(queue.remove());
		} catch (NoSuchElementException ex) {
			System.out.println("Q is Empty.");
		}

		queue.addAll(list);
		queue.offer("babu");

		System.out.println(queue);
		queue.poll();
		System.out.println(queue);

	}
}
