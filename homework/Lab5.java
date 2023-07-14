package homework;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);

		//Prompt User to Input Digit For A
		System.out.print("Enter value for a: ");
		int num1 =  input.nextInt ();

		//Prompt User to Input Digit For B
		System.out.print("Enter value for b: ");
		int num2 =  input.nextInt ();

		//Prompt User to Input Digit For C
		System.out.print("Enter value for c: ");
		int num3 =  input.nextInt ();

		//Prompt User to Input Digit For D
		System.out.print("Enter value for d: ");
		int num4 =  input.nextInt ();

		int larger = max(num1,num2);
		System.out.println("The larger of a and b is " + larger);
		
		int largestOfThree = max(num1,num2,num3);
		System.out.println("The largest of a, b, and c is " + largestOfThree);
		
		int largestOfFour = max(num1,num2,num3,num4);
		System.out.println("The largest of a, b, c and d is " + largestOfFour);
		
	}

	public static int max (int num1, int num2) {
		int result;

		if(num1 > num2)
			result = num1;
		else
			result = num2;

		return result;	
	

	}

	public static int max (int num1, int num2, int num3) {
		
		return max(max(num1, num2), num3);

	}
	
	public static int max (int num1, int num2, int num3, int num4) {
		return max(num1, max(num2, max(num3, num4)));

	}
	

}