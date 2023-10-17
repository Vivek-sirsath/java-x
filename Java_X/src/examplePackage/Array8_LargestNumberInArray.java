package examplePackage;

public class Array8_LargestNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 3, 13, 8, 23, 5, 43, 21, 10, 67 };

		// To find the largest number in an array, we will create an array and assume
		// that first element of an array is largest
		// We'll store the first element in variable and name it as 'largest'
		int largest = numbers[0];

		for (int number : numbers) {
			if (largest < number) // Check if this element is largest than the assumed one
									// Return type - True Or False
				largest = number;
		}
		System.out.println("Largest number is:- " + largest);

	}

}
