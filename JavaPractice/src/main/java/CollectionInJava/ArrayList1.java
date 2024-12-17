package CollectionInJava;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
                // This is a comment.
		List<String> fruites = new ArrayList<>();

		fruites.add("Apple");
		fruites.add("Guava");
		fruites.add("Mango");
		fruites.add("Strawberry");
		fruites.add("Orange");

		System.out.println(fruites);

		System.out.println("============================");

		for(String s : fruites) {
			System.out.println(s);
		}

		System.out.println("============================");
		
		fruites.add("Grapes");
		fruites.add("Kiwi");

		Iterator<String> itr = fruites.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("============================");
		
		fruites.removeFirst();
		System.out.println(fruites);
		fruites.removeLast();
		System.out.println(fruites);
	}

}
