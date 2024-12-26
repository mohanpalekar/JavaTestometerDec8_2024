
public class ExcImpl {
	
	public static void main(String[] args) throws InvalidMobileNumberException {
		
		Long mobNumber = 123456789l;
		
		String str = String.valueOf(mobNumber);
		
		if( str.length() != 10) {
			System.out.println("Incorrect");
			throw new InvalidMobileNumberException("Number is invalid");
		}
		
		System.out.println(mobNumber);
	}

}
