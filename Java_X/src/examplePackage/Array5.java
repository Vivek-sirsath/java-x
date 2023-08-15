package examplePackage;

public class Array5 {

	public static void main(String[] args) {

		int[][] numbers = { { 2, 3 }, { 4, 2 } };

		// Fetch the elements by index

		/*
		 * System.out.println("Element at [0,0]:- " + numbers[0][0]);
		 * System.out.println("Element at [0,1]:- " + numbers[0][1]);
		 * System.out.println("Element at [1,0]:- " + numbers[1][0]);
		 * System.out.println("Element at [1,1]:- " + numbers[1][1]);
		*/

		// Fetch the Elements by Loop

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(numbers[i][j]);
			}
		}

	}

}
