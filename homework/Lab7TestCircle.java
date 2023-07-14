package homework;

public class Lab7TestCircle {

	public static void main(String[] args) {

		//First Object w/ the No-Argument Constructor One PC
		Circle p1 = new Circle ();


		//Second Object Using the Constructor with Arguments Two Cars
		Circle p2 = new Circle (5.5, 3.5, 4.2);

		System.out.println("Circle 1's Radius: " + p1.getRadius() + "\r\n"
				+ "Circle 1's CenterX: " + p1.getCenterX() + "\r\n"
				+ "Circle 1's CenterY: " + p1.getCenterY() + "\r\n"
				+ "Circle 2's Radius: " + p2.getRadius() + "\r\n"
				+ "Circle 2's CenterX: " + p2.getCenterX() + "\r\n"
				+ "Circle 2's CenterY: " + p2.getCenterY() + "\r\n"
				+ "Distance from Circle1 to Circle2: " + p1.distance(p2));

	}

}
