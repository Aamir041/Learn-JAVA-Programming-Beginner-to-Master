public class pattern6{
	public static void main(String[] args){
		int count = 1;
		for(int i = 1; i<=5; i++){
		    for(int j = 1; j<=i; j++){
		    	System.out.printf("%d ",count);
		    	count++;
		    }
		    System.out.println();
		
		}
	}
}