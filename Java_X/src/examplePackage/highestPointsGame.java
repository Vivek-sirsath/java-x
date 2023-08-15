package examplePackage;

public class highestPointsGame {

	public static void main(String[] args) {

		int playerOne = 9;
		int playerTwo = 10;
		int playerThree = 8;

		if (playerOne > playerTwo && playerOne > playerThree) {
			System.out.println("Player one scored the highest points");
		} else if (playerTwo > playerOne && playerTwo > playerThree) {
			System.out.println("Player two scored the highest points");
		} else {
			System.out.println("Player three scored the highest points");
		}

	}

}
