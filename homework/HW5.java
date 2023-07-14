
//Ikaia Melton
//Dr.Lixin Li  Class Section (D)
//2/25/2022
//This programs runs the mean and standard deviation using random numbers.

package homework;
import brandon.math.Random;
import brandon.math.Math;

public class HW5 {

		 /** Main method */
		public static void main(String[] args) {
		
			// Find mean
			double meanValue = mean(99, 1000);
		 
			// Find standard deviation
			double deviationValue = deviation(99, 1000);
		 
			// Display result
			System.out.println("The mean is " + meanValue);
			System.out.println("The standard deviation is " + deviationValue);
		 
		}
		public static double mean (int boundary, int n) {
			int number = 0;
			double sum = 0;
			
			 // Total numbers // Create numbers, find its sum, and its square sum
		     for (int i = 0; i < n; i++) {
			      // Generate a new random number
			      number = (int)(Math.random() *(boundary + 1));

			      // Add the number to sum
			      sum += number;
		 }
		    
		    	double meanValue = sum / n;
		    	return meanValue;
		    
		 }
		 public static double deviation (int boundary, int n) {
			int number = 0; // Store a random number // Total numbers
			double squareSum = 0; // Store the sum of the squares
			double sum = 0;
			
			// Create numbers, find its sum, and its square sum
		    for (int i = 0; i < n; i++) {
		    	// Generate a new random number
		    	number = (int)(Math.random() * (boundary + 1));

		    	// Add the square of the number to squareSum
		    	squareSum += Math.pow(number, 2); // Same as number*number;
		     
		    	// Add the number to sum
		    	sum += number;
			 
		  }
		  double deviation = Math.sqrt((squareSum - sum * sum / n) / (n - 1));
		  return deviation;
			  
				 
			
		  }
}


	


		
		    	