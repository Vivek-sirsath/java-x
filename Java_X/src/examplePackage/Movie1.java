package examplePackage;

public class Movie1 {
	
	String movieName; // instance variable or global variable declaration
	double movieRating; // instance variable or global variable declaration
	
	public Movie1(String name, double rating) { // parameterized constructor
		movieName = name;
		movieRating = rating;
	}
	public static void main(String[] args) {
		Movie1 mo = new Movie1("Predator", 7.8);
		System.out.println(mo.movieName);
		System.out.println(mo.movieRating);
		
	}
	

}
