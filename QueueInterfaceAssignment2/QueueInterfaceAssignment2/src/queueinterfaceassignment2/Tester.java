//lex_auth_012990567642791936229
//do not modify the above line

package queueinterfaceassignment2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Tester {
	
	public static Deque<Character> updateStack(Deque<Character> inputStack) {
		
		int sizeList = inputStack.size();

		for (int contador = 0 ;contador <  sizeList ; contador++) {
			
			if(contador > sizeList-3) {
				inputStack.add(inputStack.remove());
			}

		}
		
		return inputStack;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
	
}