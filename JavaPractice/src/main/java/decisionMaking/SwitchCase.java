package decisionMaking;

public class SwitchCase {

	public static void main(String[] args) {

		int size = 2;

		/*
		1 - ES
		2 - S
		3 - M
		4 - L
		5 - EL
		6 or any other --> Invalid size
		
		/*
		 * M - Medium
		 * S - Small
		 * L - Large
		 *
		 */

		switch(size) {

		case 1:
			System.out.println("Extra Small");
			break;
		case 2:
			System.out.println("Small");
			break;
		case 3:
			System.out.println("Medium");
			break;
		case 4:
			System.out.println("Large");
			break;
		case 5: 
			System.out.println("Extra Large");
			break;
		default:
			System.out.println("Invalid");

		}

	}

}
