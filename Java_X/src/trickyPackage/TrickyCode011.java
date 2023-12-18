package trickyPackage;

//Q. What will be the error in the following code
//Answer: Castong is needed to convert int to byte at line b = b*50;

public class TrickyCode011 {

	public static void main(String[] args) {

		byte b = 50;

//		b = b*50; 

//		b = (byte) (b*50);
// * sign converted b*50 into int which can not convert into byte without casting
//	i.e. b = (byte) (b*50);

	}

}
