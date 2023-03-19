package linkedList;
import java.util.*;
public class LinkedListTut {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll.peek()+" "+ll.peekFirst());
		System.out.println(ll.peekLast());
		ll.poll(); // removes 1
		ll.pollFirst(); // removes 2
		ll.pollLast(); // removes 5 
// remaining list will be 3,4
		ll.forEach(n -> show(n));
		
	}
	static void show(int n) {
		System.out.print(n+" ");
	}
}
