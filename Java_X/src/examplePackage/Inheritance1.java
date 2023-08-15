package examplePackage;

public class Inheritance1 { // this class is combination of 'Library' and 'Reader' class as inheritance

	public static void main(String[] args) {
		
		Reader reader = new Reader();
		// We can inherit the attributes
		/*
		System.out.println("Following are the details of the book borrowed:-");
		System.out.println(reader.bookName);
		System.out.println(reader.readerID);
		System.out.println(reader.dateBorrowed);
		*/
		
		//Also we can inherit methods
		
		reader.bookDetails();
		reader.readerDetails();
		
		
		System.out.println("");
		
		/*
		Reader1 reader1 = new Reader1("The Lean Startup", "Eric Ries", 7 , "17th June 2022", 93864);
		reader1.bookDetails();
		reader1.readerDetails();
		*/
		
		
	

	}

}
