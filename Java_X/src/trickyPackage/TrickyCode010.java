package trickyPackage;

//Q. What will happen when you compile and run the following code
//Answer: The variable 'var1' is set to elements[0]

public class TrickyCode010 {

	public static void main(String[] args) {

		String[] elements = { "for", "tea", "too" };

		String var1 = (elements.length > 0) ? elements[0] : null; // try [1],[2]

		// If we print variable 'var1'
		System.out.println(var1);
	}

}
