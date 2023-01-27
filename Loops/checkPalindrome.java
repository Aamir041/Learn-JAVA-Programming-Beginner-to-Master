import java.util.*;

public class checkPalindrome{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();
		String revNumStr = "";
		
		int tempNum = number;
		int revNum;


		while(true){
			revNumStr = revNumStr + (tempNum%10);
			tempNum = tempNum/10;
			if(tempNum == 0){
				break;
			}
		}

		revNum = Integer.parseInt(revNumStr);
		
		if(revNum == number){
			System.out.println("Number is a Paindrome");
		}
		else{
		    System.out.println("Number is a not a Paindrome");	
		}

	}
}