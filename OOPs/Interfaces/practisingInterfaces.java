interface test{
	void meth1();
	void meth2();
}

class class1 implements test{
	
	@Override
	public void meth1(){
		System.out.println("Method 1");
	}

	@Override
	public void meth2(){
	    System.out.println("Method 2");	
	}

	public void meth3(){
	    System.out.println("Method 3");	
	}
}

public class practisingInterfaces{
	public static void main(String[] args) {
		test t1 =  new class1();
		t1.meth1();
		t1.meth2();
		// t1.meth3();
	}
}