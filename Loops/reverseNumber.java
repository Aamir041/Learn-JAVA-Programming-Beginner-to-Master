import java.util.*;

public class reverseNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();
		String revNum = "";
		while(number != 0){
			revNum = revNum + (number%10);
			number = number /10;
		}
		System.out.println(revNum);

	}
}