public class Main {
	
	public static int[] getMaxMin(int arr[], int low, int high) { 
	    //Implement your logic here and change the return statement accordingly
	    return null;
	}
	
	public static void main(String[] args) {
		int arr[] = {1000, 10, 5, 1, 2000}; 

	    int[] maxMin = getMaxMin(arr, 0, arr.length - 1);
	    
	      System.out.println("Minimum value is "+ maxMin[1]); 
	 	  System.out.println("Maximum value is "+ maxMin[0]);
	}
}

// saida [2000, 1]