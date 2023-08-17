
// In java, we can use valueOf() method to convert primitive types to corresponding objects

package wrapperClassPackage;

public class PrimitiveToObjectConversion {

	public static void main(String[] args) {

		int num = 5;

		Integer numObj = Integer.valueOf(num);
		System.out.println(numObj); // 5
		System.out.println(numObj instanceof Integer); // true

	}

}
