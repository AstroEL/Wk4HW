import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendsList {

	/*
	 * Create a new menu driven application using a List instead of an array. 
	 * The application should allow the user to manage a friends list.
	 * The application should have the following options:
	 * 1) Display All Friends
	 * 2) Add New Friend
	 * 3) Delete All Friends
	 * 4) Delete A Friend
	 * 
	 * In a different class, create an ArrayList, HashSet, and HashMap.
	 * Add at least three entries to each collection.
	 * Iterate over each collection and print out the contents.
	 */
	
	static Scanner sc = new Scanner(System.in);
	static List<String> friends = new ArrayList<String>(); 	

	public static void main(String[] args) {
		
		int choice = 0;
		while (choice != 5) {
			showMenu();
			choice = getUserChoice();
			if (choice == 1) {
				displayAllFriends();
			} else if (choice == 2) {
				addNewFriend();
			} else if (choice == 3) {
				deleteAllFriends();
			} else if (choice == 4) {
				deleteAFriend();
			} else if (choice == 5) {
				System.out.println("\nGoodbye!");
			} else
				System.out.println("\nInput not recognized... Please make a selection");
		}
		
			
	}
	public static void showMenu() {

		System.out.println("\nFriend's List:");
		System.out.println("\n1) Display All Friends");
		System.out.println("2) Add New Friend");
		System.out.println("3) Delete All Friends");
		System.out.println("4) Delete A Friend");
		System.out.println("5) Exit");
		System.out.println("\n**Please make a selection**:");
	}

	public static int getUserChoice() {
		return sc.nextInt();
	}
	
	public static void displayAllFriends() {
		for (String friend : friends) {
			System.out.println(friend);
		}
	}

	public static void addNewFriend() {
			System.out.print("\nWhat is the first name of the Friend you are adding?");
			String name = sc.next();
			friends.add(name);
			System.out.println("\nYou have added " + name + " to your friends list.");
	}

	public static void deleteAFriend() {
		System.out.println();
		System.out.print("Enter the index of the friend you would like to remove from your friends list");
		int index = sc.nextInt();
		if (index < friends.size()) {
			friends.remove(index);
		}

}
	
	public static void deleteAllFriends() {
			friends.clear();
			System.out.println("\nYour friends list has been completely cleared!");	
	}



}
