package examplePackage;

public class Array6ThreeDimentional {

	public static void main(String[] args) {

		int[][][] Array6 = { { { 11, 12 }, { 14, 15 }, { 17, 18 } }, { { 21, 22 }, { 24, 25 }, { 27, 28 } },
				{ { 31, 32 }, { 34, 35 }, { 37, 38 } } };

		int row = Array6.length;
		System.out.println("Total Rows:- " + row);

		int column = Array6[0].length;
		System.out.println("Total Columns:- " + column);

		System.out.println("Following are the elements in 3D array:-");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++)
					System.out.println("Array6[" + i + "][" + j + "][" + k + "] = " + Array6[i][j][k]);

			}

		}

	}

}
