package homework;

import java.util.Scanner;

public class classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//Prompting the user to enter number of lines
		System.out.println("Enter an integer input (ranging from 2 to 9): ");
		int number = input.nextInt();
		
	      // Print lines	
	      for (int row = 1; row <= number; row++) {
	      // Column Number
	      int p = 1;
	      // Print number_of_lines – row) leading spaces
	      for (int column = 1; column <= number - row + 1; column++)
	      // Print column number increasing by row
	      System.out.print(p++ + "");

	      // Start a new line
	      System.out.println();
	      
	    }
		
	}

}
