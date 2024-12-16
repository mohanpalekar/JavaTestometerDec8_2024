package UserInput;

import java.util.Scanner;

public class ScannerInJava {
	
	public static void main(String[] args) {
		
		//Addition of 2 integers
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int i = sc.nextInt();
		
		System.out.println("Enter second number");
		
		int j = sc.nextInt();
		
		System.out.println("Result : "+(i+j));
	}

}
