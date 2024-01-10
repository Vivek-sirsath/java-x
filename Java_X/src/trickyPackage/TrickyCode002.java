
/* 
   Q. What will happen when we compile and run the following code?
   Answer - 67
   
   Not :- 10 25 [If use space - " "] instead of [space - ' ']
   
   In the provided Java code, the expression i + ' ' + j involves adding three values together: 
   the value of i, the character code for a space (' '), and the value of j.

   Let's break it down:

   The value of i is 10.
   The character code for a space (' ') is 32 in ASCII.
   The value of j is 25.
   
   Which means (10+32+25) = 67
 */

package trickyPackage;

public class TrickyCode002 {

	public static void main(String[] args) {

		int i = 10;
		int j = 25;

		System.out.println(i + ' ' + j); // 67

	}

}
