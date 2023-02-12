import java.util.Scanner;

public class divideNumbers{
	
	public static void main(String[] args) {
		
		try{

		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter number1: ");
		    int num1 = sc.nextInt();

		    System.out.print("Enter number2: ");
		    int num2 = sc.nextInt();

		    int result = num1/num2;

		    System.out.println(num1+" divide by "+num2+" is "+result);

		}   
		catch(ArithmeticException e){

			// System.out.println(e);
			System.out.println("Can not divide by zero");
		
		}

		System.out.println("Program Ended");
	}
}