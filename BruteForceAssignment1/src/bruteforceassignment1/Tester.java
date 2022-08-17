//lex_auth_012928867915259904510
//do not modify the above line

package bruteforceassignment1;

public class Tester {

	public static int[][] multiply(int arr1[][], int arr2[][]) {
		int newArray[][] = new int[2][2];
		int varAux;
		
		for( int i = 0; i < arr1.length; i++) {

			for(int j = 0; j < arr2.length; j++) {
				varAux = 0;
				for(int k = 0; k < arr2.length; k++) {
					
					varAux += arr1[i][k]*arr2[k][j];
					
					
				}
				newArray[i][j] = varAux;
			}
			
			
			
		}
		return newArray;
	}

	public static void main(String[] args) {
		int arr1[][] = new int[][] { { 2, 4 },
									 { 1, 4 } };

		int arr2[][] = new int[][] { { 1, 4 }, 
									 { 1, 3 } };

		int[][] arr3 = multiply(arr1, arr2);

		for (int index1 = 0; index1 < arr3.length; index1++) {
			for (int index2 = 0; index2 < arr3.length; index2++) {
				System.out.print(arr3[index1][index2] + " ");
			}
			System.out.println();
		}
	}
}
