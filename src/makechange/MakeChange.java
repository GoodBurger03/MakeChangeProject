
package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price = 0;
		double paid = 0;
		double change = 0;
// Prompting user for the price of their Item(s)
		System.out.print("Hello, enter the price of the item: ");
		price = kb.nextDouble();
// Asking how much they will give for their purchase.		
		System.out.print("How much money did you pay with?: ");
		paid = kb.nextDouble();
// If user does not pay enough for their Items
		if (paid < price) {
			System.out.println("That is not enough, please try again.");
// If the user uses exact change
		} else if (paid == price) {
			System.out.println("Thank you for using exact change! ");
	// If the customer needs change
		} else if (paid > price) {

			kb.close();

		}

		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quart = 0;
		int dime = 0;
		int nickel = 0;
		int penn = 0;
	// obtaining how much $$ the customer needs back	
		change = paid - price;

		int diffChange = 0;
		{
// Converting my coins so that the user gets the right amount returned
			change = change * 100;
// Using Math Round to make sure the user gets all pennies they need
			change = Math.round(change);
			diffChange = (int) change;

			twenty = diffChange / 2000;
			diffChange = diffChange % 2000;

			ten = diffChange / 1000;
			diffChange = diffChange % 1000;

			five = diffChange / 500;
			diffChange = diffChange % 500;

			one = diffChange / 100;
			diffChange = diffChange % 100;

			quart = diffChange / 25;
			diffChange = diffChange % 25;

			dime = diffChange / 10;
			diffChange = diffChange % 10;

			nickel = diffChange / 5;
			diffChange = diffChange % 5;

			penn = diffChange;
			System.out.println("Your change is: ");
// Deciding how much of each bill and coin == the amount the user is owed
			if (twenty > 1) {
				System.out.print(twenty + " twenty dollar bills, ");
			} else if (twenty == 1) {
				System.out.print(twenty + " twenty dollar bill, ");
			} else if (twenty == 0) {
			}
			if (ten > 1) {
				System.out.print(ten + " ten dollar bills, ");
			} else if (ten == 1) {
				System.out.print(ten + " ten dollar bill, ");
			} else if (ten == 0) {
			}
			if (five > 1) {
				System.out.print(five + " five dollar bills, ");
			} else if (five == 1) {
				System.out.print(five + " five dollar bill, ");
			} else if (five == 0) {
			}
			if (one > 1) {
				System.out.print(one + " one dollar bills, ");
			} else if (one == 1) {
				System.out.print(one + " one dollar bill, ");
			} else if (one == 0) {
			}
			if (quart > 1) {
				System.out.print(quart + " quarters, ");
			} else if (quart == 1) {
				System.out.print(quart + " quarter, ");
			} else if (quart == 0) {
			}
			if (dime > 1) {
				System.out.print(dime + " dimes, ");
			} else if (dime == 1) {
				System.out.print(dime + " dime, ");
			} else if (dime == 0) {
			}
			if (nickel > 1) {
				System.out.print(nickel + " nickels, ");
			} else if (nickel == 1) {
				System.out.print(nickel + " nickel, ");
			} else if (nickel == 0) {
			}
			if (penn > 1) {
				System.out.print(penn + " pennies.");
			} else if (penn == 1) {
				System.out.print(penn + " penny.");
			} else if (penn == 0) {
			}
		}
	}
}