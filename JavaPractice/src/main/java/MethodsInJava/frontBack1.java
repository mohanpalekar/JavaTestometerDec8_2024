package MethodsInJava;

public class frontBack1 {

	public static void main(String[] args) {

		String str = "a";

		System.out.println(frontBack(str));

	}

	public static String frontBack(String str) {

		StringBuilder sb = new StringBuilder();

		if(str.length()<2) {
			System.out.println(str);
		}else {

			sb.append(str.charAt(str.length()-1));
			sb.append(str.substring(1, str.length()-1));
			sb.append(str.charAt(0));
		}

		return sb.toString();
	}

}
