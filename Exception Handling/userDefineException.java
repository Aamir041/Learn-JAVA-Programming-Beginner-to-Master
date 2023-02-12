class lowBalanceException extends Exception{
	
	// Exception is inbuilt class in java
	// @Override
	public String toString(){
		return "You have less balance cannot withdraw";
	}

}

public class userDefineException{

	static void fxn1(int requiredBalance,int currentBalance){

		try{

			if(currentBalance < requiredBalance){
				throw new lowBalanceException();
			}
			else{
				System.out.println("No exception money withdrawn.");
			}
		}
		catch(lowBalanceException e){
	    	System.out.println(e);
	    }		
	}

	
	public static void main(String[] args) {
	    int requiredBalance = 4000;
	    int currentBalance = 4950;
	    
	    fxn1(requiredBalance, currentBalance);
	    
	}
}