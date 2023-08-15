package examplePackage;

public class WhileLoop4 {

	public static void main(String[] args) {

		int number = 20; // print the even numbers in specified range
		int i = 0;
		while (i <= number) {
			if (i % 2 == 0) { // If used "!=" operator, then Output will be Odd Numbers
				System.out.println(i);
			}			
			i++;
		}

	}

}
