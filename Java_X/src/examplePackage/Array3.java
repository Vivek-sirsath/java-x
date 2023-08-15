package examplePackage;

public class Array3 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,56,34,25,67,12,4}; // One-dimensional array OR linear structure
				
		// Loop through an array of numbers and iterate until we find the element '25' in it
		// Use concepts Loops, Conditionals, Break Statements
		for(int i = 0; i<numbers.length; i++) { 
			if (numbers[i] == 25) {
				break;
				
			}
			System.out.println(numbers[i]);
		}

	}

}
