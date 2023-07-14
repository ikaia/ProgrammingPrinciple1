//Ikaia Melton
//March 23 2022
//Dr. Lixin Li
//Desription: Finding the distance between the centers of two circles

package homework;

public class Circle {
	// The radius of this circle, and the x & y coordinates of the circle center
	private double radius; 
	private double centerX;
	private double centerY;
	private int x;
	private int y;
	//Construct a circle object
	public Circle (double radius, double centerX, double centerY) {
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	//Construct a circle object
	public Circle() {
		this (1.0, 1.0, 1.0);
	}
	//First getRadius() method
	double getRadius() {

		return radius;

	}
	//Second getCenterX() method
	double getCenterX() {

		return centerX;

	}
	//Third getCenterY() method
	double getCenterY() {

		return centerY;

	}
	//First setRadius() method
	double setRadius (double radius1) {

		radius = radius1;
		return radius;
	}
	//Second setCenterX() method
	public double setCenterX (double centerX1) {

		centerX = centerX1;
		return centerX;
	}
	//Third setCenterY() method
	public double setCenterY (double centerY1) {

		centerY = centerY1;
		return centerY;
	}

	//Instance method that is passed a reference variable for a circle object and returns the distance between the circle
	public double distance (Circle c) {
		return Math.sqrt((Math.pow((c.getCenterX() - centerX),2) + Math.pow((c.getCenterY() - centerY),2)));
	}


}