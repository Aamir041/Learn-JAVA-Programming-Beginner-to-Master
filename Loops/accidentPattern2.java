public class accidentPattern2{
	public static void main(String[] args){
		
		for(int i = 0; i<=4; i++){
			
			for(int j = 4; j>=1; j--){
				
				if(i >= j){
					System.out.print("* ");
				}

				else{
				    System.out.print("  ");	
				}

			}

			System.out.print("*");

			for(int j = 1; j<=4; j++){
				
				if(j<=i){
					System.out.print(" *");
				}
				
				else{
					System.out.print("  ");
				}
			}

			System.out.println();

		}

		for(int i = 0; i<=4; i++){
			
			for(int j = 4; j>=1; j--){
				
				if(i <= j){
					System.out.print("* ");
				}

				else{
				    System.out.print("  ");	
				}

			}

			System.out.print("*");

			for(int j = 1; j<=4; j++){
				
				if(j>=i){
					System.out.print(" *");
				}
				
				else{
					System.out.print("  ");
				}
			}

			System.out.println();

		}

	}
}