/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that sorts 2 integers that uses a if else statement.) <br />
 * Due: 1/28/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
 */

package homework;

import java.util.Scanner; 

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter a radius
	    System.out.print("Please Enter Integer: ");
	    
	    // Declare variable
	    int integer=input.nextInt();
	    
	    //Compute if statement
	  
	   if (integer % 6 == 0 && integer % 5 == 0){
			System.out.println( integer + " is divisible by both 5 and 6." ); 
			}
			else if (integer % 5 == 0 && integer % 6 != 0) {
				System.out.println( integer + " is divisible by 5 but not 6." ); 
				}
	    		else if (integer % 6 == 0 && integer % 5 != 0) {
	    				System.out.println( integer + " is divisible by 6 but not 5." ); 
	    				}
	    			else {
	    					System.out.println( integer + " is divisible by neither 5 nor 6.");
	    				}
		
		}

}
