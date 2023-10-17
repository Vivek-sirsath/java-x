package examplePackage;

public class Array7_SumOfElementsUsingForEachLoop {

	public static void main(String[] args) {
		
		// To find the sum of all elements of an Array, we need to add each element one by one and store it in to a resultant variable.
		int[] numbers = {3,67,8,23,5,43,21,10,13};
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		System.out.println("Sum of all the elements is:- " + sum);
	}

}
