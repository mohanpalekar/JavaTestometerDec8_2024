package nonPrimitiveDataTypes;

public class StringInJava {
	
	public static void main(String[] args) {
		
		String str = "123%^&MMMbfjds567fj";
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		System.out.println(str.contains("123"));
		
		System.out.println(str.indexOf("%"));
		
		System.out.println(str.isBlank());
		
		System.out.println(str.indexOf("MMM"));
		
		System.out.println(str.replace("123", "4r5"));
		
	}

}
