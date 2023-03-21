package treeMap;
import java.util.*;

public class TreeMapTut {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> students = new TreeMap<>();
		students.put(2205041, "A");
		students.put(2205066, "B");
		students.put(2019061, "C");
		students.put(2205074, "D");
		System.out.println(students);
		
		System.out.println(students.get(students.ceilingKey(1034035)));
		System.out.println(students.get(students.floorKey(2205040)));
	}

}
