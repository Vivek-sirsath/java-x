package examplePackage;

public class Array1 { // Array is a Data Structure in Java

	public static void main(String[] args) {

		// Assigning values during array declaration
		int[] marks = { 78, 93, 72, 81, 86 }; // Java compiler automatically specifies the size by counting the no. of
											    // elements in an array

		// Assigning values after array declaration
		int[] marks1 = new int[5]; // array declaration
		// Assigning values
		// SYNTAX: array_name[index_number] = value
		marks1[0] = 78;
		marks1[1] = 93;
		marks1[2] = 72;
		marks1[3] = 81;
		marks1[4] = 86;

	}

}
