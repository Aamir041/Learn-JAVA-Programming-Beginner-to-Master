class Test{
	static int x = 10;
	int y=9;
}

public class staticMembers{
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println("t1-y: "+t1.y);
		System.out.println("t2-y: "+t2.y);
		System.out.println("t1-x: "+t1.x);
		System.out.println("t2-x: "+t2.x);
		t1.x = 7; // static members are shared by objects
		t1.y=8;
		System.out.println("t1-y: "+t1.y);
		System.out.println("t2-y: "+t2.y);
		System.out.println("t1-x: "+t1.x);
		System.out.println("t2-x: "+t2.x);

	}
}