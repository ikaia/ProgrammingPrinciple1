package homework;

import java.util.Scanner;
import java.util.Arrays;

public class HW9 {
	
	public static void main(String[] args) {
		int[] arr1 = inputArray(8); // Enter any input array size for testing
		int[] arr2 = inputArray(8); // Enter the same input array size for
		// testing
		//Prints the average of the elements in the first array.
		System.out.println("The average of the first array provided is " + average(arr1) +
				".");
		//Creates an array that holds the value of the sums from adding the two
		//integer arrays.
		int[] resultingArray = add(arr1, arr2);
		//Prints the array with the sum of the two added integer arrays.
		displayArray(resultingArray);
	}
	
	public static int[] add(int[] arr1, int[] arr2) {
			int cat [] = new int [arr1.length];
			for (int i=0; i < arr1.length; i++) {
				cat[i] = arr1 [i] + arr2 [i];
			}
			return cat;
	}

	public static void displayArray(int[] resultingArray) {
		
		System.out.println("The sum resulting array is " +
				Arrays.toString(resultingArray));
		
	}

	public static int[] inputArray(int size) {
		//Creates an array of size provided.
		int[] inputArr1 = new int [size];

		Scanner input = new Scanner(System.in);
		//Asks user to input values for elements to be.
		System.out.println("Enter " + size + " integer values to add to the array.");


		for (int i=0; i < size; i++) {
			inputArr1 [i] = (int) input.nextDouble();
		}

		return inputArr1;

	}
	public static double average(int[] list) {

		double sum = 0;

		for (int i=0; i < list.length; i++) {
			sum += list[i];

		}
		double divide = sum/list.length;

	return divide;

	}

}



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	