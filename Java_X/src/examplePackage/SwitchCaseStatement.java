package examplePackage;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		int day = 6;
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}

	}

}
