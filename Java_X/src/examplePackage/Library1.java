package examplePackage;

public class Library1 { // Parameterized constructor used in this Library2 class

	String bookName; // instance variable or global variable declaration
	String authorName; // instance variable or global variable declaration
	int quantity; // instance variable or global variable declaration

	Library1(String bookName, String authorName, int quantity) { // parameterized constructor
		// this keyword tells java compiler that - Assign values of the parameter to THIS particular instance variable of class & remove ambiguity
		this.bookName = bookName; 
		this.authorName = authorName;
		this.quantity = quantity;
	}

	void bookDetails() {
		System.out.println("Book Name:- " + bookName);
		System.out.println("Author:- " + authorName);
	}
	
	void getDetails() {
		System.out.println("Book Name:- " + bookName);
		System.out.println("Author:- " + authorName);
	}

	public static void main(String[] args) {
		Library1 lib = new Library1("Zero To Hero", "Peter Theil", 4);
		lib.bookDetails();
		
		System.out.println("");
		
		Library1 lib1 = new Library1("The Lean Startup", "Eric Ries", 3);
		lib1.bookDetails();
		
		System.out.println("");
		
		Library1 lib2 = new Library1("The Secret", "Rhonda Byrne", 11);
		lib2.bookDetails();
		
		
	}
}
