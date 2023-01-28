public class revMethod{
	
	static String reverse(int number){
		String revNum= "";
		while(number != 0){
			revNum = revNum + number%10;
			number = number/10;
		}
		return revNum;
	}

	static int[] reverse(int[] numbers){
		int[] revNumArr = new int[numbers.length];
		int count = 0;
		for(int i = numbers.length-1; i>=0; i--){
			revNumArr[count] = numbers[i];
			count++; 
		}

		return revNumArr;
	}	

	public static void main(String[] args){
		int num = 37360;
		System.out.println("Reverse of " + num + " is " + reverse(num));

		int[] numbers = {96, 25, 93, 76, 75, 10, 94, 14, 5};
		System.out.print("Reverse of: ");
		for(int i = 0; i<numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}

		System.out.println();

		int[] reverseArray = reverse(numbers);
		for(int i = 0; i<reverseArray.length; i++){
			System.out.print(reverseArray[i] + " ");
		}
		System.out.println();
	}
}