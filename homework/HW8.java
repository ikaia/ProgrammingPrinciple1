//Ikaia Melton
//Dr. Lixin Li (Section D)
//March 25 2022
//Storing five interger in an int array

package homework;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {

		//Create an array that store five integers 
		int[] array = new int[5];

		//Scanner for reading numbers
		Scanner input = new Scanner (System.in);

		System.out.println ("Please enter 5 integers in the array of your choice : ");
		//For loop five times
		for (int i = 0; i < 5; i++)
		{
			System.out.println ("Please enter an integer ");

			//Read the five integers
			int temp = input.nextInt ();

			//Store array in temporarily variable 
			array[i] = temp;
		}

		System.out.print ("The elements of the array are : ");
		for (int i = 0; i < 5; i++)
		{
			//Print the array using for loop
			System.out.print (array[i] + " ");   

		}
		 //Print the length array using .length
		System.out.println ("\nThe length of the array is: " + array.length);  
	}
}
