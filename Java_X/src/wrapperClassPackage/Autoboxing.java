
/* Autoboxing:- 
   Automatic conversion of primitive data types into its corresponding wrapper class
   is known as Autoboxing.
*/
package wrapperClassPackage;

public class Autoboxing {

	public static void main(String[] args) {

		int a = 15;
		Integer numObj = a;
		System.out.println(a); // 15
		System.out.println(numObj instanceof Integer); // true
	}

}
