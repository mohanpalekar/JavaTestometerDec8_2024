package MethodsInJava;

public class front3 {

	public static void main(String[] args) {

		String str = "ab";

		StringBuilder sb = new StringBuilder();

		if(str.length()>=3) {
			for(int i=0; i<3; i++) {
				sb.append(str.subSequence(0,  3));
			}
		}else {
			for(int i=0; i<3; i++) {
				sb.append(str);
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static String front(String str) {
		
		StringBuilder sb = new StringBuilder();

		if(str.length()>=3) {
			for(int i=0; i<3; i++) {
				sb.append(str.subSequence(0,  3));
			}
		}else {
			for(int i=0; i<3; i++) {
				sb.append(str);
			}
		}
		
		return sb.toString();
	}

}
