/**
 * Class: CSCI1301-01 Introduction to Programming Principles (Section D) <br />
 * Instructor: Dr. Lixin Lee <br />
 * Description: (Writing a program that gets the inputs of a radius, length, volume and area of a cylinder) <br />
 * Due: 1/24/2022 <br />
 * I pledge by honor that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Ikaia Melton <br />
 */
package homework;

public class HW6CylinderTest {

	public static void main(String[] args) {


		//First Cylinder Object w/ the No-Argument Constructor
		Cylinder c1 = new Cylinder();

		//Second Cylinder Object Using the Constructor with Arguments to Set Radius 2.5, Length 12.3
		Cylinder c2 = new Cylinder(2.5, 12.3);

		//Third Cylinder Object w/ the No-Argument Constructor and Radius to 5.0 and Length to 6.5
		Cylinder c3 = new Cylinder();
		c3.setRadius(5.0);
		c3.setLength(6.5);

		//Print out the radius and length of the first cylinder
		System.out.println("The radius of the first cylinder is " + c1.getRadius() + " and the length is " + c1.getLength() );
		//Print out the area of the second cylinder;
		System.out.println("The base area of the second cylinder is: " + c2.getArea());
		//Print out the volume of the third cylinder.
		System.out.println("The volume of the third cylinder is: " + c3.getVolume());
		//Print out the value of the numOfObjects data field;
		System.out.println("The amount of objects created is: " + Cylinder.getNumberOfObjects());


	}

}
