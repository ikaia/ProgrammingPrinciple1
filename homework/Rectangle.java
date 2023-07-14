package homework;

public class Rectangle {

	//Private Double Data Fields 
	private double width;
	private double height;
	private double area;
	private double perimeter;

	//A No-Argument Constructor of Cylinder
	public Rectangle () {
		//Default Values of Width and Height
		width = 1.0;
		height = 1.0;

	}

	//A Constructor that Creates a Rectangle w/ Specific Width and Height
	public Rectangle (double width1, double height1) {

		width = width1;
		height = height1;

	}

	//First getWidth() 
	public double getWidth() {

		return width;
	}
	//Second getHeight()
	public double getHeight() {

		return height;
	}
	//First setWidth() method
	public double setWidth (double width1) {

		width = width1;
		return width;
	}
	//Second setHeight() method
	public double setHeight (double height1) {

		height = height1;
		return height;
	}	
	//Third getArea()
	public double getArea () {


		area = (height * width);
		return area;

	}
	//Fourth getPerimeter() 
	public double getPerimeter () {

		//Formula of perimeter
		perimeter = (height * 2) + (width * 2);
		return perimeter;

	}

}
