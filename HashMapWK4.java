import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapWK4 {

	/* 	 
	 * In a different class, create an ArrayList, HashSet, and HashMap.
	 * Add at least three entries to each collection.
	 * Iterate over each collection and print out the contents.
	 *
	 */
		
	public static void main(String[] args) {
		
	//HashMap
	Map<String, String> events = new HashMap<String, String>();
		events.put("July 21, 2018", "The Beegees");
		events.put("July 22, 2018" , "Iron Maiden");
		events.put("July 27, 2018", "System of a Down"); 
		events.put("August 1, 2018", "Rebelution");
		
	Set<String> dates = events.keySet();
	for (String date : dates) {
		System.out.println(date + " : " + events.get(date));
	}
		
	}	

}
