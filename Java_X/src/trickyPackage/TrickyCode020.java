package trickyPackage;

/* Q. Will this code compile?
   Answer: Yes, since the 'TrickyCode020' extends Exception Class, 
   we can throw the instance of 'TrickyCode020' Class using throw statement.
   The code will compile and print "My custom exception test"
   followed by "Test Exception"
*/

public class TrickyCode020 extends Exception {

	public static void main(String[] args) {

		try {
			System.out.println("My custom exception test");
			throw new TrickyCode020();

		} catch (Exception e) {
			System.out.println("Test Exception");

		}

	}

}
