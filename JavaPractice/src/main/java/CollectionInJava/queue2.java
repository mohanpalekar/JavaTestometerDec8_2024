package CollectionInJava;

import java.util.ArrayDeque;

public class queue2 {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.add(2);
		dq.add(3);
		dq.add(1);	
		dq.add(4);
		dq.add(2);
		
		System.out.println(dq);
		
		dq.addFirst(0);
		dq.addFirst(-1);
		dq.addFirst(13);
		
		System.out.println(dq);
		
		dq.addLast(23);
		dq.addLast(13);
		
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		
	}

}
