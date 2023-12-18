
package trickyPackage;

//2nd Dec 2023 Screenshots (TrickyCode 001 to 009)
//Q. Will this code compile?
//Answer - YES

public class TrickyCode001 extends Exception{
	
	public static void main(String[] args) {
		
		try {
		
		System.out.println("My custom Exception test");
		throw new TrickyCode001();
		
		}catch(Exception e){
			System.out.println("Exception message is: " + e);
			System.out.println("WillThisCompile001:Class Name - Exception");
		}
	}

}
