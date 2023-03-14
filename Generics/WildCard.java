import java.util.*;

@SuppressWarnings("unchecked")
public class WildCard{

	static public void display(List<? extends Number> list){
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}

	}

	public static void main(String[] args) {
		// ArrayList<String> str = new ArrayList<>();
		// str.add("aaa");
		// str.add("bbb");
		// str.add("ccc");
		// display(str);
		//  array list for string wont work

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		display(nums);

		ArrayList<Double> deci = new ArrayList<>();
		deci.add(1.83);
		deci.add(2.78);
		deci.add(3.23);
		display(deci);

	}
}