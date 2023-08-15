package examplePackage;

public class Reader1 extends Library1 {
	
	String dateBorrowed;
	int readerID;

	Reader1(String bookName, String authorName, int quantity, String dateBorrowed, int readerID ) { // Parameterized constructor
		super(bookName, authorName, quantity); // We used super() method and called the parent class constructor (Library1)
		this.dateBorrowed = dateBorrowed;
		this.readerID = readerID;
	}
	
	
	void readerDetails() {
		System.out.println("Date: " + dateBorrowed);
		System.out.println("ID: " + readerID);
	}
	
	@Override
	void getDetails() {
		super.getDetails();
		System.out.println("Date: " + dateBorrowed);
		System.out.println("ID: " + readerID);
	}
	

}
