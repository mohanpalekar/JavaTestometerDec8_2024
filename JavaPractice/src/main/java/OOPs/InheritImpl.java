package OOPs;

public class InheritImpl {
	
	public static void main(String[] args) {
		
		ParentClass p1 = new ParentClass();
		
		p1.method1();
		p1.method2();
		
		ChildClass c1 = new ChildClass();
		
		c1.method2();
		
		c1.method3();
		
		c1.method1();
		
		p1.method1();
		
	}

}
