package assignment3_arithmeticOperatos;

public class Question7 {

	public static void main(String[] args) {
		
/*Write a program that determines the change to be dispensed from 
 a vending machine.An item in the machine can cost between 25 cents 
 and 1 dollar,in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
 and the machine accepts only a single dollar bill to pay for the item.
 Sample output
  Price in cents : 95
  Your change is 0 quarters, 0 dimes, and 1 nickles*/
		
		
		int priceInCents=95, quarters, dimes, nickles;
		int item=1;
		
		quarters=item/priceInCents;
		
		dimes=item/priceInCents;
		
		nickles=item%priceInCents;
		
		
		System.out.println("Price in cents : " + priceInCents);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");
		
		
		
		
		

	}

}
