interface member{
	void callback();
}

class store{
	member[] mem = new member[100]; // 100 reference created here
	int count = 0;

	void register(member m){
		mem[count] = m;
		count++;
		//  above two lines can be written as 
		// mem[count++] = m;
	}

	void invite(){
		for(int i = 0; i<count; i++){
			mem[i].callback();
		}
	}

}

class customer implements member{
	public String name;
	customer(String name){
		this.name = name;
	}
	public void callback(){
		System.out.println("Invitation send to " + name);
	}
}


public class StoreCallBack{
	public static void main(String[] args) {
		store s = new store();
		
		customer c1 = new customer("Aamir");
		customer c2 = new customer("Owais");
		
		s.register(c1);
		s.register(c2);

		s.invite();
	}
}