package trickyPackage;

/* Q. What will happen when we compile and run the following code?
 * Answer - 23
 * Here, ++j means increment j by 1 before its value is used. So, j becomes 13, 
 * and then i is updated by adding this value (i += 13), 
 * resulting in i being equal to 23.
 * 
 * The += operator is called the "addition assignment" operator in Java.
 * SYNTAX:
 *         variable += expression;
 *                i += ++j;
 *         variable = variable + expression;
 *                i = i + (++j);
 */

public class TrickyCode003 {

	public static void main(String[] args) {

		int i = 10;
		int j = 12;

		i += ++j;
		System.out.println(i); // 23

	}

}
