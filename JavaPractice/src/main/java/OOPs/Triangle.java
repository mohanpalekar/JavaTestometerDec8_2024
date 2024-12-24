package OOPs;

public class Triangle implements Shape{

	/*
	 * side1 (length)
	 * side2 (breadth)
	 * side3 (height)
	 */

	private float length;

	private float breadth;

	private float height;

	public Triangle(float length, float breadth, float height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0.5f * this.length * this.breadth;
		
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return this.length + this.breadth + this.height;
	}
	

}
