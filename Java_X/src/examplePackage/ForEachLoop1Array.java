package examplePackage;

public class ForEachLoop1Array {

	public static void main(String[] args) {
		
		// Enhanced For Loop (for each loop)
		// As the name - it performs the specified operation on each of the elements in array collection
		
		/*
		 
		 SYNTAX :-    
		
		 for (dataType loopVariable : collection) {     // here collection is nothing but name of array and its elements
		 body of the loop
		 }
		
		*/
		
		int[] numbersArray = {56,34,25,67,12,4}; // One-dimensional array OR linear structure
		for (int numbers : numbersArray) {
			System.out.println(numbers);
		}

	}

}
