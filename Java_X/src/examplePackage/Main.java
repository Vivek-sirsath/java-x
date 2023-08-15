package examplePackage;

public class Main {

	public static void main(String[] args) {
		
		Reader1 reader = new Reader1("Zero To Hero", "Peter Theil", 4, "1st May 2022", 12345);
		reader.bookDetails();
		reader.readerDetails();
		
		Reader1 reader2 = new Reader1("The Lean Startup", "Eric Ries", 2, "17th June 2022", 93864);
		reader2.bookDetails();
		reader2.readerDetails();

	}

}
