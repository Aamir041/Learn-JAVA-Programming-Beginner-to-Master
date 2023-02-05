abstract class Super{
	public Super(){
		System.out.println("This is Super Class");
	}

	public void meth1(){
		System.out.println("This is meth1");
	}

	abstract void meth2();
}

class Sub extends Super{
	Sub(){
		System.out.println("This is Sub Class");
	}

	@Override
	void meth2(){
		System.out.println("This is Overrided meth2");
	}
}

public class Example1{
	public static void main(String[] args){
		// Super s1 = new Super(); -> this is not possible
		Super s1;  // this is possible
		s1 = new Sub(); // this is possible
		Sub sub1 = new Sub(); // subclas is a concerete class;
	}
}