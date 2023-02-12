public class unCheckException{

	static void meth2(){
		try{
		    System.out.println(10/0); // no need of try catch will throw exception any way	
		}
		catch (Exception e){
			// e.printStackTrace(); --> not recomended to use
			// System.out.println(e); // -> e.toString() gets called automatically
			System.out.println(e.getMessage());

		}
		
	}

	static void meth1(){
		meth2();
	}

	public static void main(String[] args) {
		meth1();
	}
}