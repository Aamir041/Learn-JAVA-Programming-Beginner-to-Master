import java.util.*;

public class findGcd{

// very basic method
	static int gcd(int x, int y){

		int res = 1;

		for(int i = 2; i< (x>y ? x : y) ; i++){
			if(x%i == 0 && y%i == 0){
				res = (res > i ? res : i);
			}
		}

		return res;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int num1 = in.nextInt();

		System.out.print("Enter number 2: ");
		int num2 = in.nextInt();
		int result = gcd(num1, num2);

		System.out.println("Gcd of " + num1 +","+ num2 + " is " + result);

	}
}