/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that gets the inputs of a radius, length, volume and area of a cylinder) <br />
 * Due: 1/24/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
 */

package homework;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please input a value for radius: ");
				
		// Create a Scanner object
		Scanner input = new Scanner (System.in);
		
		//Displaying prompting message for radius input
		double radius = input.nextDouble();

		// Declare a constant
		final double PI = 3.14159;
	    
	    //Display result for length
	  	System.out.print("Please input a value for length: ");

	  	//Displaying prompting message for length input
	  		double length = input.nextDouble();
	  		
	  	//Compute formula
		    double area = radius * radius * PI;
		    double volume = area * length;
		    	
		//Display result for area
		System.out.println("The area of the cylinder is " + area + " units squared. ");
		
		//Display result for volume
		System.out.println("The volume of the cylinder is " + volume + " units cubed. ");
				
	}
}
