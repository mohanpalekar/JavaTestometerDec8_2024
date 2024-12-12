package Loops;

public class ForEachLoop {

	public static void main(String[] args) {

		String str = "My Name is Xyz";

		//				for(int i=0; i<str.length(); i++) {
		//					System.out.println(str.charAt(i));
		//				}

		for(char c : str.toCharArray()) {
			System.out.println(c);
		}
		
		char[] ch = str.toCharArray(); //{'M','y',' ','N','a','m',e is Xyz}
		
		System.out.println(ch);
	}

}
