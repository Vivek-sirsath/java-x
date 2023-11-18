package examplePackage;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;
		boolean result;
		result = (a < b || b > a);
		System.out.println("Result is:- " + result);
		// false && false = false
		// true || true = true
		// true || false = true
		// false || true = true
		
		

		// boolean var = True;
		// System.out.println(!var); // Output is error

		int p = 5;
		int q = 7;
		int r = 3;
		boolean res = (p > q) && (q < r);
		System.out.println(res); // false
		// false && false = false
		// true && true = true
		// true && false = false
		// false && true = false

	}

}
