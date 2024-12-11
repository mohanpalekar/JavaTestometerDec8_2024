package primitiveDataTypes;

public class castingInJava {

	public static void main(String[] args) {

		byte b = 12;

		short s = 127;

		//s = b;
		
		b = (byte) s; 
		
		System.out.println(b);
	}

}
