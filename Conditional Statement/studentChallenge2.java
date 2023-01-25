import java.util.*;

public class studentChallenge2{
	public static void main(String[] args){

// Find radix of a given String

		Scanner in = new Scanner(System.in);
		System.out.printf("Enter number: ");
		String num = in.next();

		if(num.matches("[01]+")){
			System.out.printf("Number is binary, Radix is 2.\n");
		}

		else if(num.matches("[0-7]+")){
			System.out.printf("Number is octal, Radix is 8.\n");
		}

		else if(num.matches("[0-9A-F]+")){
			System.out.printf("Number is hexadecimal, Radix is 16.\n");
		}
		else if(num.matches("[0-9]+")){
			System.out.printf("Number is decimal, Radix is 10.\n");
		}


// Find if a given year is leap year or not
// a leap year should be divisible by 4,  400 and not be divisible by 100

        System.out.printf("Enter year: ");
        int year = in.nextInt();
        if(year%4 == 0){
        	if(year%100 == 0){
        		if(year%400 == 0){
        			System.out.printf("It is a Leap year\n");
        		}
        		else{
        			System.out.printf("It is not a Leap year\n");
        		}
        	}
        	else{
        		System.out.printf("It is a Leap year\n");
        	}
        }
        else {
            System.out.printf("It is not a Leap year\n");	
        }


	}
}