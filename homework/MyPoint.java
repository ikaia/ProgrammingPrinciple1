//Ikaia Melton
//


package homework; 

public class MyPoint {


	//Two double private data fields named x and y that specify the coordinates of a point
	private double x;
	private double y;

	//A pubic no-arg constructor that creates a default point (0, 0).
	public MyPoint() {
		x=0;
		y=0;

	}

	//A pubic constructor that creates a point with specified x and y coordinates.
	public MyPoint(double x1, double y1) {

		x = x1;
		y = y1;

	}


	//First getX() method
	double getX() {

		return x;

	}

	//First getY() method
	double getY() {

		return y;

	}

	//Second setX() method
	public double setX (double X1) {

		x = X1;
		return x;
	}
	//Third seTY() method
	public double setY (double Y1) {

		y = Y1;
		return y;
	}

}


