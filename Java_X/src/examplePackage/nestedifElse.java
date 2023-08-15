package examplePackage;

public class nestedifElse {

	public static void main(String[] args) {
		
		String username = "Vivek";
		String password ="1234";
		
		// Outer If-Else condition BEGINS
		if(username == "Vivek") {
			// Inner If-Else condition BEGINS
			if(password == "1234") {
				System.out.println("login Successful");
			}else {
				System.out.println("Incorrect Password");
			// Inner If-Else condition ENDS
			}
		}
		else {
			System.out.println("User Not Found");
		}
       // Outer If-Else condition ENDS
	}

}
