package CollectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDIff {

	public static void main(String[] args) {

		List<Float> alist = new ArrayList<>();

		List<Float> llist = new LinkedList<>();

		long starttime = System.currentTimeMillis();


		for(int i=0; i<=100000; i++) {
			
			alist.add(12.559f);
			alist.add(22.559f);
			alist.add(32.559f);
			alist.add(42.559f);
			alist.add(52.559f);
			alist.add(62.559f);

			alist.remove(2);
			alist.remove(2);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(alist.size());
		
		System.out.println("Total Time: "+(endTime-starttime));
		
		long starttime1 = System.currentTimeMillis();

		for(int i=0; i<=100000; i++) {
			
			llist.add(12.559f);
			llist.add(22.559f);
			llist.add(32.559f);
			llist.add(42.559f);
			llist.add(52.559f);
			llist.add(62.559f);

			llist.remove(2);
			llist.remove(2);
		}
		
		long endTime1 = System.currentTimeMillis();
		
		System.out.println(llist.size());
		
		System.out.println("Total Time: "+(endTime1-starttime1));





	}

}
