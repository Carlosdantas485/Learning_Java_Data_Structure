//lex_auth_012944366422147072548
//do not modify the above line

package divideandconquerexercise1;

public class Tester {
	public static int[] getMaxMin(int arr[], int low, int high) {
		
		int first = arr[0];
		int lest = arr[0];
		
		int nemList[] = new int[2];
		
		for(int num : arr) {
			
			
			if (num < first ) {
				nemList[1] = num;
				
			}
			else if(num > lest){
				
				nemList[0] = num;
				
			}
		}
		
		
		return nemList;
	}

	public static void main(String args[]) {
		int arr[] = { 1000, 10, 5, 1, 2000 };

		int[] maxMin = getMaxMin(arr, 0, arr.length - 1);

		System.out.println("Minimum value is " + maxMin[1]);
		System.out.println("Maximum value is " + maxMin[0]);
	}
}
