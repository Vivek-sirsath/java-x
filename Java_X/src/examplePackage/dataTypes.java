package examplePackage;

public class dataTypes {

	public static void main(String[] args) {
		
		// integer dataType
		int age = 18; // Positive or Negative Whole Number
		System.out.println(age);
		
		// float dataType
		float temperature = 36.7f; // we should append the letter 'f' or 'F' to the end of the dataType, Otherwise it will be treated as Double
		System.out.println(temperature); // float is real numbers, single precision floating-point
		
		// double dataType
		double temperature1 = 36.76; // we can append by 'd' or 'D' but it is optional // can accept 36.7
		float varOne = 13.5f;
		double varTwo = 74.801;
		System.out.println(temperature1); // it is double-precision floating point
		System.out.println(varOne);
		System.out.println(varTwo);
		
		// char dataType
		char grade = 'A'; // alphabetic type dataType
		System.out.println(grade);
		
		// string dataType
		String username = "Mike"; // non-premitive dataType // represented as a "String class"
		System.out.println(username);
		
		// boolean dataType
		boolean isloggedIn = false; // false is a boolean value
		System.out.println(isloggedIn);
		
		System.out.println(5>10);
		System.out.println(5<10);

	}

}
