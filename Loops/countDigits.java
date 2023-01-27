import java.util.*;

public class countDigits{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();
		int count = 0;

		while(number != 0){
			count++;
			number = number / 10;
		}

		System.out.println(count);

	}
}