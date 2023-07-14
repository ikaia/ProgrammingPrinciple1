package homework;

public class Classwork24th {

	public static void main(String[] args) {
		double [] myList = new double [5]; 
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)(Math.random() * 100);
		}
		
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		double max = 0;
		for (int i= 0; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[1];
		}
 		System.out.println("Max is " + max);
	}

}
