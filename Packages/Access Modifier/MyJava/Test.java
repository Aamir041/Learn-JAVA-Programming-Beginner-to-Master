import mypack1.Demo1;

public class Test{
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		d1.display();
		
		/*  
		
		  X------------------------------X
		  | commented one are those that | 
		  | can not be accessed cause    |
	      | different package and NOT    |
	      | a sub class                  |
	      X------------------------------X

	    */

		// System.out.println(d1.a); // -> default
		// System.out.println(d1.b); // -> private
		System.out.println(d1.c);
		// System.out.println(d1.d); // -> protected
	}
}