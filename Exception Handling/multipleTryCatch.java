import java.util.Scanner;

public class multipleTryCatch{
	public static void main(String[] args) {

		int[] array = new int[5];
		
		try{
			
			for(int i=0; i<5; i++){
				array[i] = i+1*100-45;
			}

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter index : ");
			int index = sc.nextInt();
			System.out.println("At index no. "+index+" "+array[index]+ " is present.");

			System.out.print("Enter number to divide with : ");
			int divider = sc.nextInt();

			int result = array[index]/divider;
			System.out.println(array[index]+" divide by "+divider+" is " +result);

		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Index is out of range.");
		
		}
		
		catch(ArithmeticException e){
				
				System.out.println("Cannot divide with 0");
		
		}
		finally{

			System.out.println("PROGRAM ENDED");
		
		}

	}
}