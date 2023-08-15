package examplePackage;

public class ifElseifElse {

	public static void main(String[] args) {

		int marks = 65;
		if (marks > 90) {
			System.out.println("Grade:- Excellent");
		}
		else if (marks < 90 && marks >= 75) {
			System.out.println("Grade:- First Class");
		}
		else if (marks < 75 && marks >= 40) {
			System.out.println("Grade:- Average");
		} else {
			System.out.println("Grade:- Fail");
		}

	}

}
