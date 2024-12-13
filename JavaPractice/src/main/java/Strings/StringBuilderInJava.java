package Strings;

public class StringBuilderInJava {
	
	public static void main(String[] args) {
		
		StringBuilder sd = new StringBuilder();
		
		System.out.println(sd);
		
		sd.append("My ");
		sd.append("Name ");
		sd.append("Is ");
		
		System.out.println(sd);
		
		System.out.println(sd.reverse());
	}

}
