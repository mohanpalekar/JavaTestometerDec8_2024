package Strings;

public class StringBuffer12 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb);
		
		sb.append(" There");
		
		sb.append(" Hi");
		
		sb.append(123);
		
		sb.append(false);
		
		System.out.println(sb);
	}

}
