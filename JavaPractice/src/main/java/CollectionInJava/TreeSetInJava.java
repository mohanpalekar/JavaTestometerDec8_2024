package CollectionInJava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {
	
	public static void main(String[] args) {
		
		Set<Integer> tset = new TreeSet<>();
		
		tset.add(12);
		//tset.add(null);
		tset.add(2);
		tset.add(22);
		
		System.out.println(tset);
		
	}

}
