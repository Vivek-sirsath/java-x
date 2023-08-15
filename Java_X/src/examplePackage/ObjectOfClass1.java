package examplePackage;

public class ObjectOfClass1 {
	
	String bookName = "Zero to One";
	String authorName = "Peter Thiel";
	int quantity = 2;

	public void bookDetails() {
		System.out.println("Book Name:- " + bookName);
		System.out.println("Author Name:- " + authorName);
	}

	public int updateQuantity(int newQuantity) {
		quantity = newQuantity;
		return newQuantity;
	}

	public static void main(String[] args) {
		Library library = new Library(); // Created object of the library class
		library.bookDetails();
		// library.updateQuantity(5);
		System.out.println("Book Count for " + library.bookName + " is " + library.quantity);
	}

}
