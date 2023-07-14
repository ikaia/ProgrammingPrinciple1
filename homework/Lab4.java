package homework;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//Prompting the user to enter number of lines
		System.out.println("Enter an integer input (ranging from 2 to 9): ");
		int number = input.nextInt();
		
	      // Create Lines For Row Increasing By Number Input	
	      for (int row = 1; row <= number; row++) {
	      // Variable For Result
	      int starter = 1;
	      // Create Lines For Column And to Form The Upside Triangle
	      for (int column = 1; column <= number - row + 1; column++)
	      // Result
	      System.out.print(starter++ + "");

	      // Start A New Line
	      System.out.println();
	      
	    }
		
	}

}
