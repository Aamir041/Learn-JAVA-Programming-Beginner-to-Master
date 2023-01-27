public class pattern11{
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

// lower part
		for(int i = 3; i>=0; i--){
			
			for(int j = 4; j>=1; j--){
				
				if(j > i){
					System.out.print("  ");
				}

				else if(j <= i){
				    System.out.print("* ");	
				}

			}

			System.out.print("*");

			for(int j = 1; j<=4; j++){
				
				if(i>=j){
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