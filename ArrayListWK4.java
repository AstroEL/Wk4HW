import java.util.ArrayList;
import java.util.List;

public class ArrayListWK4 {

/* 	 
 * In a different class, create an ArrayList, HashSet, and HashMap.
 * Add at least three entries to each collection.
 * Iterate over each collection and print out the contents.
 *
 */
		
	public static void main(String[] args) {

	// ArrayList
	List<String> favFoodList = new ArrayList<String>();
		favFoodList.add("Pizza");
		favFoodList.add("Steak & Potatoes");
		favFoodList.add("Tacos");
		favFoodList.add("Grilled Fish");
		
		System.out.println("\nFavorite Food List:");
		System.out.println("**********************\n");
		for(String food : favFoodList) {
			System.out.println(food);
		}		
	
	}
	
}
