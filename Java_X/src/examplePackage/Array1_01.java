package examplePackage;

public class Array1_01 {

	public static void main(String[] args) {

		int[] a = new int[5];

		a[0] = 11;
		a[1] = 22;
		a[2] = 33;

//		a[6] = 6; // java.lang.ArrayIndexOutOfBoundsException

		for (int i = 0; i <= 4; i++) {
			System.out.println(a[i]); // 1 2 3 0 0
		}

	}

}
