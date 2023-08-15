package examplePackage;

public class This1 {

	int number; // declaration of instance / global variable

	This1() {
		this(50);

	}

	This1(int number) {
		this.number = number;

		/*
		 'this()' can be used to call one constructor within another without creating
		  the objects multiple times as created in 'Library1' class
		 */
	}

	public static void main(String[] args) {
		This1 th = new This1();
		System.out.println(th.number);
	}

}
