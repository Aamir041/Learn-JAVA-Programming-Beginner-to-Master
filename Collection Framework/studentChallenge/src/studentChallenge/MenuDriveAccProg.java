package studentChallenge;

import java.util.*;

class Account{

	static String PREFIX_ACC = "ACCNUM-";
	static int accCount = 0;

	private String AccNo;
	private String Name;
	private int Balance;

	public Account(String Name, int Balance){
		this.AccNo = PREFIX_ACC + ++accCount;
		this.Name = Name;
		this.Balance = Balance;
	}

	public String getAccNo(){
		return AccNo;
	}

	public String getName(){
		return Name;
	}

	
	public int getBalance(){
		return Balance;
	}
	
	public String toString() {
		return "\nAccount Number: " + AccNo + "\nName: "+Name+"\nBalance: "+Balance;
	}

}




public class MenuDriveAccProg{
	
	public static void main(String[] args) {
		
		HashMap<String, Account> accMap = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		int choice = 0;

		while(!exit){
			System.out.println("\nEnter Operation Number: ");
			System.out.println("1 - Create Account");
			System.out.println("2 - Delete Account");
			System.out.println("3 - View Account");
			System.out.println("4 - View All Account");
			System.out.println("5 - Exit Account\n");
			System.out.print("Enter Op Num: ");
			choice = sc.nextInt();

			switch(choice){

				case 1: createAccount(accMap);
				        break;
				
				case 2: deleteAccount(accMap);
				        break;

				case 3: viewOne(accMap);
				        break;
				
				case 4: viewAll(accMap);
				        break;

				case 5: exit = true;
				        System.out.println("\nProgram Treminated!");
				        break;

				default : System.out.println("Wrong Operation Number!");
				          break;

			}

		}

	}

	static void createAccount(HashMap<String,Account> accMap){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Name: ");

		StringBuffer Name = new StringBuffer(sc.nextLine());

		System.out.print("Enter Balance: ");		
		int Balance = sc.nextInt();

		Account acc = new Account(Name.toString(),Balance);

		String AccNo = acc.getAccNo();

		accMap.put(AccNo,acc);
		
		

	}

	static void deleteAccount(HashMap<String,Account> accMap){
		
		if(accMap.size() > 0) {

			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter Account Number to delete: ");
			String  AccNo = sc.next();
			
			if(accMap.containsKey(AccNo)) {
				accMap.remove(AccNo);
				System.out.println("Account Number "+ AccNo + " Removed.");
			}
			else {
				System.out.println("Enter Valid Account Number!");
			}
			
			
		}
		
		else {
			System.out.println("\nNO BANK ACCOUNTS IN DATABASE!");
		}

		
	}

	static void viewOne(HashMap<String,Account> accMap){
		
		if(accMap.size()>0) {
			Scanner sc = new Scanner (System.in);		;
			System.out.print("\nEnter Account Number: ");
			String AccNo = sc.next();
			
			if(accMap.containsKey(AccNo)) {
				Account acc = accMap.get(AccNo);
				System.out.println(acc);
			}
			else {
				System.out.println("Invalid Bank Account Number!");
			}
			
			
		}
		else {
			System.out.println("\nNO BANK ACCOUNTS IN DATABASE!");
		}
		
	}

	static void viewAll(HashMap<String,Account> accMap){
		
		if(accMap.size() > 0) {
			for(Account acc : accMap.values()) {
				System.out.println(acc);
			}
		}
		else {
			System.out.println("\nNO BANK ACCOUNTS IN DATABASE!");
		}
		
		
	}


}
