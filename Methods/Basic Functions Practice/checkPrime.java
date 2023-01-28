import java.util.*;

public class checkPrime{
	
	static boolean isPrime(int num){
		if(num == 2 || num == 3){
			return true;
		}
		for(int i = 2; i<=9; i++){

			if(num%i == 0 && i != num){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = in.nextInt();
		boolean result = isPrime(num);
		if(result){
			System.out.println(num + " is prime.");
		}
		else{
			System.out.println(num + " is not prime.");
		}
	}
}