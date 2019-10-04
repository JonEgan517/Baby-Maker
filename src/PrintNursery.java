import java.util.ArrayList;

public class PrintNursery 
{
	public static void printNursery(ArrayList<Baby> nursery)
	{
		System.out.println("Printing out the Nursery:");
		for (Baby baby: nursery) 
		{
		    System.out.println("\nBaby's Gender: "+ baby.getGender()
		    +"\nWeight: "+baby.getWeight()+"\nName: "+baby.getName()+"\nSchool: "+baby.getSchool()
		    +"\nFavorite Sport: "+baby.getSport()+"\nFavorite Animal: "+baby.getAnimal()+"\nFavorite Number: "+baby.getNumber()
		    +"\nFellow Classmate: "+baby.getClassmate()+"\nFavorite Music: "+baby.getMusic()+"\nFavorite Food: "+baby.getFood());
		}
	}
}
