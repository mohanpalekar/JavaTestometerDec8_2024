package UserInput;

public class DataConversions {
	
	public static void main(String[] args) {
		
		String str = "1234";
		
		int i = Integer.parseInt(str);
		
		String s1 = "12.67";
		
		float f = Float.parseFloat(s1);
		
		String s2 = "true";
		
		boolean b = Boolean.parseBoolean(s2);
		
		String s3 = String.valueOf(i);
		
		System.out.println(i+5);
		
	}

}
