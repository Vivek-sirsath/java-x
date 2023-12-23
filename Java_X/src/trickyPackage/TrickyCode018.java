package trickyPackage;

//Q. What is the output of the following code
//Answer: Output is 1

// Instead of TrickyCode018 class name should be Recursion
class TrickyCode018 {

	int func(int n) {

		int result;
		if (n == 1)
			return 1;
		result = func(n - 1);
		return result;
	}
	public static void main(String[] args) {

		TrickyCode018 obj = new TrickyCode018();
		System.out.println(obj.func(5));
	}
}

class Output {

	// main method should be here according to Original question
	
}
