package mypack1;

public class Demo2{

	/*  
	  X------------------------------X
	  | commented one are those that | 
	  | can not be accessed cause    |
	  | they are private             |
	  X------------------------------X
	*/

	Demo1 d1 = new Demo1();

	public void showOfDemo2(){

	    System.out.println(d1.a); // -> default
	    // System.out.println(d1.b); // -> private
		System.out.println(d1.c);
		System.out.println(d1.d); // -> protected
	
	}
}