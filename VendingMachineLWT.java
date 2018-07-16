import java.util.Scanner;

public class VendingMachineLWT {
	 /*
	 * Write a vend method that takes double currency and String selection
	 * and returns a different String (candy) for different selections
	 * validate the currency is sufficient to purchase the candybar, 
	 * otherwise, return the money with a meaningful message.
	 */
	
	static Scanner sc = new Scanner(System.in);
	static double cash = 5.0;
	static String[] candyMenu = new String[5];
	static double priceOfCandy = 1.50;
	static String selection = "A3";

	public static void main(String[] args) {
		
		machineWelcome();
		machineMenu();
		System.out.println("\nHow much money do you have?");
		cash = sc.nextDouble();
		System.out.println("What is your selection?");
		selection = sc.next();
		System.out.println(vend(cash, selection));
		System.out.println(changeReturned(cash, priceOfCandy));

	}
	
	public static String vend(double cash, String selection) {
		String candy = "";
		if (selection.equals("A1") && cash >= priceOfCandy) {
				candy = "A Snickers Bar is dispensed.";
			} else if (selection.equals("A2") && cash >= priceOfCandy) {
				candy = "Peanut Butter M&Ms are dispensed.";
			} else if (selection.equals("A3") && cash >= priceOfCandy) {
				candy = "A Mr. Goodbar is dispensed";
			} else if (selection.equals("A4") && cash >= priceOfCandy) {
				candy = "Ah yeah, those Tropical Skittles were dispensed!";
			} else if (selection.equals("A5") && cash >= priceOfCandy) {				
			} else {
				System.out.println("Sorry! You don't have enough to purchase that!");
			}
		return candy;
	}
	
	public static void machineWelcome() {
		System.out.println("\n************************************");
		System.out.println("************************************");
		System.out.println("******    WELCOME TO THE  **********");
		System.out.println("******       VENDING      **********");
		System.out.println("******	     MACHINE      **********");
		System.out.println("************************************");
		System.out.println("******   ALL CANDY: $1.50 **********");
		System.out.println("************************************");

	}
	
	public static void machineMenu() {
		candyMenu[0] = "	A1) Snickers Bar";			
		candyMenu[1] = "	A2) Peanut Butter M&Ms";
		candyMenu[2] = "	A3) Mr. Goodbar";
		candyMenu[3] = "	A4) Tropical Skittles";
		candyMenu[4] = "	A5) Butterfinger Bar";
		
		for (int i = 0; i < candyMenu.length; i++) {
			System.out.println(candyMenu[i]);
		}
	}
	public static double changeReturned(double cash, double priceOfCandy) {
		double change = (cash - priceOfCandy);
		System.out.println("Here is your change:");
		return change;
	}

}
