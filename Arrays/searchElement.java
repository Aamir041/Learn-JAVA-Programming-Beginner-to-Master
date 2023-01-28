import java.util.*;

public class searchElement{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = in.nextInt();
		int index = -1;
		
		int[] numbers = {87, 69, 31, 89, 10, 31, 29};

		for(int i = 0; i<numbers.length; i++){
			
			if(num == numbers[i]){
				index = i;
				break;
			}

		}

		if(index != -1){
			System.out.println(num + " found at index number " + index);
		}
		else{
			System.out.println("Number not found");
		}

	}

}