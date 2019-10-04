import java.util.ArrayList;

public class Alphabetize 
{
	public static void alphabetically(ArrayList<Baby> nursery)
	{
		for (Baby baby: nursery)
		{
			System.out.println("List after the use of" + " Collection.sort() :\n" + baby);
		}
	}
}
