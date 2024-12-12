package decisionMaking;

public class IfElse2 {
	
	public static void main(String[] args) {
		
		int i = 25;
		
		//less than 0
		//0-25
		//26-50
		//51-75
		//76-100
		//greater than 100
		
		if(i<0) {
			System.out.println("i is less than 0");
		}else if(i>=0 && i<=25) {
			System.out.println("i is within 0-25");
		}else if(i>=26 && i<=50) {
			System.out.println("i is within 26-50");
		}else if(i>=51 && i<=75) {
			System.out.println("i is within 51-75");
		}else {
			System.out.println("i is greater than 75");
		}
		
	}

}
