package examplePackage;

public class switchStatementDiscountOffersWeekdays {

	public static void main(String[] args) {
		
		String day = "Friday"; // Write the day in capitalized form
		
		switch (day) {
		case "Tuesday":
			System.out.println("Congratulations..! On Tuesday you can avail 10 % off on all the products");
			break;
		case "Thursday":
			System.out.println("Congratulations..! On Thursday you can avail 15 % off on all the products");
			break;
		case "Sunday":
			System.out.println("Congratulations..! On Sunday you can avail 20 % off on all the products");
			break;
		default:
			System.out.println("Sorry..! No offers on this day");
		}
	}

}
