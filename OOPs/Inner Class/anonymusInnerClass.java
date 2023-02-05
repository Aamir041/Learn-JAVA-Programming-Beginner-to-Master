interface anonClass{
	void display();
}

class outer{
	
	public void meth1(){
		
		anonClass anon = new anonClass(){
			public void display(){
				System.out.println("I am created at runtime");
			}
		}; 

		anon.display();
	}

}

public class anonymusInnerClass{
	public static void main(String[] args) {
		outer o = new outer();
		o.meth1();
	}
}