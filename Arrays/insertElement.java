import java.util.*;

public class insertElement{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int[] numbers = new int[9];
		
		System.out.print("Till where you wanna enter number: ");
		int lastIndex = in.nextInt();

		for(int i=0; i<lastIndex; i++){
			System.out.print("Enter number: ");
			numbers[i] = in.nextInt();
		}

		for(int i = 0; i<lastIndex; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		System.out.print("Enter number: ");
		int num = in.nextInt();

		System.out.print("Enter index: ");
		int index = in.nextInt();


		for(int i =lastIndex+1 ; i>= index+1; i--){
			numbers[i] = numbers[i-1];
		}

		numbers[index] = num;

		for(int i = 0; i<lastIndex+1; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

	}
}