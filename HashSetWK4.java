import java.util.HashSet;
import java.util.Iterator;

public class HashSetWK4 {
	
	/* 	 
	 * In a different class, create an ArrayList, HashSet, and HashMap.
	 * Add at least three entries to each collection.
	 * Iterate over each collection and print out the contents.
	 *
	 */

	public static void main(String[] args) {

		// HashSet
		HashSet<String> favBooks = new HashSet<String>();
			favBooks.add("The Book of Mormon");
			favBooks.add("The Pearl of Great Price");
			favBooks.add("The New Testament");
			favBooks.add("The Doctrine & Covenants");
			favBooks.add("The Old Testament");
			
			System.out.println("\nFavorite Books List");
			System.out.println("*******************\n");
			Iterator<String> i = favBooks.iterator();
			while (i.hasNext())
				System.out.println(i.next());
		
	}

}
