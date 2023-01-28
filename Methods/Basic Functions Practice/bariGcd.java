import java.util.*;

public class bariGacd{

// abdul baris approach of gcd way better than mine
	
	static int gcd(int m, int n){
		while(m != n){
			if(m > n){
				m = m - n;
			}
			else {
			    n = n - m;	
			}
		}
		return m;
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