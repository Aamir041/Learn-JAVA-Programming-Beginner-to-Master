public class EnumTut{
	
	enum Dept{
		CS("Jhon", "A Block"),ME("Germain", "B Block"),CIVIL("Candice", "C Block"),
		ECE("Gandhi", "D Block"),BIO("Bhapkar", "E Block");

		String head;
		String location;
		
		Dept(String head, String location){
			
			this.head = head;
			this.location = location;

		}

		public void display(){
			System.out.println("Welcome to "+ this.name());
		}

		
		public String getHead(){
			return head;
		}

		public String getLoc(){
			return location;
		}

	}


	public static void main(String[] args) {

		// listing all identifiers in enum Dept
		
    /*
		Dept[] valAll = Dept.values();

		for(Dept d : valAll)
		    System.out.println(d.name());
	*/

		Dept d = Dept.CS;
		
		/*
		switch(d){
		    case CS: System.out.println("Welcome to "+ d.name());
		             break;
		    case CIVIL : System.out.println("Welcome to "+ d.name());
		             break;
		    case ECE: System.out.println("Welcome to "+ d.name());
		             break;
		    case ME: System.out.println("Welcome to "+ d.name());
		             break;
		    case BIO : System.out.println("Welcome to "+ d.name());
		             break;               
		}
		*/

		d.display();
		System.out.println("Head: "+d.getHead());
		System.out.println("Location: "+d.getLoc());


	}

}