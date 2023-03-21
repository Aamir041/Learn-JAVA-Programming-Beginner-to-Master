package linkedHashMap;

import java.util.*;



public class linkedHashMapTut {

	public static void main(String[] args) {
		
//		Implementing LinkedHashMap on basis of order access
		
//		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true);
//		lhm.put(1,"A");
//		lhm.put(2,"B");
//		lhm.put(3,"C");
//		lhm.put(4,"D");
//		lhm.put(5,"E");
//		String res = lhm.get(2);
//		res = lhm.get(4);
//		lhm.forEach((k,v) -> System.out.println(k+" "+v));
		
//		Fixing Number of entries based on insertion order
//		to Fix number of entries we need over rideremovedEldestEntry(Map.Entry e) method 
		
//		LinkedHashMap<Integer,String> llhm = new LinkedHashMap<>(5) {
//			protected boolean removeEldestEntry(Map.Entry e) {
//				return size()>5;
//			}
//		};
//		
//		llhm.put(1,"A");
//		llhm.put(2,"B");
//		llhm.put(3,"C");
//		llhm.put(4,"D");
//		llhm.put(5,"E");
//		llhm.put(6,"F");
//		
//		llhm.forEach((k,v) -> System.out.println(k+" "+v));
		
//		Fixing Number of entries based on access order
//		to Fix number of entries we need over rideremovedEldestEntry(Map.Entry e) method 
		
		LinkedHashMap<Integer,String> llhm2 = new LinkedHashMap<>(5,0.75f,true) {
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		};
		
		llhm2.put(1,"A");
		llhm2.put(2,"B");
		llhm2.put(3,"C");
		llhm2.put(4,"D");
		llhm2.put(5,"E");
		llhm2.put(6,"F");
		String res = llhm2.get(2);
		res = llhm2.get(4);
		
		
		llhm2.forEach((k,v) -> System.out.println(k+" "+v));		
		
		

	}

}
