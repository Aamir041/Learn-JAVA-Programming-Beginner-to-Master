package hashSet;
import java.util.*;
public class HashSetTut {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(20,0.50f); // takes initial capacity and loading factor
		hs.add(12);
		hs.add(55);
		hs.add(15);
		hs.add(555);
		hs.add(13);
		hs.add(45);
		hs.add(122);
		hs.add(26);
		
		for(Iterator<Integer> it = hs.iterator(); it.hasNext(); ) {
			System.out.print(it.next()+" ");
		}

	}

}
