//lex_auth_01289618234504806414
//do not modify the above line

package bubblesortexercise1;

public class Tester {
	static int noOfSwaps = 0;
	static int noOfPasses = 0;

	public static void swap(int[] elements, int firstIndex, int secondIndex) {
		int temp = elements[firstIndex];
		elements[firstIndex] = elements[secondIndex];
		elements[secondIndex] = temp;
		
	}

	public static int bubbleSort(int[] elements) {
		int sizeList = elements.length-1; 
		
		int noOfPasses = 0;
		
		for(int i = 0; i < sizeList; i++) {
			boolean flag = false;
			noOfPasses++;
			for(int j = 0 ; j < (sizeList - i); j++){
				
				if (elements[j] > elements[j+1] ) {
					
					swap(elements, j, j+1);
					flag = true;
					
				}
			}
			if(flag == false) {
				
				break;
			}
		}
	
		return noOfPasses;
	}

	public static void displayArray(int[] elements) {
		for (int element : elements)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] elements = { 23, 67, 45, 76, 34, 68, 90 };

		System.out.println("Given array:");
		displayArray(elements);

		int noOfPasses = bubbleSort(elements);

		System.out.println("==========================");
		System.out.println("Total number of passes needed to sort the array: " + noOfPasses);
		System.out.println("==========================");

		System.out.println("Array after sorting:");
		displayArray(elements);

	}
}