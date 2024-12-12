package Loops;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		//reduce 10 to 0 by 1 in each step
		
		System.out.println("For Loop");
		
		for(int j=0; j<=10; j++) {
			System.out.println(i-j);
		}
		
		System.out.println("While Loop");
		
		while(i>15) {
			System.out.println(i);
			i--;
		}
	}

}
