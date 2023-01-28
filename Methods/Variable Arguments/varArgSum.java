// varable argument summation

public class varArgSum{

	static int sum(int ...nums){
		int s = 0;
		for(int num : nums){
			s = s + num;
		}

		return s;
	}

	public static void main(String[] args){
		System.out.println(sum(1,2,3));
	}
}