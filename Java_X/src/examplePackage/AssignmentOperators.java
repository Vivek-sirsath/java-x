package examplePackage;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int productOne, productTwo, delivery, total;
		productOne = 57;
		productTwo = 98;
		delivery = 8;
		total = productOne + productTwo;
		System.out.println("Final Price is:- " + (total += delivery));

	}

}
