package examplePackage;

public class Library { // Default constructor used in this Library class example

	String bookName = "Zero to One";
	String authorName = "Peter Thiel";
	int quantity = 2;

	public void bookDetails() {
		System.out.println("Book Name:- " + bookName);
		System.out.println("Author Name:- " + authorName);
	}

	public int updateQuantity(int newQuantity) {
		quantity = newQuantity;
		return quantity;
	}

	public static void main(String[] args) {
		Library library = new Library(); // object of the library class
		library.bookDetails();
		library.updateQuantity(5);
		System.out.println("Book Count for " + library.bookName + " is " + library.quantity);

		Library library2 = new Library(); // We can create Two different objects of library class // Created
											// additionally 
		// every object is a unique instance of a class & each object has its own attributes and behaviours
		library2.bookDetails();
	}
}
