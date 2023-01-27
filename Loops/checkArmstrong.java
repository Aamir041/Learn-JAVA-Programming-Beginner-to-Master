import java.util.*;

public class checkArmstrong{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();

// finding length of number
		int numLength = 0;
		int tempNum = number;
		while(tempNum != 0){
			numLength++;
			tempNum = tempNum/10;
		}


		int sum = 0;
		int tempNum2 = number;
		int tempSum = 1;
		int digit;
		while(tempNum2 != 0){
			digit = tempNum2%10;
			for(int i= 1; i<=numLength; i++){
				tempSum = tempSum * digit;
			}
			sum = sum + tempSum;
			tempSum = 1;
			tempNum2 = tempNum2/10;
		}

		if(number == sum){
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is not Armstrong");
		}



	}
}