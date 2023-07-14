/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that sorts 2 integers that uses a if statement and swap method.) <br />
 * Due: 1/28/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
 */

package homework;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner (System.in);
		
		//Prompt user for value num1
		System.out.print("Enter the value of num1: ");
		int num1 = myinput.nextInt();
		

		 //Prompt user for value num2
	  	System.out.print("Enter the value of num2: ");
	  	int num2 = myinput.nextInt();
	  
	
	  	//Assign if statement
	  	if (num1 >= num2) {
	  				
	  	//Swap method
		  	int temp = num1;
		  	num1 = num2;
		  	num2 = temp;
	  	}
				
	  	 //Display result for area
		System.out.println("The sorted numbers are " + num1 + " , " + num2 );
				
				
	}

}
