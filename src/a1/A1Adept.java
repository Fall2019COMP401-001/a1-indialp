package a1;

import java.util.Scanner;

public class A1Adept {

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
		String customerNames[] = new String[customerCount]; // array for customer name
		double customerPaid[] = new double[customerCount]; // array for how much each customer paid
		
		for (int x=0; x<customerCount; x++) {
			
			String firstName = scan.next(); // scans for first name
			String lastName = scan.next(); // scans for last name
			
			customerNames[x] = firstName + " " + lastName; // stores first and last name into array
			
			int itemNumCustomer = scan.nextInt(); // scans how many diff items bought
			double customerTotal = 0; // initialize how much customer paid in total
			double totalCost = 0; // how much all the customers paid
			
				for (int y=0; y<itemNumCustomer; y++) {
				
					int numBought = scan.nextInt(); // scans how many of item was bought
					String itemName = scan.next(); // scans name of item bought
					
					//SEARCH ARRAY HERE
					for (int z=0; z<storeItemName.length; z++) {
						if (storeItemName[z] == itemName) { // finds item name in array of store items
							customerTotal = customerTotal + (storeItemPrices[z]*numBought); // how much customer has spent
						}
					}
					customerPaid[y] = customerTotal; // 
					//ADD HOW MUCH CUSTOMER SPEND TO ARRAY CUSTOMER PAID
					
				}
			
			
		}
		
		scan.close();
		
	}	
}

