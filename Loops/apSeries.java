import java.util.*;

public class apSeries {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int startNum = in.nextInt();
		
		System.out.print("Enter difference : ");
		int difference = in.nextInt();

		System.out.print("Enter n : ");
		int n = in.nextInt();

		for(int i = 1; i<=n; i++){
			System.out.print(startNum + " ");
			startNum = startNum + difference;
		}

	}
}