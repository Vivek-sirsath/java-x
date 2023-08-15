package examplePackage;

public class WhileLoop3andIfElse {

	public static void main(String[] args) {
		
		int number = 12; //Give any integer value, between 1 and 20
		
		while(number<20) { // while loop BEGINS
			System.out.println("Updated Count is, " + number);
			
			if (number % 2 == 0) {
				number = number + 5;
			}else {
				number = number - 1;
			}
		}

	}

}
