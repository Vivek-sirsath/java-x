package trickyPackage;

/* Q. What will happen when we compile and run the following code?
 * Answer - false
 */

public class TrickyCode004 {

	public static void main(String[] args) {

		boolean b1 = true, b2 = false, b3 = true;

		System.out.println(b1 && b2 && !b3);  // (true && false && true) = false

	}

}
