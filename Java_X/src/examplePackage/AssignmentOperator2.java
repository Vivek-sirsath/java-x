
/*
 * Reference: CodeChef
 *here are also compound assignment operators that perform an operation and then assign the result back to the variable.
 * Let's look at a few:

   x -= 5  -->  x = x-5        (Subtracts 5 from x and assigns the result back to x)
   x *= 3  -->  x = x*3       (Multiplies x by 3 and assigns the result back to x)
   x /= 3  -->  x = x/3        (Divides x by 3 and assigns the result back to x)
   x %= 3  -->  x = x%3       (Finds the remainder when x is divided by 3 and assigns the result back to x) 
   
 */

package examplePackage;

public class AssignmentOperator2 {

	public static void main(String[] args) {

		int a = 10, b = 2;
		a /= b;
		System.out.println(a); // 5

//        Explanation:
//        Initially, a is 10 and b is 2. 
//        When a /= b; is executed, it performs a = a / b, which is a = 10 / 2, resulting in a being 5.

	}

}
