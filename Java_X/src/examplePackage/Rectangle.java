package examplePackage;

public class Rectangle implements Shape {
	String shapeName = "Rectangle";
	int length, breadth;

	public Rectangle(int length, int breadth) { // Parameterized Constructor
		this.length = length;
		this.breadth = breadth;
	}

	public void getShapeName() {
		System.out.println("Shape Name is:- " + shapeName);
	}

	public void getArea() {
		System.out.println("Area of the rectangle is:- " + (length * breadth));
	}

	public void getSides() {
		System.out.println("Length is:- " + this.length);
		System.out.println("Breadth is:- " + this.breadth);
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 2);
		rect.getShapeName();
		rect.getArea();
		rect.getSides();
	}
}
