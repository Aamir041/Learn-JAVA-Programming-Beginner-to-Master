public class add{
	public static void main(String[] args){
		double sum = 0;
		for(String num : args){
			sum = sum 	+ Double.parseDouble(num);
		}

		System.out.println("Total Sum: "+sum);
	}
}