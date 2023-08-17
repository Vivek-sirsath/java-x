
/*
 * In Java, to convert objects to primitive types, we can use
 * the corresponding value methods (intValue(), doubleValue(), etc.)
 * present in each wrapper class.
 */

package wrapperClassPackage;

public class ObjectToPrimitiveConversion {

	public static void main(String[] args) {

		Integer numObj = 5;

		int a = numObj.intValue();
		System.out.println(a); // 5

	}

}
