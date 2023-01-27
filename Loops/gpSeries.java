import java.util.*;

public class gpSeries{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int a = in.nextInt();
		
		System.out.print("Enter factor : ");
		int factor = in.nextInt();

		System.out.print("Enter n : ");
		int n = in.nextInt();

		for(int i = 1; i<=n; i++){
			System.out.print(a + " ");
			a = a * factor;
		}
	}
}