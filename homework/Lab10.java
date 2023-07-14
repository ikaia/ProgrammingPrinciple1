/* Ikaia Melton
 * 4/22/2022
 * Professor Lixin Li
 /* Write a program that passes an unspecified (which means 0) number of integers as command-line
	arguments (using args) to the main method and display */


package homework;

import java.util.Scanner;

public class Lab10 {

	public static void main (String [] args) {

		//The total number of integers that the user entered (which means 0)
		int sum = 0;
		//Their total
		System.out.println("You entered " + args.length + " numbers");
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("The sum of these numbers is " + sum);

	}
}
