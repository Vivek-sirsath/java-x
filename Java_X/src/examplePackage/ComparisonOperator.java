package examplePackage;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		int requiredAge = 18; 
		
		// comparison Operator also called as relational operator
		System.out.println(requiredAge > 18);  // false
		System.out.println(requiredAge >= 18); // true
		
		int num1 = 5;
		int num2 = 5;
		
		System.out.println("Result is:- " + (num1 == num2)); // true
		System.out.println("If used '!=' then result is:- " + (num1 != num2)); // false

	}

}
