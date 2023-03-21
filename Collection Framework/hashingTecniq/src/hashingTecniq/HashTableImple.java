package hashingTecniq;
import java.util.*;

public class HashTableImple {

	public static void main(String[] args) {
		int[] hashT = new int[16];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements to added in hash table:");
		int nums = sc.nextInt();
		
		if(nums > 12){
			System.out.println("Add number less than 12");
			return ;
		};
		
		for(int i=0;i<nums; i++) {
			System.out.print("Enter number: ");
			int number = sc.nextInt();
			hashT[calcIndex(number)] = number;
		}
		
		for(int x: hashT) {
			if(x!=0) {
				System.out.print(x+" ");
			}
		}
		System.out.println();
		
	}

	static int calcIndex(int number) {
		return number%10;
	}

}
