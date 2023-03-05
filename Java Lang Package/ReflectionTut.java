import java.lang.reflect.*;;

public class ReflectionTut{
	
	class My{

		int a;
		public int b;
		private int c;
		protected int d;

		My() {}
		My(int x, int y) { }

		public void meth1() { }
		public int meth2() { return 0; }


	}

	public static void main(String[] args) {
		
		Class c = My.class;

		System.out.println("All Feilds in My Class");
		
		Field[] fields = c.getDeclaredFields();
		for(Field f: fields){
			System.out.println(f);
		}
		System.out.println();

		System.out.println("All Constructors in My Class");
		Constructor[] cnts = c.getConstructors();
		for(Constructor ct: cnts){
			System.out.println(ct);
		}
		System.out.println();

		System.out.println("All Methods in My Class");
		Method[] meths = c.getMethods();
		for(Method mth: meths){
			System.out.println(mth);
		}

	}
}