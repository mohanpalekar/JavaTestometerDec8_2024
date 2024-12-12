package Loops;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		
		int i = 10;
		
		System.out.println("While Loop");
		
		while(i<0) {
			System.out.println(i);
			i--;
		}
		
		//resetting i to 10
		i=10;
		
		System.out.println("Do-While loop");
		
		do {
			System.out.println(i);
			i--;
		}while(i<0);
		
		
	}

}
