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
		
		for (int w=0; w<customerCount; w++) {
			String firstName = scan.next(); // scans for first name
			String lastName = scan.next(); // scans for last name
			customerNames[w] = firstName + " " + lastName; // stores first and last name into array
			
			int itemNumCustomer = scan.nextInt(); // how many different items customer bought
			
			for (int y=0; y<itemNumCustomer; y++) {
				int numBought = scan.nextInt(); // scans how many of item was bought
				String itemName = scan.next(); // scans name of item bought
				
				for (int z=0; z<storeTotal; z++) {
					if (itemName.equals(storeItemName[z]) ) 
	                {customerPaid[w] += (numBought * storeItemPrices[z]);}
				}

			}

			//System.out.println(customerNames[w] + " " + String.format("%.2f", customerPaid[w]));
		}
		double max = findValueMax(customerPaid);
		//System.out.println(String.format("%.2f",max));
		double min = findValueMin(customerPaid);
		//System.out.println(String.format("%.2f",min));
		double sum = calculateValueSum(customerPaid);
		//System.out.println(String.format("%.2f", ((double) sum) / ((double) customerCount)));
		
		for (int g=0; g<customerCount; g++) {
			if (max == customerPaid[g] ) {
				System.out.println("Biggest: " + customerNames[g] + " " + "(" + String.format("%.2f",max) + ")");
			}
		}
		for (int g=0; g<customerCount; g++) {
			if (min == customerPaid[g] ) {
				System.out.println("Smallest: " + customerNames[g] + " " + "(" + String.format("%.2f",min) + ")");
			}
		}
		System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) customerCount)));
		
		scan.close();
		
		
}

	static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}

	/* findValueMax
	 * Finds and returns the maximum value in an array of integers
	 * 
	 * Input: array of integers vals
	 * 
	 * Output: maximum value found within the array
	 * 
	 * Preconditions:
	 * Input array must not be null and must contain at least one value.
	 */
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}

}
