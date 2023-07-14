package homework;

import java.util.Scanner;

public class TomsTrucking {
	
		/*
		 * How do we track the number of trucks?
		 * How do we track the size of each truck?
		 * How do we track the actual load in each truck?
		 */
		
		//Declare private static
		private static int numTrucks;
		
		//getNumTrucks()
		public static int getNumTrucks() {
			return numTrucks;
		}
		//setNumTrucks(int)
		public static void setNumTrucks(int numTrucks) {
			TomsTrucking.numTrucks = numTrucks;
		}
		//getMaxCapOfEachTrucks()
		public static int[] getMaxCapOfEachTruck() {
			return maxCapOfEachTruck;
		}
		//setMaxCapOfEachTruck(int)
		public static void setMaxCapOfEachTruck(int[] maxCapOfEachTruck) {
			TomsTrucking.maxCapOfEachTruck = maxCapOfEachTruck;
		}
		//getLoadOfEachTruck()
		public static double[] getLoadOfEachTruck() {
			return loadOfEachTruck;
		}
		//setLoadOfEachTruck(double)
		public static void setLoadOfEachTruck(double[] loadOfEachTruck) {
			TomsTrucking.loadOfEachTruck = loadOfEachTruck;
		}
		//declare private static
		private static int[] maxCapOfEachTruck;
		private static double [] loadOfEachTruck;
		
		
		//Test TomsTrucking.java
		public static void main(String[] args) {
			TomsTrucking.setNumTrucks(2);
			TomsTrucking.setMaxCapOfEachTruck(new int[]{10, 100});
			TomsTrucking.setLoadOfEachTruck(new double[]{5.0, 50.0});
			System.out.println(TomsTrucking.displayTruckInfo(TomsTrucking.calcPercentageOfLoad()));
			

		}
	/*	TomsTrucking.setNumTrucks(2);
		TomsTrucking.setMaxCapOfEachTruck(new int[]{10, 100});
		TomsTrucking.setLoadOfEachTruck(new double[]{5.0, 50.0});
		System.out.println(TomsTrucking.displayTruckInfo(TomsTrucking.calcPercentageOfLoad()));
		*/
		/*
		 * Task 1: Allow Tom to tell us how many trucks he has for the day 
		 */
		public static void setNumOfTrucksForTheDay() {
			Scanner scan = new Scanner(System.in);
			boolean done = false;
			while(done==false) {
				System.out.println("Please enter the number of trucks you have today");
				int num = scan.nextInt();
				if(num >= 2) {
					numTrucks = num;
					loadOfEachTruck = new double[numTrucks];
					done = true;
				}else {
					System.out.println("The number must be two or greater than two. Please try again.");
				}
			}
		}
		/*
		 * Task 2: Allow Tom to tell us the size of each truck
		 */
		public static void setTheMaxCapacityOfEachTruck() {
			maxCapOfEachTruck = new int[numTrucks];
			Scanner scan = new Scanner(System.in);
			for(int index = 0; index < maxCapOfEachTruck.length; index++) {
				System.out.println("Please enter the size of truck "+(index+1)+". Size is small or large");
				String size = scan.next();
				if(size.equalsIgnoreCase("small")) {
					maxCapOfEachTruck[index]=10;
				}else if(size.equalsIgnoreCase("large")) {
					maxCapOfEachTruck[index]=100;
				}
			}
		}
		/*
		 * Task 3: Allow Tom to tell us the actual load of each truck
		 */
		public static void setTheLoadOfEachTruck() {
			loadOfEachTruck = new double[numTrucks];
			Scanner scan = new Scanner(System.in);
	/*		int index =0;
			while(index < loadOfEachTruck.length) {
				System.out.println("Please enter the actual load of truck "+(index+1)+". The maximum number of crates allowed is "+maxCapOfEachTruck[index]);
				double load = scan.nextDouble();
				if(load <= maxCapOfEachTruck[index]) {
					loadOfEachTruck[index]=load;
					index++;
				}else {
					System.out.println("The load you entered exceeded the max capacity of truck"+(index+1)+". \nPlease reenter the actual load of truck "+(index+1)+". The maximum number of crates allowed is "+maxCapOfEachTruck[index]);
				}
			}
	*/		for(int index = 0; index <loadOfEachTruck.length; index++) {
				System.out.println("Please enter the actual of truck "+index+1+". The maximum number of crates allowed is "+maxCapOfEachTruck[index]);
				double load = scan.nextDouble();
				loadOfEachTruck[index]=load;
			}
		}
		/*
		 * Task 4: Calculate the percentage of load capacity of each truck
		 */
		public static double[] calcPercentageOfLoad() {
			double[] percOfLoad = new double[numTrucks];
			for(int index = 0; index < maxCapOfEachTruck.length; index++) {
				percOfLoad[index] = loadOfEachTruck[index]  / (maxCapOfEachTruck[index]* 1.0);
			}
			return percOfLoad;
		}
		/*
		 * Task 5: Display the information in a line for each truck. 
		 * Give the truck number, the maximum number of crates it can carry, 
		 * the actual number of crates that the truck is carry today and the percentage load capacity. 
		 */
		public static String displayTruckInfo(double[] percOfLoad) {
			String out = "";
			for(int index = 0; index < maxCapOfEachTruck.length; index++) {
				out+="Truck "+(index+1)+"- Max capacity: "+maxCapOfEachTruck[index]+", Actual load: "+loadOfEachTruck[index]+", %: "+percOfLoad[index];
				out+="\n";
			}
			return out;
		}
	}


	