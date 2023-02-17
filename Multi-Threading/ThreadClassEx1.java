class Test extends Thread{
	public void run(){
		for(;;){
			System.out.println("Test Thread");
		}
	}
}

public class ThreadClassEx1{
	public static void main(String[] args){
		Test t1 = new Test();
		t1.start();
		for(;;){
		    System.out.println("Main Thread");	
		}
	}
}
