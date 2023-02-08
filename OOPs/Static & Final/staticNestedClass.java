class Test{
	static int x = 10;
	int y = 90;

	static class innerTest{
		void display(){
			System.out.println("Value of x : "+x);
			// System.out.println("Value of y : "+y); // -> will giver error
		}
	}
}

public class staticNestedClass{
	public static void main(String[] args) {
		// calling innerTest class without outer class Test
		Test.innerTest in1 = new Test.innerTest();
		in1.display(); 
	}
}