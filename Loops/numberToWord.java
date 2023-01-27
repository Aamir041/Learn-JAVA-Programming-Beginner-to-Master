import java.util.*;

public class numberToWord{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();

		String numStr = "";

		while(true){
			numStr = numStr + (number%10);
			number = number / 10;
			if(number == 0){
				break;
			}

		}

		String numWord = "";

		for(int i =numStr.length()-1; i>=0; i--){
			switch(numStr.charAt(i)){
			    case '0' : numWord = numWord + "zero ";
			    	       break;
			    case '1' : numWord = numWord + "one ";
			    	       break;
			    case '2' : numWord = numWord + "two ";
			    	       break;
			    case '3' : numWord = numWord + "three ";
			    	       break;
			    case '4' : numWord = numWord + "four ";
			    	       break;
			    case '5' : numWord = numWord + "five ";
			    	       break;
			    case '6' : numWord = numWord + "six ";
			    	       break;
			    case '7' : numWord = numWord + "seven ";
			    	       break;
			    case '8' : numWord = numWord + "eight ";
			    	       break;
			    case '9' : numWord = numWord + "nine ";
			    	       break;
			    default : break;  

			}	
		}
		System.out.println(numWord);
	}
}