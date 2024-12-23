package OOPs;

public class ObjectsInJava {
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		obj = "String";
		
		System.out.println(obj);
		
		obj = 12.3f;
		
		System.out.println(obj);
		
		obj = false;
		
		System.out.println(obj);
		
		Object [] o1 = {"Fello", 212.44f, false};
		
		for(Object o : o1) {
			System.out.println(o);
		}
	}

}
