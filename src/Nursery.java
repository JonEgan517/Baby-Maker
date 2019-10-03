import java.util.ArrayList;

public class Nursery 
{
	static ArrayList<Baby> nursery = new ArrayList<Baby>();
	
	public static void babyNursery()
	{
		nursery.add(new Baby("male", 6.2, "Fred", "Mullen", "football", "dog", 13, "Emma", "rap", "pizza"));
		nursery.add(new Baby("female", 5.1, "Emma", "Regis", "basketball", "cat", 26, "Jon", "rock", "hot dog"));
		nursery.add(new Baby("male", 7.3, "Bob", "Lakewood", "baseball", "bird", 7, "Fred", "country", "hamburger"));
	}
}
