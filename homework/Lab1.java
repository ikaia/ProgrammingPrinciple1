package homework;

import java.util.Scanner; //Scanner is in the java.util package

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a feet
		System.out.print("Please enter the value of feet: ");
		
		//Declare two double variables
		double foot = input.nextDouble();
		double meter = 0.305;
		
		//Compute meter formula
		meter = 0.305 * foot;
				
		//Display result
		System.out.println( foot + " ft converted to meters is " + meter + " m ");
					
	}
}
