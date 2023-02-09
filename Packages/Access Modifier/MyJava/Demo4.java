package mypack2;

import mypack1.Demo1;

// SUBCLASS of Demo1
public class Demo4 extends Demo1{

	/*  
	  X------------------------------X
	  | commented one are those that | 
	  | can not be accessed cause    |
	  | they are private and default |
	  X------------------------------X
	*/

	public void showOfDemo4(){

	    // System.out.println(a); // -> default
	    // System.out.println(b); // -> private
		System.out.println(c);
		System.out.println(d); // -> protected
	
	}

}