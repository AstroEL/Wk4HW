import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Research {

	public static void main(String[] args) {
		/* INSTRUCTIONS:
		 * Research the differences between Lists, Sets, and Maps in Java.
		 * Find different types of each (List, Set, Map) and research when
		 * you would use each implementation, or when a specific implementation is
		 * better than another. Document your findings.
		 * 
		 * In addition, include a line of code that shows how to instantiate each of 
		 * the following:
		 * ArrayList of type String
		 * HashSet of type StringBuilder
		 * HashMap of type String, String
		 */
	}
	
	/* Leiland's Note*** - I know this research is weak on my part - but I will continue to research these along
	 * with Week 5 assignments because I am genuinely interested - just ran out of time this week.
	 * 
	 * Lists - Are extremely useful because they allow duplicates, keeps elements ordered by an index (0-i), 
	 * 			allows null values.
	 * 			Common implementations: ArrayList, LinkedList, Vector
	 * 			LinkedList - Constructs a list containing the elements of the specified collection,
	 * 			 				in the order they are returned by the collection's iterator.
	 * 			Vector - a flexible array of objects, like an array you can access it using an integer index
	 * 					but the cool thing with a vector is the size of it can grow or shrink as needed
	 * 					to accommodate adding or removing items from the list.
	 *
	 * 
	 * Sets - To compare with the lists, there are no duplicates allowed, they are unordered and allow null values.
	 * 			Common implementations: HashSet, LinkedHashSet, TreeSet
	 *							
	 * 
	 * Maps - <K,V> K=key, V=value - Key value pairs (Dictionary), the values can be duplicate but not keys. 
	 * 			 Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
	 * 
	 * 
	 */
	//ArrayList of Type String
	List<String> test = new ArrayList<String>();
	//HashSet of type StringBuilder
	Set<StringBuilder> testing = new HashSet<StringBuilder>();
	//HashMap of type String, String
	Map<String, String> dictionary = new HashMap<String, String>();
}
