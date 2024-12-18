package CollectionInJava;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {
	
	public static void main(String[] args) {
		
		Set<String> hset = new HashSet<>();
		
		hset.add("One");
		hset.add("Two");
		hset.add("Three");
		hset.add("Four");
		
		hset.add(null);
		hset.add("Four");
		
		System.out.println(hset);
		
		
	}

}
