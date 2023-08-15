package examplePackage;

public class DoWhileLoop2 {

	public static void main(String[] args) {

		int i = 6; // by replacing 0 by 5 we're intentionally making the condition FALSE to execute do-while loop at least once
                   // We try something greater than 5 at initialization i.e. 6
		do {
			System.out.println("Java is Awesome");
			i++;
		} while (i < 5); // Here condition is evaluated to FALSE

	}

}
