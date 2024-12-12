package Loops;

public class ForLoop2 {

	public static void main(String[] args) {

		int [] arr = new int[5];

		//		arr[0] = 1;
		//		arr[1] = 1;
		//		arr[2] = 1;
		//		arr[3] = 1;
		//		arr[4] = 1;

		for(int i=0; i<arr.length; i++) {
			arr[i] = i*i;
		}

		for(int x : arr) {
			System.out.println(x);
		}
	}

}
