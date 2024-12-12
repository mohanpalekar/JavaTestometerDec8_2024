package Loops;

public class Continue {

	public static void main(String[] args) {

		for(int k=0; k<10; k++) {

			if(k>5 && k<8) {
				continue;
			}
			
			System.out.println(k);
		}
	}

}
