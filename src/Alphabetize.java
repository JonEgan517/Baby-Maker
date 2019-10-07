import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alphabetize 
{
	public static void alphabetically(ArrayList<Baby> nursery)
	{
		System.out.println("Before Sorting:");
		for(Baby baby: nursery)
		{
			System.out.println(baby);
		}
		
		//Collections.sort(nursery);
		
		System.out.println("After Sorting:");
		for(Baby name: nursery)
		{
			System.out.println(name);
		}
	}
}
