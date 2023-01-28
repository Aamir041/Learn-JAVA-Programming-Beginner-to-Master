import java.util.*;

public class delNum{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter length of array: ");
		int length = in.nextInt();

		int[] numbers = new int[length];
		
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

		System.out.print("Enter number you wanna delete: ");
		int delNum = in.nextInt();

		int index=0;

		for(int i = 0 ; i<lastIndex; i++){
		    if(delNum == numbers[i]){
		    	index = i;
		    	break;
		    }	
		}

		for(int i = index; i<lastIndex; i++){
			numbers[i] = numbers[i+1]; 
		}

		lastIndex--;

		for(int i = 0; i<lastIndex; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}