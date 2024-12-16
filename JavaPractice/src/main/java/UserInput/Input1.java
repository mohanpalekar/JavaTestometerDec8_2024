package UserInput;

public class Input1 {

	public static void main(String [] args) {

		//String [] str = {"Nagpur", "Pune", "Mumbai"};
		float result = 0;

		for(String s : args) {
			
			float f = Float.parseFloat(s);
			
			result = result + f;
			
			System.out.println(s);
		}
		
		System.out.println(result);

	}

}
