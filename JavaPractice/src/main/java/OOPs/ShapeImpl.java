package OOPs;

public class ShapeImpl {
	
	public static void main(String[] args) {
		
		Shape t = new Triangle(20, 30, 40);
		
		Shape s = new Circle(5);
		
		Shape sq = new Square(10);
		
		System.out.println(t.area());
		System.out.println(t.perimeter());
		System.out.println(s.area());
		System.out.println(s.perimeter());
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
	}

}
