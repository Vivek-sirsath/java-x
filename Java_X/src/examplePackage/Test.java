package examplePackage;

public class Test {
	
	// in this example, we initialize the instance variables of the class with the help of constructor
	// Declaration of variable
	String appName; // instance variable
	double version; // instance variable
	
	Test(){ // Constructor of Class // We can define values inside body of constructor
		System.out.println("Constructor Called"); 
		appName = "JavaX"; // Definition of variable
		version = 1.0; // Definition of variable
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		System.out.println(test.appName);
		System.out.println(test.version);
	}

}
