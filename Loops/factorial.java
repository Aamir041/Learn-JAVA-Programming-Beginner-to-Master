import java.util.*;

public class factorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();

		int factorialProduct = 1;

		for(int i = 1; i<= number; i++){
			factorialProduct = factorialProduct * i;
		}

		System.out.println("Factorial of " + number + " is " + factorialProduct);

	}
}