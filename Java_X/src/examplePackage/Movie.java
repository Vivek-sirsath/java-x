package examplePackage;

public class Movie {

	String movieName = "The Godfather"; // Defining instance / global variable at class level
	double movieRating = 9.2;  // Defining instance / global variable at class level

	public static void main(String[] args) {

		Movie movie = new Movie(); // object of class & default constructor called
		System.out.println(movie.movieName);
		System.out.println("Rating:-" + " " + movie.movieRating);
	}

}
