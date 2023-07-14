package homework;

public class Lab6RectangleTest {

	public static void main(String[] args) {



		//Second Cylinder Object Using the Constructor with Arguments to Set Width 4.0, Height 40.0
		Rectangle r1 = new Rectangle(4.0, 40.0);

		//Third Cylinder Object w/ the No-Argument Constructor and Width to 5.0 and Height to 50.0
		Rectangle r2 = new Rectangle();
		r2.setWidth(5.0);
		r2.setHeight(50.0);

		//Print out the Width of the first cylinder
		System.out.println("The width before is " + r1.getWidth());
		//Print out the Height of the first cylinder;
		System.out.println("The height before is " + r1.getHeight());
		//Print out the Width of the second cylinder.
		System.out.println("The width after is " + r2.getWidth());
		//Print out the Height of the second cylinder;
		System.out.println("The height after is " + r2.getHeight());
		//Print out the area;
		System.out.println("The area is " + r2.getArea());
		//Print out the perimeter;
		System.out.println("The perimeter is " + r2.getPerimeter());


	}


}
