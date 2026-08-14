package com.vcube_assignments;
/*	14-08-26
 * ----------
 	Create a class Movie with the following Data 
	•movieName 
	•releasedYear 
	•ticketPrice
	And Create 3 objects for class and
	take different data to assign into the variables using each object reference 
	and display the details
 */
public class Movie {
	String movieName;
	int yor;		// YOR = year of release
	int ticPrice;
	public static void main(String[] args) {
		Movie m1= new Movie();
		Movie m2= new Movie();
		Movie m3= new Movie();
		System.out.println("\n\t\t<<<Movie details>>>\n");
		m1.movieName="Pindam";
		m1.yor=2024;
		m1.ticPrice=250;
		System.out.println("Movie Name \t Year of Release \t TicketPrice");
		System.out.println("---------- \t --------------- \t -----------");
		System.out.println(m1.movieName+" \t\t "+m1.yor+" \t\t\t "+m1.ticPrice);
		m2.movieName="Lenin";
		m2.yor=2026;
		m2.ticPrice=455;
		System.out.println(m2.movieName+" \t\t "+m2.yor+" \t\t\t "+m2.ticPrice);
		m3.movieName="GunturKaram";
		m3.yor=2025;
		m3.ticPrice=575;
		System.out.println(m3.movieName+" \t "+m3.yor+" \t\t\t "+m3.ticPrice);
	}

}
