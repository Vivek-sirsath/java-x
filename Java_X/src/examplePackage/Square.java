package examplePackage;

public class Square implements Shape {
	
	String shapeName = "Square";
	int side;
	
	public Square(int side) { // parameterized constructor
		this.side = side;
	}
	
	public void getShapeName() {
		System.out.println("Name of the shape is:- " + shapeName);
	}
	
	public void getArea() {
		System.out.println("Area of the Square is:- " + (side*side));
	}
	
	public void getSides () {
		System.out.println("Side is:- " + this.side);
	}
	
	public static void main(String[] args) {
		Square sq = new Square(5); // object creation
		
		sq.getShapeName();
		sq.getArea();
		sq.getSides();
	}
}
