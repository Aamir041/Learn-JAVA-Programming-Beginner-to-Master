import java.util.*;

public class menuDrivenProgramClac{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		String operation;
		int num1,num2;
		int result;

        System.out.println("\n>------------------------------<");
		System.out.println("|            MENU              |");
		System.out.println(">------------------------------<");
		System.out.println("| Enter ADD for Addition       |");
		System.out.println("| Enter SUB for Subtraction    |");
		System.out.println("| Enter MUL for Multiplication |");
		System.out.println("| Enter DIV for Division       |");
		System.out.println(">------------------------------<\n");
		System.out.print("Enter : ");
		operation = in.next();

		System.out.print("Enter number 1: ");
		num1 = in.nextInt();

		System.out.print("Enter number 2: ");
		num2 = in.nextInt();		

		switch(operation.toLowerCase()){
		case "add": result = num1 + num2;
			        System.out.println("Addtion result : "+ result);
			        break;
		case "sub": result = num1 - num2;
			        System.out.println("Subtraction result : "+ result);
			        break;
		case "mul": result = num1 * num2;
			        System.out.println("Multiplication result : "+ result);
			        break;
		case "div": result = num1 / num2;
			        System.out.println("Division result : "+ result);
			        break;
        default : System.out.println("No such operation available.");			        			        			        			        
		}
		System.out.println();


	}
}