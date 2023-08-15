package examplePackage;

public class oddOrEvenUsingTernaryoperator { // ternary operator symbol "?:" and it is same as if-else statement

	public static void main(String[] args) {

		int number = 24;
		String result;

		result = (number % 2 == 0) ? "Even Number" : "Odd Number"; // ternary operator used
		System.out.println("The number is:- " + result);

	}

}
