package com.javaintro;

public class Movie {

	// static variables
	static String theatreName = "viswanath movies";
	static String theatrelocation = " Hyderabad";

	// instance variables
	String MovieName;
	double budget;
	String releasedate;

	public static void main(String[] args) {

		Movie m1 = new Movie();
		m1.MovieName = "RRR";
		m1.budget = 400;
		m1.releasedate = "15-06-2024";

		System.out.println(" theatrename :" + theatreName);
		System.out.println(" thetreLocations :" + theatrelocation);

		System.out.println(" MovieName :" + m1.MovieName);
		System.out.println(" Budget:" + m1.budget);
		System.out.println(" Release Date:" + m1.releasedate);

		System.out.println("**************************************");

		Movie m2 = new Movie();
		m2.MovieName = "Nayak";
		m2.budget = 400;
		m2.releasedate = "10-06-2018";

		System.out.println(" theatrename :" + theatreName);
		System.out.println(" thetreLocations :" + theatrelocation);

		System.out.println(" MovieName :" + m2.MovieName);
		System.out.println(" Budget:" + m2.budget);
		System.out.println(" Release Date:" + m2.releasedate);

		System.out.println("***********************************");

		Movie m3 = new Movie();
		m3.MovieName = "magadheera";
		m3.budget = 500;
		m3.releasedate = "11-04-2015";

		System.out.println(" theatrename :" + theatreName);
		System.out.println(" thetreLocations :" + theatrelocation);

		System.out.println(" MovieName :" + m3.MovieName);
		System.out.println(" Budget:" + m3.budget);
		System.out.println(" Release Date:" + m3.releasedate);

		System.out.println("***********************************");
		
		Movie m4 = new Movie();
		m4.MovieName = "chirutha";
		m4.budget = 200;
		m4.releasedate = "10-06-2008";

		System.out.println(" theatrename :" + theatreName);
		System.out.println(" thetreLocations :" + theatrelocation);

		System.out.println(" MovieName :" + m4.MovieName);
		System.out.println(" Budget:" + m4.budget);
		System.out.println(" Release Date:" + m4.releasedate);

		System.out.println("***********************************");
		
		Movie m5 = new Movie();
		m5.MovieName = "Bruslee";
		m5.budget = 200;
		m5.releasedate = "10-06-2021";

		System.out.println(" theatrename :" + theatreName);
		System.out.println(" thetreLocations :" + theatrelocation);

		System.out.println(" MovieName :" + m5.MovieName);
		System.out.println(" Budget:" + m5.budget);
		System.out.println(" Release Date:" + m5.releasedate);

		System.out.println("***********************************");


	}

}
