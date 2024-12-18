package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {

		Map<String, String> hmap = new TreeMap();


		hmap.put("password", "pass123");
		hmap.put("site_url", "https://www.google.co.in");
		hmap.put("name", "user123");
		
		
		System.out.println(hmap);

	}

}
