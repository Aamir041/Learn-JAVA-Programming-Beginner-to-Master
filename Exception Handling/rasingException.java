import java.util.Scanner;

class NegativeDimensionException extends Exception{
	
	@Override
	public String toString(){
	    return "Dimensions cannot be negative";	
	}
	
}



public class rasingException{
	
	static int area(int l, int b) throws NegativeDimensionException{
		
		if(l<0 || b<0){
			throw new NegativeDimensionException();
		}
		
		int ans = l*b;
		
		return ans;
	}

	static void calculate(Scanner sc){

		System.out.print("Enter length: ");
		int l = sc.nextInt();
		
		System.out.print("Enter breadth: ");
		int b = sc.nextInt();

		try{
		    int res = area(l,b);
		    System.out.println(res);	
		}
		catch (NegativeDimensionException e){
			System.out.println(e);
		}
		
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		calculate(sc);


	}
}