package homework;

public class Lab9 {

	public static void main(String[] args) {

		MyPoint [][] Array = new MyPoint[2] [3];

		Array [0] [0] = new MyPoint (0.5, 1.2);
		Array [0] [1] = new MyPoint (0.0, 3.14);
		Array [0] [2] = new MyPoint (15.0, 27.5);
		Array [1] [0] = new MyPoint (6.6, 7.7);
		Array [1] [1] = new MyPoint  (1.2, 2.1);
		Array [1] [2] = new MyPoint (12.0, 127.0);



		for (int i = 0; i < Array.length; i++) {

			for (int j = 0; j < Array[i].length; j++ ) {

				System.out.println("Array[" + i + "][" + j + "] = (" + Array[i][j].getX() + ", " + Array[i][j].getY() + ")");
			}
		}

	}

}