package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashSetInjava {

	public static void main(String[] args) {

		Map<String, String> hmap = new LinkedHashMap<>();

		hmap.put("username", "user123");
		hmap.put("password", "pass123");
		hmap.put("site_url", "https://www.google.co.in");

		System.out.println(hmap);
		
	}

}
