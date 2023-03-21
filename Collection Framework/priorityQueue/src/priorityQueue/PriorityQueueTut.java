package priorityQueue;
import java.util.*;

class MyComp implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2) {
		if(o1 < o2) return 1;
		if(o2 > o1) return -1;
		return 0;
	}
}

public class PriorityQueueTut {
	
	public static void main(String[] args) {
		
//		Default Priority Queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(7);
		pq.add(3);
		pq.add(15);
		pq.add(42);
		pq.add(12);
		pq.add(27);
		pq.add(99);
		
		System.out.println("This is head element: "+pq.peek());
		pq.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		pq.poll();
		System.out.println("After head element removed.");
		pq.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		pq.poll();
		System.out.println("After head element removed.");
		pq.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
//		Implementing Priority Queue where bigger the number bigger the priority
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(new MyComp());
		pq2.add(27);
		pq2.add(7);
		pq2.add(3);
		pq2.add(15);
		pq2.add(42);
		pq2.add(12);
		
		
		System.out.println("This is head element: "+pq.peek());
		pq2.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		pq2.poll();
		System.out.println("After head element removed.");
		pq2.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		pq2.poll();
		System.out.println("After head element removed.");
		pq2.forEach(x -> System.out.print(x+" "));
		System.out.println();

	}

}
