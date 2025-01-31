
/*
   Inclusive Upper Bound (<=):
   ---------------------------
   1) Use (<=) if you are looping over a range of numbers and end number should be included.
   2) Use <= when the loop should include the upper bound (Last Number inclusive).
   3) This is appropriate when you're dealing with a range of numbers where both the start and end values should be included.
   
   
   Exclusive Upper Bound (<):
   --------------------------
   1) Use (<) if you are looping over a range of numbers and end number should not included.
   2) Use (<) when the loop should stop before reaching the upper bound (Last Number exclusive).
   3) This is common when iterating through arrays or collections where indices start at 0 and end at length - 1.
   
   Key Differences:
   ----------------
   
   1) Numbers: (Inclusive)
      Use <= when you explicitly want to include the upper limit.
      Example: for (int i = 1; i <= 5; i++). // 1 2 3 4 5
   
   2) Array or Collection Iteration: (Exclusive)
      Use < to ensure the loop doesn't go out of bounds (as array indices are 0-based).
      Example: for (int i = 0; i < arr.length; i++).
               for (int i = 1; i <= 5; i++) // 1 2 3 4
      
   
   General Rule of Thumb:
   -----------------------
   1) Use <= when iterating over a known range (Numbers) with inclusive bounds.
   2) Use < when dealing with Array (zero-based indexing) or collections.
   
   Avoiding Off-by-One Errors:
   --------------------------
   Be mindful of whether the loop should include the final value. If not, use <; if yes, use <=.
 =====================================================================================================  
   
   <---- When to use (<) or (<=) --->
   ----------------------------------
   
             Scenario	                       Use < or <=?	              Reason
 -------------------------------------------------------------------------------------------------
    Iterating through an array   	                <	          Prevents out-of-bounds access.
    Iterating through a range (inclusive)	        <=	          Includes the upper bound.
    Iterating through a range (exclusive)	        <	          Excludes the upper bound.
    Counting in reverse (inclusive)	                >=	          Includes the lower bound.
    Counting in reverse (exclusive)                 >	          Excludes the lower bound.
   
*/

package examplePackage;

public class ForLoopInclusiveAndExclusiveUpperBound {

	public static void main(String[] args) {
		
		// Inclusive Upper Bound (<=):
		
		System.out.println("Inclusive Bound (<=)");
		for (int i = 1; i <= 5; i++) {
		    System.out.println(i); // 1 2 3 4 5
		}
		
		// Exclusive Upper Bound (<):
		
		System.out.println("Exclusive Bound (<)");
		for (int i = 1; i < 5; i++) {
		    System.out.println(i); // 1 2 3 4
		}
		
		System.out.println("In case of array: Exclusive (<)");
		int[] arr1 = {10, 20, 30, 40, 50};
		for (int i = 0; i < arr1.length; i++) {  // Correct
		    System.out.println(arr1[i]); // 10 20 30 40 50
		}
		
		System.out.println("In case of array: If not Exclusive (<=)");
		int[] arr2 = {10, 20, 30, 40, 50};
		for (int i = 0; i <= arr2.length; i++) {  // Incorrect // ArrayIndexOutOfBoundsException
		    System.out.println(arr2[i]); // 10 20 30 40
		    // arr2[5] does not exist only up to 4th index is present in array.
		}

	}

}
