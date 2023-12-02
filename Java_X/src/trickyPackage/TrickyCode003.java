package trickyPackage;

/* Q. What will happen when we compile and run the following code?
 * Answer - 23
 */

public class TrickyCode003 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 12;
		
		i+=++j;
		System.out.println(i);  // 23

	}

}
