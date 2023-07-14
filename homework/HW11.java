package homework;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
import brandon.math.Math;
import brandon.math.Random;

/* Ikaia Melton
 * Dr.Lixin Li
 * 04/24/2022

 Write a program to create a file named hw11.txt if the file does not exist (If the file exists, terminate
your program without doing anything.) Write ten integers ranging [0, 99] created randomly into
the file using text I/O. Integers are separated as shown in the output below. Read the data back
from the file and display them on the console.

 *In the same program, create a file named hw11_scale.txt if it does not exist (If the file exists,
terminate your program without doing anything.). Multiply all the numbers from hw11.txt by 10
and save all the new numbers in hw11_scale.txt. For example, if hw11.txt is */

public class HW11 {

	public static void main (String [] args) throws Exception {

		//PART A
		java.io.File file = new java.io.File("hw11.txt");
		if (file.exists()) {
			System.exit(0);
		}
		

		//Create variables to be executed 
		int num;
		int num1;
		

		//Intiazle a object to become a random 
		Random random = new Random();
		try 
		{

			//Create a file
			java.io.PrintWriter output = new java.io.PrintWriter("hw11.txt");

			//Create 10 integers that inclusive(0) and exlusive (100)
			

			for (int i = 0; i < 10; i++) {
				int number = (int)(Math.random()*100);
				output.println(number);

			}

			//End stream
			output.close();
			FileWriter output1 = new FileWriter("hw11_scale.txt");

			//Create a file object for hw11.txt and new Scanner
			File file1 = new File("hw11.txt");
			Scanner input = new Scanner(file1);
			while(input.hasNextLine())

			{
				String integer = input.nextLine();
				num1 = Integer.parseInt(integer)*10;
				output1.write(num1 + "\n");

			}
			//End another stream
			output1.close();
			input.close();

			//PART B
			File file2= new File("hw11_scale.txt");
			if (file2.exists()) {
				System.exit(0);

			}

			Scanner input2 = new Scanner(file2);
		
			System.out.println("Then hw11_scale.txt should be: ");
			
			while(input2.hasNextLine())

			{

				String integer1 = input2.nextLine();
				num1 = Integer.parseInt(integer1);
				System.out.println(num1);

			}

			input2.close();
		}
		//Add I/OException 
		catch(IOException e)

		{

			e.printStackTrace();

		}

	}

}
