package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price = 0;
		double paid = 0;
		int bill20 = 20;
		int bill10 = 10;
		int bill5 = 5;
		int bill1 = 1;
		int coin25 = 25;
		int coin10 = 10;
		int coin5 = 5;
		int coin1 = 1;
		int change = (int) ((paid * 100) - (price * 100));
		
		int twenty = change % bill20;
		int ten = change % bill10;
		int five = change % bill5;
		int one = change % bill1;
		int quart = change % coin25;
		int dime = change % coin10;
		int nickle = change % coin5;
		int penn = change % coin1;
		double finalChange = ((double) change )/ 100;
		
		System.out.print("Hello, enter the price of the item: ");
		price = kb.nextDouble();
		System.out.print("How much money did you pay with?: ");
		paid = kb.nextDouble();
		
		
		if(paid < price) {
			System.out.println("That is not enough, please try again.");
			if (paid == price) {
			System.out.println("Thank you for using exact change! ");
		
		if(paid > price) {
			System.out.println("Please hold on and I will get your change: " + finalChange);
			
		if(bill20 == (change - twenty)) {
			System.out.println("You will get a $20 back. ");
				}
		if(paid >= ten && paid != twenty) {
			System.out.println("You will get a $10 back.");
		}
		if(paid >= five && paid != ten) {
			System.out.println("You get a $5 back.");
		}
		if(paid >= one && paid != five) {
			System.out.println("You will get a $1 back.");
		}
		if(one >= quart ) {
			int q = one -quart;
			q = q / coin25;
			System.out.println("You will get " +  q + "quarter back");
		}
		if(quart >= dime) {
			int d = quart - dime;
			d = d /coin10;
			System.out.println("You will get " + d + "dimes back");
		}
		if(dime >= nickle) {
			int n = dime - nickle;
			n = n /coin5;
			System.out.println("You will get " + n + "nickles back");
		}
		if(penn >= dime) {
			int p = penn - dime;
			p = p / coin1;
			System.out.println("You will get " + p + "pennies back");
		}
		}
		kb.close();
		
				
			}
		}
	}

}
