package Strings;

import java.util.StringTokenizer;

public class StringsTokenizer {

	public static void main(String [] args) {

		StringTokenizer st = new StringTokenizer("My|Name|Is|Xyz", "|");

		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());	
		}

	}

}
