package trickyPackage;

//Q. What is the output of the following code
//Answer: dogood:dogood

public class TrickyCode014 {

	public static void main(String[] args) {

		TrickyCode014 obj = new TrickyCode014();
		obj.start();

	}

	void start() {

		String stra = "do";
		String strb = method(stra);
		System.out.print(":" + stra + strb);
	}

	String method(String stra) {
		stra = stra + "good";
		System.out.print(stra);
		return "good";
	}

}
