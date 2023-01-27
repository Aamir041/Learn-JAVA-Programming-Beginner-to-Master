import java.util.*;

public class fibbonaciSeries{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int firstTerm = 0;
		int secondTerm = 1;
		int finalTerm ;
		System.out.print("Enter terms: ");
		int n = in.nextInt();

		
		for(int i = 0; i<=n; i++){
			if( i == 0){
				System.out.print(firstTerm + " ");
			}
			else if(i == 1){
				System.out.print(secondTerm + " ");
			} 
			else{
				finalTerm = firstTerm + secondTerm;
				System.out.print(finalTerm + " ");
				firstTerm = secondTerm;
				secondTerm = finalTerm;	
			}
			
		}
	}
}