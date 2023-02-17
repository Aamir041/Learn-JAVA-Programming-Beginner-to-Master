class ATM {

    synchronized public void checkBalance(String customerName, int amount) {
        System.out.println("Checking...");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(customerName + ", your balance is " + amount + " Rs.");
    }

    synchronized public void withDrawMoney(int amount, int withDrawAmount) {
        System.out.println("Processing Request...");
        
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        if (amount > withDrawAmount) {
            System.out.println(withDrawAmount + " have been withdrawn.\n");
        } 
        else {
            System.out.println("Balance Insufficient!\n");
        }

    }
}

class Customer extends Thread{

    ATM myAtm;
    String cutomerName;
    int amount;

    Customer(String customerName, int amount,ATM myAtm) {
        this.cutomerName = customerName;
        this.amount = amount;
        this.myAtm = myAtm;
    }

    
    void useAtm(ATM myAtm, String customerName, int amount, int withDrawAmount) {
        myAtm.checkBalance(customerName, amount);
        myAtm.withDrawMoney(amount, withDrawAmount);
    }

    @Override
    public void run(){
        useAtm(myAtm, cutomerName, amount, 5000);
    }

}

public class Main {
    public static void main(String[] args) {
        
        ATM myAtm = new ATM();
        Customer customer1 = new Customer("Tyerd", 6000, myAtm);
        Customer customer2 = new Customer("Zxyxx", 3000, myAtm);
        
        customer1.start();
        customer2.start();

    }
}
