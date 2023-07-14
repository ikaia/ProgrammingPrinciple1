/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that prompts the user to solve ten multiplication problems.) <br />
 * Due: 2/18/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
   
 */
package homework;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-Generated Method Stub

		//Number Of Questions To Asks
		final int numberofquestions = 10;
		int correctCount = 0;
		int count = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Would you like to practice your multiplication tables? (Answer 'true' or 'false'.)");
		boolean num = input.nextBoolean (); 
		
		//If True The User Continue To Practice
		while (num == true) {
			System.out.println("Please enter a number from 1-10 to begin practicing.");
			int number = input.nextInt ();
		
		//Prompt The User The Question
			for (int i = 1; i <= 10; i++) {
				System.out.println("What does " + number + " * " + i + " equal?");
				int answer = input.nextInt();
		
		//If Not Incorrect Repeat Question Till Correct	
				while (number * i != answer) {
			
					System.out.println("Try again.");
		
					System.out.println("What does " + number + " * " + i + " equal?");
					answer = input.nextInt();
				}
		
				System.out.println("Correct.");
				correctCount++;	
			}
		//Prompt User To Continue or Not
			System.out.println("Would you like to practice your multiplication tables? (Answer 'true' or 'false'.)");
			num = input.nextBoolean (); 
		
		}
		//Input Goodbye For User To Stop
		System.out.print("Goodbye.");
			
	}
}		
	

	

