package CollectionInJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava {
	
	public static void main(String[] args) {
		
		Set<Float> lset = new LinkedHashSet<>();
		
		lset.add(null);
		lset.add(12.4f);
		lset.add(33.54f);
		lset.add(20.6f);
		lset.add(12.4f);
		
		System.out.println(lset);
		
		
	}

}
