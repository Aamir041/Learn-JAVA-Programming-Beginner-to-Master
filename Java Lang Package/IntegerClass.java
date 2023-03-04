public class IntegerClass{
	public static void main(String[] args) {
		int a = 10;
		Integer b = Integer.valueOf(a); // <- boxing (assigning a primitive data type to object )
		System.out.println(b);
		Integer c = a; // <- auto-boxing no need to write Integer.valueOf(a)
		System.out.println(c);

		Integer x = Integer.valueOf("786");

		int y = x; //auto unboxing
		System.out.println(x);

		int z = x.intValue(); //unboxing
		System.out.println(x);

		// String to integer
		String strNum = "420";
		int number = Integer.parseInt(strNum);
		System.out.println(number);

	}
}