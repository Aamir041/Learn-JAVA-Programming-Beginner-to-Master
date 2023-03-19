package arrayList;

import java.util.*;

public class ArrayListTut{
	
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();

		al1.add(10); // 10 --> al1
		System.out.println(al1);

		al1.add(0,20); // 20,10 --> al1
		System.out.println(al1);
		
		al2.add(11); // adding values in al2
		al2.add(22); // adding values in al2
		al2.add(33); // adding values in al2

		al3.add(14); // adding values in al3
		al3.add(24); // adding values in al3
		al3.add(34); // adding values in al3

		al1.addAll(al2);  // 20,10,11,22,33 --> al1

		al1.addAll(3,al3); // 20,10,11,14,24,34,22,33 --> al1

		System.out.println(al1);

		System.out.println(al1.contains(25)); // false
		System.out.println(al1.contains(34)); // true

		System.out.println(al1.get(2)); // 11

		System.out.println(al1.indexOf(34)); // 5
		
		al1.add(34); // 20,10,11,14,24,34,22,33 --> al1

		System.out.println(al1.lastIndexOf(34)); // 8

		al1.set(8,44);
		System.out.println(al1); // [20, 10, 11, 14, 24, 34, 22, 33, 44] --> al1
		
		Iterator<Integer> it = al1.iterator();
		
		

	}

}