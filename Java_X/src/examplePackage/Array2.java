package examplePackage;

public class Array2 {

	public static void main(String[] args) {

		String[] javaXStudents = { "Mike", "Sam", "Leo", "Arjun", "Perry", "Nikki" }; // One-dimensional array OR linear structure

		System.out.println("Length of the array is:- " + javaXStudents.length);
		
        //print all the names in array
		for (int i = 0; i < javaXStudents.length; i++) {
			System.out.println(i + "-" + javaXStudents[i]);

		}

		System.out.println(javaXStudents[3]);

		javaXStudents[4] = "Justin";
		System.out.println(javaXStudents[4]);

	}

}
