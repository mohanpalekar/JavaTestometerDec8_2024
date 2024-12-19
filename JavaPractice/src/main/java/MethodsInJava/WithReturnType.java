package MethodsInJava;

public class WithReturnType {
	
	public static void main(String[] args) {
		
	int result = sumOfNumbers(10,10);	
	System.out.println(result);
	
	table(result);
	
	int [] resultArr = table1(result);
	
	for(int i : resultArr) {
		System.out.println(i);
	}
	
	}
	
	public static int sumOfNumbers(int a, int b) {
		return a+b;
	}
	
	public static void table(int result) {
		for(int i=1; i<=10; i++) {
			System.out.println(result +" * "+ i+ " = "+(result * i));
		}
	}
	
	public static int [] table1(int result) {
		
		int [] arr = new int[10];
		for(int i=1; i<=10; i++) {
			
			arr[i-1]= result * i;
		}
		
		return arr;
	}
	
	

}
