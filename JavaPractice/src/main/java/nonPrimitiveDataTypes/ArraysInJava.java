package nonPrimitiveDataTypes;

public class ArraysInJava {

	public static void main(String[] args) {

		String [] str = {"Mango", "Orange", "Apple"};

		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		//System.out.println(str[3]);
		
		System.out.println("End of program");
		
		String [] str1 = new String[5];
		
		//str1[0] = "Pune";
		str1[1] = "Mumbai";
		str1[2] = "Gujrat";
		str1[3] = "Wardha";
		str1[4] = "Amravti";
		
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
		System.out.println(str1[3]);
		System.out.println(str1[4]);
		
		System.out.println(str1.length);

	}

}
