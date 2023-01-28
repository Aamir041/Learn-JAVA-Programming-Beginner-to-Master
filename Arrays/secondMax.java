public class secondMax {
	public static void main(String[] args){
		
		int [] numbers = {2, 1, 7, 6, 4, 2, 9};		
		
		for(int i =  0; i<numbers.length-1; i++){

			if(numbers[i] > numbers[i+1] ){
				// swapped using xor operator
				numbers[i] = numbers[i]^numbers[i+1];
				numbers[i+1] = numbers[i]^numbers[i+1];
				numbers[i] = numbers[i]^numbers[i+1];
			}

		}

		System.out.println(numbers[numbers.length - 2]);
	}
}