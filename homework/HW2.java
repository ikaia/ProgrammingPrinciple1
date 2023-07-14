/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that determine whether to speed up on a
particular assignment or not.) <br />
 * Due: 1/31/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
 */
package homework;

import java.util.Scanner;

public class HW2 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner myinput = new Scanner (System.in);
			
			//Prompt user for days
			System.out.print("How many days do you have left to do your assignments? ");
			int day = myinput.nextInt();
			
			 //Prompt user for assignments
		  	System.out.print("How many assignments do you have total? ");
		  	int assignments = myinput.nextInt();
		  	
		  	 //Prompt user for temperature 
		  	System.out.print("Is it raining? (true/false) ");
			
		  	
		  	 //Prompt user for raining 
		  	System.out.print("What is the temperature outside? ");
		  	double temperature = myinput.nextInt();
		  	
		  	//Boolean method 
		  	boolean result=
		  	      (day < 5) || (assignments > 4) || ((temperature < 50) && (isRaining == true));

		  	//Results 
		  	System.out.println("Should you speed up doing your work? " + result);
	}

}
