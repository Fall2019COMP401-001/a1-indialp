package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int storeTotal = scan.nextInt(); // scans number of items at store
		String storeItemName[] = new String[storeTotal]; // creates array for all store items
		double storeItemPrices[] = new double[storeTotal]; // creates array for all store item prices

		for (int i=0; i<storeTotal; i++) {
			String itemNameScan = scan.next(); // scans for string item
			storeItemName[i] = itemNameScan;
			
			double storePriceScan = scan.nextDouble(); // scans for double price
			storeItemPrices[i] = storePriceScan;
		}
		
		

		int customerCount = scan.nextInt(); // scans for total num of customers
		
		int customerCounterTrue[] = new int[storeTotal];
		int totalFoodBought[] = new int[storeTotal]; // array for how much of eat food was bought
		
		String customerNames[] = new String[customerCount]; // array for customer name
		double customerPaid[] = new double[customerCount]; // array for how much each customer paid
		
		for (int w=0; w<customerCount; w++) {
			String firstName = scan.next(); // scans for first name
			String lastName = scan.next(); // scans for last name
			customerNames[w] = firstName + " " + lastName; // stores first and last name into array
			
			int itemNumCustomer = scan.nextInt(); // how many different items customer bought
			int customerCounter[] = new int[storeTotal]; // array for how many customers bought an item
			
			
			for (int y=0; y<itemNumCustomer; y++) {
				int numBought = scan.nextInt(); // scans how many of item was bought
				String itemName = scan.next(); // scans name of item bought
				
				for (int z=0; z<storeTotal; z++) {
					if (itemName.equals(storeItemName[z]) ) 
	                {customerCounter[z] += 1 ;
	                totalFoodBought[z] += numBought;
	                if (customerCounter[z] == 1) {customerCounterTrue[z] += 1;}}
					
				}
			}
			}
		
			for (int k=0; k<storeTotal; k++) {
				if (customerCounterTrue[k] == 0) {System.out.println("No customers bought " + storeItemName[k]);}
				else {System.out.println(customerCounterTrue[k] + " customers bought " + totalFoodBought[k] + " " + storeItemName[k] );	}
			}
		
		
		scan.close();
	}}

