interface MyLambda{
		public int add(int x, int y);
}

public class NoReturn{

	public static void main(String[] args) {

		MyLambda m = (a,b)->a+b;
		System.out.println(m.add(10,10));

	}
}