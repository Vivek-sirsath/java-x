package examplePackage;

 class Reader extends Library {
	
	String dateBorrowed = "1st May 2022";
	int readerID = 127384;
	
	void readerDetails() {
		System.out.println("Date: " + dateBorrowed);
		System.out.println("ID: " + readerID);
	}

}
