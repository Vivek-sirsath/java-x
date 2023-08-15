package examplePackage;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		final double PI = 3.14; // Local Variable // good habit to declare final variable in UPPERCASE format not mandatory
		double radius = 20;
		double area = PI*radius*radius;
		System.out.println("Area of the circle is:- " + area);

	}

}
