import java.util.*;

public class findSum{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number =  in.nextInt();

		int i = 1;
		int whileSum = 0;
		while(i<=number){
			whileSum = whileSum + i;
			i++;
		}

		System.out.println("Using while-loop sum is: " + whileSum);

		int forSum = 0; // :|
		for(int j = 1; j<= number; j++){
			forSum = forSum + j;
		}

		System.out.println("Using for-loop sum is: " + forSum);

	}
}