package examplePackage;

public class ifStatement {

	public static void main(String[] args) {
		
		int age = 19;
		if (age>=18) {
			System.out.println("Congrats...! You are eligible to vote");	
		}
		int age1 = 15; // This second case is showing error
		if(age1>=18) {
			System.out.println("Sorry, you are not eligible to vote");
		}

	}

}
