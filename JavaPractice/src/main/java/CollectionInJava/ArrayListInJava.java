package CollectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInJava{

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(123);
		list.add(423);
		list.add(23);
		list.add(13);
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains(423));
		
		//System.out.println(list.removeAll(list));
		
		System.out.println(list);
		
		Object [] arr = list.toArray();
		
		for(Object d : arr) {
			System.out.println(d);
		}
		
		List<Object> list2 = Arrays.asList(arr);
		
		System.out.println(list2);
		

	}

}
