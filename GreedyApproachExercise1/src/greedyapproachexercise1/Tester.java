//lex_auth_0129472348081602561273
//do not modify the above line

package greedyapproachexercise1;

public class Tester {
	public static int findMaxActivities(int start[], int finish[]) { 
        int cont = 0 ;
        
        int tempStart = start[1] ;
        int tempEnd = finish[0];
        

		for(int i = 0; i < start.length; i++) {
			
			
			if(tempEnd <= tempStart ) {
				cont++;
				tempStart = start[i+1];
				tempEnd = finish[i];
			}
			
		}
		
		return cont;
	} 
	       
	public static void main(String[] args) { 
        int start[] =  {1, 3, 0, 5, 8, 5}; 
    	int finish[] =  {2, 4, 6, 7, 9, 9};
    	    
    	System.out.println("Maximum number of activities: "+findMaxActivities(start, finish)); 
    }
}
