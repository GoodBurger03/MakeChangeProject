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
		double coin25 = 0.25;
		double coin10 = 0.10;
		double coin5 = 0.05;
		double coin1 = 0.01;
		int change = (int) ((paid * 100) - (price * 100));
		double finalChange = (double) change / 100;
		int twenty = change % bill20;
		double ten = change % bill10;
		double five = change % bill5;
		double one = change % bill1;
		double quart = change % coin25;
		double dime = change % coin10;
		double nickle = change % coin5;
		double penn = change % coin1;
		
		System.out.print("Hello, enter the price of the item: ");
		price = kb.nextDouble();
		System.out.print("How much money did you pay with?: ");
		paid = kb.nextDouble();
		kb.close();
		
		if(paid < price) {
			System.out.println("That is not enough, please try again.");
			if (paid == price) {
			System.out.println("Thank you for using exact change! ");
		
		if(paid > price) {
			System.out.println("Please hold on and I will get your change: " + finalChange);
			
			
		//	if(bill20 == )
			
		}
				
			}
		}
	}

}
