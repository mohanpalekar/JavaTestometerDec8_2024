package MethodsInJava;

public class missingChar1 {

	public static void main(String[] args) {

		String str = "Kitten";

		int index = 4;
		
		System.out.println(missingChar(str, index));


	}

	public static String missingChar(String str, int index) {
		int iterator = 0;

		StringBuilder sb = new StringBuilder();

		for(char c: str.toCharArray()) {
			if(index == iterator) {
				iterator++;
				continue;
			}
			//System.out.println(c);
			sb.append(c);
			iterator++;
		}

		return sb.toString();

	}

}
