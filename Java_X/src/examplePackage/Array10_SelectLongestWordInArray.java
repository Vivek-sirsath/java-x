package examplePackage;

public class Array10_SelectLongestWordInArray {

	public static void main(String[] args) {

		String[] words = { "apple", "banana", "pear", "grape" };
		String selectWord = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > selectWord.length()) {
				selectWord = words[i];
			}
		}
		System.out.println(selectWord); // The code iterates through the string array and selects the longest word.

	}

}
