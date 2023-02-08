class Test{
	final String name="Aamir";
	// final String addr;
	static final String addr;
	final String college;

	static{
		addr = "India";
	}
	Test(){
		college="MIT ADT";
		// name="Aamir Saudagar" // will give a error
	}

	final void meth1(){
		System.out.println("I can not be over-rided");
	}
}

class Temp extends Test{
	
	// overridden method is final
	// void meth1(){
	//     System.out.println("I will giver ERROR!");	
	// }
	
	void meth2(){
	    System.out.println("I will run happily");	
	}
}

public class finalVarNmeths{
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.name);
		System.out.println(t1.addr);
		System.out.println(t1.college);

		Temp tmp1 = new Temp();
		System.out.println("Inherited: "+tmp1.name);
		System.out.println("Inherited: "+tmp1.addr);
		System.out.println("Inherited: "+tmp1.college);
		tmp1.meth1();
	}
}