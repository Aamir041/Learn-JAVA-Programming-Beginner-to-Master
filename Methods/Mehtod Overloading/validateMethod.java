public class validateMethod{
	
	static boolean validate(String name){
		return name.matches("[a-zA-Z\\S]*");
	}

	static boolean validate(int age){
		return age>18;
	}

	public static void main(String[] args){
		System.out.println("Aamir: " + validate("Aamir"));
		System.out.println("B org: " + validate("B org"));
		System.out.println("45: "+validate(45));
		System.out.println("12: "+validate(12));
	}
}