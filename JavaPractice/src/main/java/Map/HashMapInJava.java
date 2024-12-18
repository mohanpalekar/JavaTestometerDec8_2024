package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava {
	
	public static void main(String[] args) {
		
		Map<String, String> hmap = new HashMap<>();
		
		hmap.put("username", "user123");
		hmap.put("password", "pass123");
		hmap.put("site_url", "https://www.google.co.in");
		
		System.out.println(hmap);
		
		System.out.println("=================================");
		
		for(Entry<String, String> entrySet: hmap.entrySet()) {
			System.out.println(entrySet.getKey());
			System.out.println(entrySet.getValue());
			
			System.out.println("=================================");
		}
		
		System.out.println(hmap.get("username"));
		
		hmap.remove("password");
		
		System.out.println(hmap);
		
	}

}
