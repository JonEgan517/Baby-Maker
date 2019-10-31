import java.util.Collections;
import java.util.Comparator;

public class Alphabetize 
{
	public static void alphabetically()
	{
		 Collections.sort(BabyMaker.nursery, new Comparator() 
		 {
	            @Override
	            public int compare(Object nurseryOne, Object nurseryTwo) 
	            {
	                //use instanceof to verify the references are indeed of the type in question
	                return ((Baby)nurseryOne).getName().compareTo(((Baby)nurseryTwo).getName());
	            }
	     });
		 
		 for (Baby baby: BabyMaker.nursery) 
		 {
			 System.out.println(baby.getGender() + "\n" 
					 + baby.getName() + "\n"
					 + baby.getSchool() + "\n"
					 + baby.getSport() + "\n"
					 + baby.getAnimal() + "\n"
					 + baby.getClassmate() + "\n"
					 + baby.getMusic() + "\n"
					 + baby.getFood());
		 }
	}
}
