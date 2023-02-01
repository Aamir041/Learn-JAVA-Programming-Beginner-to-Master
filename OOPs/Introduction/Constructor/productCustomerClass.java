class product{
	private double price;
	private String name;
	private int itemNum;
	private int qty;
	

	public product(double prodPrice, String prodName, int prodItemNum, int prodQty){

		setPrice(prodPrice);
		name = prodName;
		setItemNum(prodItemNum);
		setQuantity(prodQty);

	}

	// Getters
	public double getPrice(){
		return price;
	}

	public String getName(){
		return name;
	}

	public int getItemNum(){
		return itemNum;
	}

	public int getQuantity(){
		return qty;
	}

	// Setters  
	public void setPrice(double prodPrice){
		price = prodPrice;
	}

	public void setItemNum(int prodItemNum){
		itemNum = prodItemNum;
	}

	public void setQuantity(int prodQty){
		qty = prodQty;
	}
}

class customer{
	private String custId;
	private String name;
	private String address;
	private String phNum;

	public customer(String customerId, String custName){
		custId=customerId;
		setName(custName);
	}

	public customer(String customerId, String custName, String custAddress, String custPhNum){
		custId=customerId;
		setName(custName);
		setAddress(custAddress);
		setPhNum(custPhNum);
	}

	//Getters
	public String getCustId(){
		return custId;
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

	// Setters

	public void setName(String custName){
		name = custName;
	}

	public void setAddress(String custAddress){
		address = custAddress;
	}

	public void setPhNum(String custPhNum){
		phNum = custPhNum;
	}

}

public class productCustomerClass{
	public static void main(String[] args){
		
		product p1 = new product(413.2,"Tea Bag",2041,50);
		System.out.println("Name: "+p1.getName());
		System.out.println("Price: "+p1.getPrice());
		System.out.println("Item Number: "+p1.getItemNum());
		System.out.println("Quantity: "+p1.getQuantity());

		System.out.println();
		
		customer c1 = new customer("A4F6Y", "Jhon Doe", "Dallas USA", "+16102347961");
		System.out.println("Customer Name: "+c1.getName());
		System.out.println("Customer ID: "+c1.getCustId());
		System.out.println("Customer Address: "+c1.getAddress());
		System.out.println("Customer Phone Number: "+c1.getPhNum());
	}
}