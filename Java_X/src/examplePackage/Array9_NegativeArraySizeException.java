package examplePackage;

public class Array9_NegativeArraySizeException {

	public static void main(String[] args) {
		String x[] = new String [-3];
		
		System.out.println(x);

	}

}


/*
 
    Exception in thread "main" java.lang.NegativeArraySizeException: -3
	at examplePackage.Array9.main(Array9.java:6)

 */