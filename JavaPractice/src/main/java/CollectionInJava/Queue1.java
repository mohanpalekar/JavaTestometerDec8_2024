package CollectionInJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();

		//FIFO -- first in first out

		queue.add(6);
		queue.add(17);
		queue.add(3);
		queue.add(2);
		queue.add(3);
		queue.add(2);
		queue.add(0);
		queue.add(4);
		queue.add(20);
		queue.add(8);


		System.out.println(queue);

		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);

		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.isEmpty());



	}

}
