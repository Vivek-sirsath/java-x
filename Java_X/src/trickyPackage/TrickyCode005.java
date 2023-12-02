package trickyPackage;

/* Q. What will happen when we compile and run the following code?
 * Answer - 2
 */ 

public class TrickyCode005 {

	public static void main(String[] args) {
		
		int i = 0;
		int j = i++ + ++i;
		
		System.out.println(j);   // 2

	}

}
