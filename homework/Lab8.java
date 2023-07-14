package homework;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// Creating a new array using user input with the inputScores
		//method
		double[] scores = inputScores(5); // Enter any input array size
		//for testing
		// Displaying results
		System.out.println("The number of scores above average is: " + highScoreCount(scores));
	}
	public static double[] inputScores(int size) {
		// Please use only one scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter " + size + " scores in the array you want to make: \n");

		double [] arr = new double [size];


		for (int i=0; i < size; i++) {

			System.out.println("Please enter a score");

			arr [i] =input.nextDouble();

		}
		return arr;
	} 
	public static int highScoreCount(double[] scores) {

		double sum = 0;

		for (int i=0; i < scores.length; i++) {
			sum += scores[i];

		}

		double divide = sum/scores.length;

		int count = 0;

		for (int i=0; i < scores.length; i++) {

			if (scores [i] >= divide) {
				count++;
			}

		} return count;
	}


}