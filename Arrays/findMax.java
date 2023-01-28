public class findMax{
	public static void main(String[] args){
		
		int[] numbers = {3, 4, 1, 9, 6, 10, 0, 5, 2, 4};
		int max=numbers[0];

		for(int i = 1; i<numbers.length-1; i++){
			if(max < numbers[i]){
				max = numbers[i];
			}
		}

		System.out.println(max);
	}
}