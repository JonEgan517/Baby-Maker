import java.util.ArrayList;

public class NurseryData 
{
	public static void nurseryData()
	{
		BabyMaker.nursery = new ArrayList<Baby>();
		BabyMaker.nursery.add(new Baby("male", 6.2, "Fred", "Mullen", "football", "dog", 13, "Emma", "rap", "pizza"));
		BabyMaker.nursery.add(new Baby("female", 5.1, "Emma", "Regis", "basketball", "cat", 26, "Jon", "rock", "hot dog"));
		BabyMaker.nursery.add(new Baby("male", 7.3, "Bob", "Lakewood", "baseball", "bird", 7, "Fred", "country", "hamburger"));
	}
}
