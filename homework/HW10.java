package homework;


public class HW10 {
	public static void main(String[] args) {
		int[][] workHours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}
		};
		//Sum Array
		int[] sumArray = calculateSum(workHours);
		//Store Array 
		int[] indexArray = decreasingSort(sumArray);
		//Return Result of Arrays
		displayArray(indexArray, sumArray);

	}
	//Nested for loops for calculating sum
	public static int[] calculateSum (int[][] array) {
		int [] calculateSum = new int [array.length]; //May need to adjust size
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				calculateSum[i] += array[i][k];
			}

		}

		return calculateSum;

	}
	//Selection sort in Decreasing Order
	public static int[] decreasingSort (int[] array) {
		int [] decreasingSort = new int [array.length];
		
		for(int j = 0; j < array.length; j++) decreasingSort[j] = j;
		
		for (int i = 0; i < array.length; i++) {
			//Sort Here
			int currentMax = array[i];
			int currentMaxIndex = i;
			int anotherMaxIndex = i;

			for (int k=i+1; k < array.length; k++) {
				if (currentMax < array[k]) {
					currentMax = array [k];
					currentMaxIndex = k;
					anotherMaxIndex = decreasingSort[k];
				}
			}
			//Swap Method
				if (currentMaxIndex != i) {
					array[currentMaxIndex] = array[i];
					array[i] = currentMax;
					decreasingSort[currentMaxIndex] = decreasingSort[i];
					decreasingSort[i] = anotherMaxIndex;
				}
				
			}
		return decreasingSort;
	}
	
	
	public static void displayArray (int[] indexArray, int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Employee" + indexArray[i] + ": " + array[i] + " hours");	
		}
	}
}









