package arrayList;
import java.util.*;

public class IteratorTut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array List Size: ");
		int size = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i<size; i++) {
			System.out.print("Enter Number: ");
			int x = sc.nextInt();
			al.add(x);
		}
		
//      printing using lambda expression 
		al.forEach(x -> System.out.print(x+ " "));
		
// Using Iterator
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		for(Iterator it = al.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
		}
		
		
//		List Iterator
		ListIterator lit = al.listIterator();
		while(lit.hasNext()) {
			System.out.print(lit.next()+" ");
		}
		
//		Printing in reverse Order using list iterator
		
		ListIterator revLit = al.listIterator(al.size());
		
		while(revLit.hasPrevious()) {
			System.out.print(revLit.previous()+" ");
		}
		
//		Only prints numbers in array list which are > 10 using lambda expression
		al.forEach(n -> show(n));
		
		
	}

/**
 * Only Prints numbers which are  > than 10
**/
	static void show(int n) {
		if(n >10) System.out.println(n);
	}

}
