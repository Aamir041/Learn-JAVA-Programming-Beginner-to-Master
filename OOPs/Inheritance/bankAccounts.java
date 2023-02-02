class account{
	private String accountNum;
	private double balance;
	private String name;
	private String address;
	private String phNum;
	private String dob;

	public account(){

	}

	public account(String accountNum, double balance, String name, String address, String phNum, String dob){
		setAccNum(accountNum); 
		setBalance(balance); 
		setName(name); 
		setAddress(address); 
		setPhNum(phNum); 
		setDOB(dob);
	}

	// getters
	public String getAccNum(){
		return accountNum;
	}

	public double getBalance(){
		return balance;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getPhNum(){
		return phNum;
	}

	public String getDOB(){
		return dob;
	}

	// setters

	public void setAccNum(String accountNum){
		this.accountNum = accountNum;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setPhNum(String phNum){
		this.phNum = phNum;
	}

	public void setDOB(String dob){
		this.dob = dob;
	}

	public String toString(){
		return "\nName: " + name + "\nAccount No: " + accountNum + "\nDOB: " + dob + "\nAddress: " + address + "\nPh Num: "+ phNum + "\nBalance: " + balance;
	}
}

class savingAccount extends account{
	
	public void deposit(double sum){
	    
	    double currentBalance = getBalance();
	    setBalance((currentBalance+sum));

	}

	public void withdraw(double sum){
	    
	    double currentBalance = getBalance();

	    if(sum < currentBalance){
	    	setBalance((currentBalance-sum));
	    }
	    else{
	    	setBalance(currentBalance);
	    }

	}


}

class loanAccount extends account{
	
	public void payEMI(double emi){
		double currentBalance = getBalance();
		setBalance((currentBalance - emi));
	}

}

public class bankAccounts{
	public static void main(String[] args){
		
		savingAccount Jhon_SAC = new savingAccount();

		Jhon_SAC.setAccNum("ACNUM-561");
		Jhon_SAC.setBalance(1000);
		Jhon_SAC.setName("Jhon Doe");
		Jhon_SAC.setAddress("Freudsland, Ohio");
		Jhon_SAC.setPhNum("+16102347852");
		Jhon_SAC.setDOB("04-08-1996");
		
		System.out.println();
		System.out.println(Jhon_SAC.toString());
		
		Jhon_SAC.deposit(200);
		System.out.println(Jhon_SAC.toString());

		Jhon_SAC.withdraw(100);
		System.out.println(Jhon_SAC.toString());

		loanAccount Mary_LAC = new loanAccount();

		Mary_LAC.setAccNum("ACNUM-565");
		Mary_LAC.setBalance(5000);
		Mary_LAC.setName("Mary Goldstein");
		Mary_LAC.setAddress("Long Island, New York");
		Mary_LAC.setPhNum("+14844458736");
		Mary_LAC.setDOB("12-03-1995");
		
		System.out.println();
		System.out.println(Mary_LAC.toString());
		
		Mary_LAC.payEMI(200);
		System.out.println(Mary_LAC.toString());


	}
}