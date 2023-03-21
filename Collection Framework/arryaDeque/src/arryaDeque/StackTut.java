package arryaDeque;

import java.util.*;

public class StackTut {

	public static void main(String[] args) {
	/*
		 * Stack Simply Creates Inserts at last position and deletes from first position 
	*/
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.offerLast(34);
		stack.offerLast(48);
		stack.offerLast(45);
		stack.offerLast(89);
		
//		Inserts latest element at last position of array
		stack.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		stack.pollFirst();
		stack.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		stack.pollFirst();
		stack.forEach(x -> System.out.print(x + " "));
		System.out.println();

		
	}

}
