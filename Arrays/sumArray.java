public class sumArray{
	public static void main(String[] args){
		int sum = 0;
		int[] numbers = {48, 36, 54, 19, 30, 95, 97};

		for(int i =0; i<numbers.length; i++){
			sum = sum + numbers[i];
		}

		System.out.println(sum);

	} 
}