import java.util.*;

public class printDigit{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = in.nextInt();

		int temp = 0;

		while(number != 0){
			temp = number%10;
			System.out.println(temp);
			number = number/10;
		}

	}
}