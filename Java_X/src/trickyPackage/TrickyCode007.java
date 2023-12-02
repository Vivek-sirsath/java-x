package trickyPackage;

/* Q. What will happen when we compile and run the following code?
 * Answer - The code will compile but will throw AssertionError when executed.
 */ 

public class TrickyCode007 {

	public static void main(String[] args) {		
		displayAge(20);
	}
	
	private static void displayAge(int age) {
		assert age >= 21 : getAgeMessage();
		System.out.println(age);
	}
	
	private static String getAgeMessage() {
		return "Your age must be greater than 21";
	}

}
