package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt(); // number of customers
		
		for (int i=0; i<count; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int totalItems = scan.nextInt();
			
			double totalCost = 0;
			
			for (int w=0; w<totalItems; w++) {
			int numItems = scan.nextInt();
			String itemName = scan.next();
			double itemCost = scan.nextDouble();
			double totalPrice = numItems*itemCost;
			
			totalCost = totalCost + totalPrice;
				
			}
			
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + (totalCost) );
		}
		
		
		scan.close();
	}
	
}
 