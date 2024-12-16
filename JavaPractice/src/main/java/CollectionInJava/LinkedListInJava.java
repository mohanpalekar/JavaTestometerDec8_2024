package CollectionInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {
	
	public static void main(String[] args) {
		
		List<Float> list = new LinkedList<>();
		
		list.add(12.76f);
		list.add(22.56f);
		list.add(95.6f);
		list.add(92.06f);
		list.add(2.16f);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.remove(2);
		
		System.out.println(list.get(2));
		
		
	}

}
