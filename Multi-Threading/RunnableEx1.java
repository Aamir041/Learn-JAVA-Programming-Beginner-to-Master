class Test implements Runnable{
	public void run(){
		
		for(;;){
			System.out.println("\tThread's Call");
		}

	}
}

public class RunnableEx1{
	public static void main(String[] args) {
		Test m = new Test();
		Thread t1 = new Thread(m);
		t1.start();
		
		for(;;){
			System.out.println("Main's Call");
		}	
	}
}