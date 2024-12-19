package MethodsInJava;

public class WithoutReturnType {
	
	public static void main(String[] args) {
		
		//call a method
		sumOfNumber(3,6);
		
		sumOfNumber(5,8);
		
		sumOfNumber(1,9);
		
		sumOf3Numbers(3,5,8);
		
		
	}
	
	//create a method
	public static void sumOfNumber(int a, int b) {
		
		System.out.println("Sum is "+(a+b));
		
	}
	
	public static void sumOf3Numbers(int a, int b, int c) {
		System.out.println("Sum is "+(a+b+c));
	}

}
