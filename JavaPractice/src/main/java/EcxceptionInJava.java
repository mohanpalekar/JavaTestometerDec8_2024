import java.util.Scanner;

public class EcxceptionInJava {

	public static void main(String[] args) {

		String str [] = new String [2];

		try {
			System.out.println(str[12]);
		}catch(Exception ex) {
			System.out.println("Exception occured : " +ex.getMessage());
			ex.printStackTrace();
			//		}catch(ArithmeticException ex1){
			//			System.out.println();
		}finally {
			System.out.println("After Exception");
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int i = sc.nextInt();

		System.out.println(i);

		//Test t1 = new Test();

		System.out.println(12/0);

	}

}
