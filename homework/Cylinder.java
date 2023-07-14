/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that gets finds the radius, length, volume and area of a cylinder) <br />
 * Due: 1/24/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
 */

package homework;

public class Cylinder {


	//Private Double Data Fields 
	private double radius;
	private double length;
	private double area;
	private double volume;

	//Private Int Static Data Field of NumberOfObjects
	private static int numberOfObjects;

	//A No-Argument Constructor of Cylinder
	public Cylinder () {
		//Default Values of Radius and Length
		radius = 1.0;
		length = 1.0;

		numberOfObjects++;

	}

	//A Constructor that Creates a Cylinder w/ Specific Radius and Length
	public Cylinder (double radius1, double length1) {

		radius = radius1;
		length = length1;

		numberOfObjects++;

	}
	//First getRadius() 
	public double getRadius() {

		return radius;
	}
	//Second getLength()
	public double getLength() {

		return length;
	}
	//First setRadius() method
	public double setRadius (double radius1) {

		radius = radius1;
		return radius;
	}
	//Second setLength() method
	public double setLength (double length1) {

		length = length1;
		return length;
	}	
	//Third getArea()
	public double getArea () {


		area = Math.PI* Math.pow(radius, 2);
		return area;

	}
	//Fourth getVolume() 
	public double getVolume () {


		volume = getArea() * length;
		return volume;

	}
	//Return the Data Field NumberOfObjects
	public static int getNumberOfObjects () {

		return numberOfObjects;
	}

	
}
