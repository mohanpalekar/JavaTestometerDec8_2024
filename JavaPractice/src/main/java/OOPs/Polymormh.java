package OOPs;

public class Polymormh {

	public static void main(String[] args) {

		//		Account a = new Account(12348596325l, "Savings", "Kotak M", 12123.54f);
		//		
		//		System.out.println(a);
		//		
		//		System.out.println(a.getData(12348596325l, 0));
		//		
		//		System.out.println(a.getData(""));

		System.out.println(multiply(2, 3));
		System.out.println(multiply(2, 3, 4));
		System.out.println(multiply(new int []{2,3,4,5,6,7,7,7,}));
		System.out.println(multiply());
		System.out.println(multiply(1, "1"));
		System.out.println(multiply("1", 1));
	}

	public static int multiply(int a , int b) {
		return a*b;
	}
	
	public static int multiply(int a , int b, int c) {
		return a*b*c;
	}
	
	public static int multiply(int [] arr) {
		
		int result = 1;
		
		for(int  a : arr) {
			result = result * a;
		}
		
		return result;
	}
	
	public static int multiply(){
		return -1;
	}
	
	public static int multiply(int a, String b){
		return -11;
	}
	
	public static int multiply(String b, int a){
		return -11;
	}
	
	//multiply(int a, String b)
	
	//multiply(String b, int a)
	
	//multiply(int a, float b)
	
	//multiply(int a, float b, long l)

}
