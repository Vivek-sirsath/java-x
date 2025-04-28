/*

   Logical Operators
   -----------------
   AND, OR, NOT

   - Logical operators uses boolean and non-boolean values.
   - Boolean = True , False
   - If we use -
               and : if both arguments (values) are True, result is True
               or : if at least one argument is True, result is True
               not : It is Compliment (Opposite Value)

# Truth Table -

+---------+---------+---------+---------+---------+
|    a    |    b    | a and b |  a or b |  not a  |
+---------+---------+---------+---------+---------+
|   TRUE  |   TRUE  |   TRUE  |  TRUE   |  FALSE  |
+---------+---------+---------+---------+---------+
|   TRUE  |  FALSE  |  FALSE  |  TRUE   |         |
+---------+---------+---------+---------+---------+
|  FALSE  |   TRUE  |  FALSE  |  TRUE   |  TRUE   |
+---------+---------+---------+---------+---------+
|  FALSE  |  FALSE  |  FALSE  |  FALSE  |         |
+---------+---------+---------+---------+---------+


+-------------------+----------------+
| LOGICAL OPERATOR  |  BOOLEAN VALUE |              |
+-------------------+----------------+
|        TRUE       |        1       |
+-------------------+----------------+
|        FALSE      |        0       |
+-------------------+----------------+


*/


package examplePackage;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;
		boolean result;
		result = (a < b || b > a);
		System.out.println("Result is:- " + result);
		// false || false = false
		// true || true = true
		// true || false = true
		// false || true = true
		
		

		// boolean var = True;
		// System.out.println(!var); // Output is error

		int p = 5;
		int q = 7;
		int r = 3;
		boolean res = (p > q) && (q < r);
		System.out.println(res); // false
		// false && false = false
		// true && true = true
		// true && false = false
		// false && true = false

	}

}
