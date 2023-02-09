package mypack1;


// Subclass of Demo1
public class Demo3 extends Demo1{
	/*  
	  X------------------------------X
	  | commented one are those that | 
	  | can not be accessed cause    |
	  | they are private             |
	  X------------------------------X
	*/

	public void showOfDemo3(){

	    System.out.println(a); // -> default
	    // System.out.println(b); // -> private
		System.out.println(c);
		System.out.println(d); // -> protected
	
	}

}