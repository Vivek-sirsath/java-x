package examplePackage;

public class switchStatementCalculatorExample {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		String operator = "*"; // Multiplication Sign // This can be changeable
		
		switch (operator) { // Operator is an expression
		case "+":
			System.out.println("Addition is:- " + (a+b));
			break;
		case "-":
			System.out.println("Subtraction is:- " + (a-b));
			break;
		case "*":
			System.out.println("Multiplication is:- " + (a*b));
			break;
		case "/":
			System.out.println("Division is:- " + (a/b));
			break;
		default:
			System.out.println("Invalid Operator");
		}

	}

}
