
public class Exc1 {


	public static void main(String[] args) {

		int arr [] = new int[]{3,5,6,8};

		try {
			System.out.println(arr[4] / 0);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}catch(ArrayIndexOutOfBoundsException ex1) {
			System.out.println("ArrayIndexOutOfBoundsException : "+ex1.getMessage());
		}catch(Exception ex) {
			System.out.println("Exception : "+ex.getMessage());
		}
	}

}
