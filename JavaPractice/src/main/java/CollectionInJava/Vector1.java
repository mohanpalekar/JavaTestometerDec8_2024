package CollectionInJava;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("ABC");
		vector.add("PQR");
		vector.add("EFG");
		vector.add("STR");

		Iterator<String> itr = vector.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<String> list = vector.reversed();

		System.out.println(list);
	}

}
