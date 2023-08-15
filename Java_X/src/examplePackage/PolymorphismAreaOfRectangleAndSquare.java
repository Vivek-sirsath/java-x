package examplePackage;

public class PolymorphismAreaOfRectangleAndSquare { // This is the example of Static polymorphism / Compile-time polymorphism
	
	double area; // instance or Global variable
	
	// Also this is the example of Method Overloading
	// method name same and parameters are different
	
	double area(double length, double width) {
		area= length*width;
		return area;
	}
	double area(double side) {
		area = side*side;
		return area;
	}
	
	public static void main(String[] args) {
		PolymorphismAreaOfRectangleAndSquare pm = new PolymorphismAreaOfRectangleAndSquare();
		System.out.println(pm.area(50, 20));
		System.out.println(pm.area(30));
	}
}
