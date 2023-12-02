package trickyPackage;

// Q. Will this code compile successfully?
// Answer :- Yes, compile successfully but will not execute due to absence of main method
// In Java, child class can make the method abstract which is inherited from the parent class.

 class TrickyCode008 {

	public void process() {
		System.out.println("Parent");
	}
	
	public abstract class Test extends TrickyCode008{
		public abstract void process(); // Overridden method
	}

}
